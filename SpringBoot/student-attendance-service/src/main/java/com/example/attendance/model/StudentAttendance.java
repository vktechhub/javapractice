package com.example.attendance.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
@Table(name = "student_attendance",
       uniqueConstraints = @UniqueConstraint(name = "uq_student_date", columnNames = {"student_id","attendance_date"}))
public class StudentAttendance {
    @Id
    @UuidGenerator
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(name = "student_id", nullable = false, length = 64)
    private String studentId;

    @Column(name = "attendance_date", nullable = false)
    private LocalDate attendanceDate;

    @Column(name = "swipe_in_time")
    private Instant swipeInTime;

    @Column(name = "swipe_out_time")
    private Instant swipeOutTime;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt = Instant.now();

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt = Instant.now();

    @Version
    private Integer version;
}
