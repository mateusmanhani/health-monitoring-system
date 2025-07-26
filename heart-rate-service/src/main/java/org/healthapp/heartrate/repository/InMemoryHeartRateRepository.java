package org.healthapp.heartrate.repository;

import org.healthapp.entity.Patient;
import java.time.LocalDateTime;
import java.util.*;

public class InMemoryHeartRateRepository {
    private final Map<Integer, Patient> patients = new HashMap<>();
    private final Map<Integer, List<HeartRateLog>> heartRateLogs = new HashMap<>();

    public InMemoryHeartRateRepository() {
        // Populate mock patients
        Patient alice = new Patient("Alice", "Johnson", 65);
        alice.setPatientId(1);
        Patient bob = new Patient("Bob", "Smith", 54);
        bob.setPatientId(2);
        Patient clara = new Patient("Clara", "Evans", 76);
        clara.setPatientId(3);
        patients.put(1, alice);
        patients.put(2, bob);
        patients.put(3, clara);

        // Populate mock heart rate logs
        heartRateLogs.put(1, Arrays.asList(
            new HeartRateLog(72, LocalDateTime.parse("2025-06-26T10:00:00")),
            new HeartRateLog(115, LocalDateTime.parse("2025-06-26T10:05:00")),
            new HeartRateLog(88, LocalDateTime.parse("2025-06-26T10:10:00")),
            new HeartRateLog(75, LocalDateTime.parse("2025-06-26T10:15:00")),
            new HeartRateLog(140, LocalDateTime.parse("2025-06-26T10:20:00")),
            new HeartRateLog(85, LocalDateTime.parse("2025-06-26T10:25:00")),
            new HeartRateLog(78, LocalDateTime.parse("2025-06-26T10:30:00")),
            new HeartRateLog(90, LocalDateTime.parse("2025-06-26T10:35:00"))
        ));
        heartRateLogs.put(2, Arrays.asList(
            new HeartRateLog(60, LocalDateTime.parse("2025-06-26T10:00:00")),
            new HeartRateLog(78, LocalDateTime.parse("2025-06-26T10:07:00")),
            new HeartRateLog(82, LocalDateTime.parse("2025-06-26T10:10:00")),
            new HeartRateLog(88, LocalDateTime.parse("2025-06-26T10:15:00")),
            new HeartRateLog(92, LocalDateTime.parse("2025-06-26T10:20:00")),
            new HeartRateLog(135, LocalDateTime.parse("2025-06-26T10:25:00")),
            new HeartRateLog(76, LocalDateTime.parse("2025-06-26T10:30:00"))
        ));
        heartRateLogs.put(3, Arrays.asList(
            new HeartRateLog(120, LocalDateTime.parse("2025-06-26T10:02:00")),
            new HeartRateLog(110, LocalDateTime.parse("2025-06-26T10:08:00")),
            new HeartRateLog(130, LocalDateTime.parse("2025-06-26T10:10:00")),
            new HeartRateLog(85, LocalDateTime.parse("2025-06-26T10:15:00")),
            new HeartRateLog(145, LocalDateTime.parse("2025-06-26T10:20:00")),
            new HeartRateLog(100, LocalDateTime.parse("2025-06-26T10:25:00")),
            new HeartRateLog(105, LocalDateTime.parse("2025-06-26T10:30:00"))
        ));
    }

    public Collection<Patient> getAllPatients() {
        return patients.values();
    }

    public Patient getPatientById(int id) {
        return patients.get(id);
    }

    public List<HeartRateLog> getHeartRateLogs(int patientId) {
        return heartRateLogs.getOrDefault(patientId, Collections.emptyList());
    }

    public HeartRateLog getCurrentHeartRate(int patientId) {
        List<HeartRateLog> logs = heartRateLogs.get(patientId);
        if (logs == null || logs.isEmpty()) return null;
        return logs.get(logs.size() - 1);
    }

    public static class HeartRateLog {
        private final int bpm;
        private final LocalDateTime timestamp;
        public HeartRateLog(int bpm, LocalDateTime timestamp) {
            this.bpm = bpm;
            this.timestamp = timestamp;
        }
        public int getBpm() { return bpm; }
        public LocalDateTime getTimestamp() { return timestamp; }
    }
}

