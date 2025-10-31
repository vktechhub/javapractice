package com.example.attendance.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.Instant;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
@Table(name = "swipe_event",
       uniqueConstraints = @UniqueConstraint(name = "uq_swipe", columnNames = {"student_id","swipe_time"}))
public class SwipeEvent {
    @Id
    @UuidGenerator
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(name = "student_id", nullable = false, length = 64)
    private String studentId;

    @Column(name = "swipe_time", nullable = false)
    private Instant swipeTime;

    @Column(name = "kafka_partition", nullable = false)
    private Integer kafkaPartition;

    @Column(name = "kafka_offset", nullable = false)
    private Long kafkaOffset;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt = Instant.now();
}
