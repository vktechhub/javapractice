package com.example.attendance.repository;

import com.example.attendance.model.StudentAttendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, UUID> {
    Optional<StudentAttendance> findByStudentIdAndAttendanceDate(String studentId, LocalDate attendanceDate);
}
