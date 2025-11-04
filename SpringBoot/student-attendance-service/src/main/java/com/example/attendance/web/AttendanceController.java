package com.example.attendance.web;

import com.example.attendance.model.StudentAttendance;
import com.example.attendance.repository.StudentAttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/api/attendance")
@RequiredArgsConstructor
public class AttendanceController {

    private final StudentAttendanceRepository repository;

    @GetMapping("/{studentId}/{date}")
    public ResponseEntity<StudentAttendance> getAttendance(
            @PathVariable String studentId,
            @PathVariable String date) {
        LocalDate d = LocalDate.parse(date);
        Optional<StudentAttendance> result = repository.findByStudentIdAndAttendanceDate(studentId, d);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
