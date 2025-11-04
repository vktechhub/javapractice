package com.example.attendance.repository;

import com.example.attendance.model.SwipeEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public interface SwipeEventRepository extends JpaRepository<SwipeEvent, UUID> {
    Optional<SwipeEvent> findByStudentIdAndSwipeTime(String studentId, Instant swipeTime);
}
