-- V1__init.sql
CREATE TABLE IF NOT EXISTS student_attendance (
    id UUID PRIMARY KEY,
    student_id VARCHAR(64) NOT NULL,
    attendance_date DATE NOT NULL,
    swipe_in_time TIMESTAMPTZ,
    swipe_out_time TIMESTAMPTZ,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    version INTEGER NOT NULL DEFAULT 0,
    CONSTRAINT uq_student_date UNIQUE (student_id, attendance_date)
);

-- Raw swipe events (for auditing + idempotency)
CREATE TABLE IF NOT EXISTS swipe_event (
    id UUID PRIMARY KEY,
    student_id VARCHAR(64) NOT NULL,
    swipe_time TIMESTAMPTZ NOT NULL,
    kafka_partition INT NOT NULL,
    kafka_offset BIGINT NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    CONSTRAINT uq_swipe UNIQUE (student_id, swipe_time)
);

CREATE INDEX IF NOT EXISTS idx_swipe_student_time ON swipe_event(student_id, swipe_time);

-- Trigger to update updated_at
CREATE OR REPLACE FUNCTION set_updated_at()
RETURNS TRIGGER AS $$
BEGIN
  NEW.updated_at = NOW();
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

DROP TRIGGER IF EXISTS trg_student_attendance_updated_at ON student_attendance;
CREATE TRIGGER trg_student_attendance_updated_at
BEFORE UPDATE ON student_attendance
FOR EACH ROW EXECUTE FUNCTION set_updated_at();
