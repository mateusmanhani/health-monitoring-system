-- Insert mock patients
INSERT INTO patient (patient_id, name, surname, age) VALUES
  (1, 'Alice','Johnson', 65),
  (2, 'Bob','Smith',54),
  (3, 'Clara', 'Evans',76);

-- Insert heart rate logs for Alice
INSERT INTO heart_rate_log (patient_id, bpm, timestamp) VALUES
  (1, 72, TIMESTAMP '2025-06-26 10:00:00'),
  (1, 115, TIMESTAMP '2025-06-26 10:05:00'), -- abnormal
  (1, 88, TIMESTAMP '2025-06-26 10:10:00'),
  (1, 75, TIMESTAMP '2025-06-26 10:15:00'),
    (1, 140, TIMESTAMP '2025-06-26 10:20:00'), -- abnormal
    (1, 85, TIMESTAMP '2025-06-26 10:25:00'),
    (1, 78, TIMESTAMP '2025-06-26 10:30:00'),
    (1, 90, TIMESTAMP '2025-06-26 10:35:00');

-- Insert heart rate logs for Bob
INSERT INTO heart_rate_log (patient_id, bpm, timestamp) VALUES
  (2, 60, TIMESTAMP '2025-06-26 10:00:00'),
  (2, 78, TIMESTAMP '2025-06-26 10:07:00'),
  (2, 82, TIMESTAMP '2025-06-26 10:10:00'),
    (2, 88, TIMESTAMP '2025-06-26 10:15:00'),
    (2, 92, TIMESTAMP '2025-06-26 10:20:00'),
    (2, 135, TIMESTAMP '2025-06-26 10:25:00'), -- abnormal
    (2, 76, TIMESTAMP '2025-06-26 10:30:00');

-- Insert heart rate logs for Clara
INSERT INTO heart_rate_log (patient_id, bpm, timestamp) VALUES
  (3, 120, TIMESTAMP '2025-06-26 10:02:00'), -- abnormal
  (3, 110, TIMESTAMP '2025-06-26 10:08:00'),
  (3, 130, TIMESTAMP '2025-06-26 10:10:00'), -- abnormal
    (3, 85, TIMESTAMP '2025-06-26 10:15:00'),
    (3, 145, TIMESTAMP '2025-06-26 10:20:00'), -- abnormal
    (3, 100, TIMESTAMP '2025-06-26 10:25:00'),
    (3, 105, TIMESTAMP '2025-06-26 10:30:00');
