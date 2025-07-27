package org.healthapp.falldetection.repository;

import java.time.LocalDateTime;
import java.util.*;

public class InMemoryFallDetectionRepository {
    private final Map<Integer, List<FallEvent>> fallEvents = new HashMap<>();

    public InMemoryFallDetectionRepository() {
        // Example: Add a mock fall event for patient 1
        addFallEvent(1, new FallEvent(-0.12, 0.09, -9.81, LocalDateTime.parse("2025-06-24T11:00:00")));
    }

    public void addFallEvent(int patientId, FallEvent event) {
        fallEvents.computeIfAbsent(patientId, k -> new ArrayList<>()).add(event);
    }

    public List<FallEvent> getFallEvents(int patientId) {
        return fallEvents.getOrDefault(patientId, Collections.emptyList());
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
