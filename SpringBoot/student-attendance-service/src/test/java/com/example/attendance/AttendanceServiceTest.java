package com.example.attendance;

import com.example.attendance.dto.SwipeEventDTO;
import com.example.attendance.model.StudentAttendance;
import com.example.attendance.repository.StudentAttendanceRepository;
import com.example.attendance.service.AttendanceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Import(AttendanceService.class)
class AttendanceServiceTest {

    @Autowired
    AttendanceService service;

    @Autowired
    StudentAttendanceRepository repo;

    @Test
    void pairsInAndOut() {
        String student = "S1";
        Instant in = Instant.parse("2025-10-31T03:30:00Z");
        Instant out = Instant.parse("2025-10-31T10:30:00Z");
        service.processSwipe(new SwipeEventDTO(student, in.toString()), 0, 1L);
        service.processSwipe(new SwipeEventDTO(student, out.toString()), 0, 2L);

        LocalDate date = in.atZone(ZoneId.of("Asia/Kolkata")).toLocalDate();
        StudentAttendance sa = repo.findByStudentIdAndAttendanceDate(student, date).orElseThrow();
        assertThat(sa.getSwipeInTime()).isEqualTo(in);
        assertThat(sa.getSwipeOutTime()).isEqualTo(out);
    }
}
