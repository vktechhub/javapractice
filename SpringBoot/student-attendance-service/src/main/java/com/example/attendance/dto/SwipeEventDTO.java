package com.example.attendance.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SwipeEventDTO(
        @NotBlank String studentId,
        @NotNull String swipeTimeIso // ISO-8601 e.g., 2025-10-31T09:00:00Z
) {}
