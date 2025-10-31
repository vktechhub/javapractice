package com.example.attendance.service;

import com.example.attendance.dto.SwipeEventDTO;
import com.example.attendance.model.StudentAttendance;
import com.example.attendance.model.SwipeEvent;
import com.example.attendance.repository.StudentAttendanceRepository;
import com.example.attendance.repository.SwipeEventRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AttendanceService {

    private final StudentAttendanceRepository attendanceRepository;
    private final SwipeEventRepository swipeRepository;

    @Transactional
    public void processSwipe(SwipeEventDTO dto, int partition, long offset) {
        Instant swipeInstant = parseIso(dto.swipeTimeIso());
        String studentId = dto.studentId().trim();
        // Idempotency: store raw swipe if not existing
        Optional<SwipeEvent> existing = swipeRepository.findByStudentIdAndSwipeTime(studentId, swipeInstant);
        if (existing.isPresent()) {
            log.info("Duplicate swipe ignored for student={} at {}", studentId, swipeInstant);
            return;
        }
        SwipeEvent swipe = SwipeEvent.builder()
                .studentId(studentId)
                .swipeTime(swipeInstant)
                .kafkaPartition(partition)
                .kafkaOffset(offset)
                .build();
        swipeRepository.save(swipe);

        // Normalize date in the institution's timezone (assume Asia/Kolkata). Adjust as needed.
        ZoneId zone = ZoneId.of("Asia/Kolkata");
        LocalDate attendanceDate = swipeInstant.atZone(zone).toLocalDate();

        StudentAttendance record = attendanceRepository
                .findByStudentIdAndAttendanceDate(studentId, attendanceDate)
                .orElseGet(() -> {
                    StudentAttendance sa = new StudentAttendance();
                    sa.setStudentId(studentId);
                    sa.setAttendanceDate(attendanceDate);
                    return sa;
                });

        if (record.getSwipeInTime() == null) {
            record.setSwipeInTime(swipeInstant);
            attendanceRepository.save(record);
            log.info("Swipe IN recorded for student={} date={} time={}", studentId, attendanceDate, swipeInstant);
        } else if (record.getSwipeOutTime() == null) {
            // Ensure out >= in; if out is earlier due to late-arriving messages, set to max(in, swipe)
            Instant out = swipeInstant.isBefore(record.getSwipeInTime()) ? record.getSwipeInTime() : swipeInstant;
            record.setSwipeOutTime(out);
            attendanceRepository.save(record);
            log.info("Swipe OUT recorded for student={} date={} time={}", studentId, attendanceDate, swipeInstant);
        } else {
            // Already has both in and out; keep earliest IN and latest OUT within same day
            if (swipeInstant.isBefore(record.getSwipeInTime())) {
                record.setSwipeInTime(swipeInstant);
            } else if (swipeInstant.isAfter(record.getSwipeOutTime())) {
                record.setSwipeOutTime(swipeInstant);
            }
            attendanceRepository.save(record);
            log.info("Extra swipe adjusted record for student={} date={}", studentId, attendanceDate);
        }
    }

    private Instant parseIso(String iso) {
        try {
            return Instant.parse(iso);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("swipeTimeIso must be ISO-8601 UTC instant, e.g., 2025-10-31T09:00:00Z");
        }
    }
}
