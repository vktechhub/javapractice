# Student Attendance Service

Spring Boot microservice that consumes swipe events from Kafka topic `student.attendence`
and updates a PostgreSQL table `student_attendance` with `swipe_in_time` and `swipe_out_time`.

## Event format

Kafka value (JSON):
```json
{
  "studentId": "S1001",
  "swipeTimeIso": "2025-10-31T03:30:00Z"
}
```
- Key is optional but recommended to be the `studentId`.
- `swipeTimeIso` must be an ISO-8601 UTC instant.

## How pairing works

- Records are grouped by `(studentId, attendanceDate)` where `attendanceDate` is derived in `Asia/Kolkata` timezone.
- First swipe of the day → `swipe_in_time`.
- Second swipe of the day → `swipe_out_time`.
- Extra swipes within the day: we keep the earliest as IN and latest as OUT.
- Late/out-of-order messages are handled; OUT will never be set earlier than IN.
- Idempotency: duplicate swipes (same `studentId` + `swipeTime`) are ignored via a DB unique constraint and check.

## Run locally (Docker)

```bash
docker compose up -d --build
# Create topic (optional; container may auto-create)
docker exec -it $(docker ps -qf name=kafka) kafka-topics --create --topic student.attendence --bootstrap-server localhost:9092
```

## Produce a test message

```bash
docker exec -it $(docker ps -qf name=kafka) kafka-console-producer --broker-list localhost:9092 --topic student.attendence
>{"studentId":"S1","swipeTimeIso":"2025-10-31T03:30:00Z"}
>{"studentId":"S1","swipeTimeIso":"2025-10-31T10:30:00Z"}
```

## Query
```
curl http://localhost:8080/api/attendance/S1/2025-10-31
```

## Observability
- Health: `/actuator/health`
- Prometheus metrics: `/actuator/prometheus`

## Production notes
- Configure dead-letter topic for poison messages.
- Tune Kafka concurrency based on partitions.
- Secure DB creds and Kafka auth via secrets.
- Consider exactly-once semantics via transactional outbox if producing downstream.
- Adjust timezone to your institution's policy.
```

