package com.example.attendance.messaging;

import com.example.attendance.dto.SwipeEventDTO;
import com.example.attendance.service.AttendanceService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
@Slf4j
public class SwipeConsumer {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final AttendanceService attendanceService;
    private final Validator validator;

    @KafkaListener(topics = "${attendance.kafka.topic}", containerFactory = "kafkaListenerContainerFactory")
    public void consume(ConsumerRecord<String, String> record, @Payload String message) {
        try {
            SwipeEventDTO dto = objectMapper.readValue(message, SwipeEventDTO.class);
            Set<ConstraintViolation<SwipeEventDTO>> violations = validator.validate(dto);
            if (!violations.isEmpty()) {
                log.warn("Validation failed for message at offset {}: {}", record.offset(), violations);
                return;
            }
            attendanceService.processSwipe(dto, record.partition(), record.offset());
        } catch (Exception e) {
            log.error("Failed to process message at offset {}: {}", record.offset(), e.getMessage(), e);
            // Let the container continue; message remains committed only if listener completes.
            // For poison pills, consider dead-letter topic in a real setup.
        }
    }
}
