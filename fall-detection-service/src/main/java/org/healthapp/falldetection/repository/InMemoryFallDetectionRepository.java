package org.healthapp.falldetection.repository;

import org.healthapp.entity.Patient;
import java.time.LocalDateTime;
import java.util.*;

public class InMemoryFallDetectionRepository {
    private final Map<Integer, Patient> patients = new HashMap<>();
    private final Map<Integer, List<FallEvent>> fallEvents = new HashMap<>();

    public InMemoryFallDetectionRepository() {
        // Populate mock patients (same as heart-rate-service)
        Patient alice = new Patient("Alice", "Johnson", 65);
        alice.setPatientId(1);
        Patient bob = new Patient("Bob", "Smith", 54);
        bob.setPatientId(2);
        Patient clara = new Patient("Clara", "Evans", 76);
        clara.setPatientId(3);
        patients.put(1, alice);
        patients.put(2, bob);
        patients.put(3, clara);

        // Populate mock fall events
        fallEvents.put(1, Arrays.asList(
            new FallEvent(-0.12, 0.09, -9.81, LocalDateTime.parse("2025-06-24T11:00:00")),
            new FallEvent(0.05, 0.02, -9.70, LocalDateTime.parse("2025-06-25T09:15:00"))
        ));
        fallEvents.put(2, Arrays.asList(
            new FallEvent(0.01, 0.01, -9.60, LocalDateTime.parse("2025-06-24T13:30:00"))
        ));
        fallEvents.put(3, Arrays.asList(
            new FallEvent(-0.20, 0.10, -9.85, LocalDateTime.parse("2025-06-26T08:45:00")),
            new FallEvent(0.00, 0.00, -9.80, LocalDateTime.parse("2025-06-27T10:00:00"))
        ));
    }

    public Collection<Patient> getAllPatients() {
        return patients.values();
    }

    public Patient getPatientById(int id) {
        return patients.get(id);
    }

    public List<FallEvent> getFallEvents(int patientId) {
        return fallEvents.getOrDefault(patientId, Collections.emptyList());
    }

    public FallEvent getLatestFallEvent(int patientId) {
        List<FallEvent> events = fallEvents.get(patientId);
        if (events == null || events.isEmpty()) return null;
        return events.get(events.size() - 1);
    }

    public void addFallEvent(int patientId, FallEvent event) {
        fallEvents.computeIfAbsent(patientId, k -> new ArrayList<>()).add(event);
    }

    public static class FallEvent {
        private final double accelX;
        private final double accelY;
        private final double accelZ;
        private final LocalDateTime timestamp;
        public FallEvent(double accelX, double accelY, double accelZ, LocalDateTime timestamp) {
            this.accelX = accelX;
            this.accelY = accelY;
            this.accelZ = accelZ;
            this.timestamp = timestamp;
        }
        public double getAccelX() { return accelX; }
        public double getAccelY() { return accelY; }
        public double getAccelZ() { return accelZ; }
        public LocalDateTime getTimestamp() { return timestamp; }
    }
}
