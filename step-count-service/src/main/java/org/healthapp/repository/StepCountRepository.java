package org.healthapp.repository;

import org.healthapp.entity.StepCountLog;

import java.util.ArrayList;
import java.util.List;

public class StepCountRepository {

    private List<StepCountLog> stepCountLogs = new ArrayList<>();

    public List<StepCountLog> findByPatientPatientIdOrderByTimestampAsc(int patientId) {
        // Implement in-memory retrieval and sorting logic here
        return stepCountLogs;
    }

    public StepCountLog findTopByPatientPatientIdOrderByTimestampDesc(int patientId) {
        // Implement in-memory retrieval logic here
        return stepCountLogs.isEmpty() ? null : stepCountLogs.get(stepCountLogs.size() - 1);
    }

    // Add methods to manipulate in-memory data (e.g., add, remove, clear) as needed
}
