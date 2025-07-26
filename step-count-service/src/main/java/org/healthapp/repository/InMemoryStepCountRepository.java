package org.healthapp.repository;

import org.healthapp.entity.StepCountLog;
import java.time.LocalDateTime;
import java.util.*;

public class InMemoryStepCountRepository {
    private final Map<Integer, List<StepCountLog>> logsByPatient = new HashMap<>();
    private int logId = 1;

    public InMemoryStepCountRepository() {
        // Mock data for 3 patients
        addLog(1, 1000, LocalDateTime.parse("2025-06-26T10:00:00"));
        addLog(1, 1200, LocalDateTime.parse("2025-06-26T12:00:00"));
        addLog(1, 1500, LocalDateTime.parse("2025-06-26T14:00:00"));
        addLog(2, 800, LocalDateTime.parse("2025-06-26T10:00:00"));
        addLog(2, 1100, LocalDateTime.parse("2025-06-26T13:00:00"));
        addLog(3, 500, LocalDateTime.parse("2025-06-26T09:00:00"));
        addLog(3, 900, LocalDateTime.parse("2025-06-26T11:00:00"));
        addLog(3, 1300, LocalDateTime.parse("2025-06-26T15:00:00"));
    }

    public void addLog(int patientId, int steps, LocalDateTime timestamp) {
        StepCountLog log = new StepCountLog(logId++, steps, timestamp, patientId);
        logsByPatient.computeIfAbsent(patientId, k -> new ArrayList<>()).add(log);
    }

    public List<StepCountLog> getLogsForPatient(int patientId) {
        List<StepCountLog> logs = logsByPatient.getOrDefault(patientId, Collections.emptyList());
        logs.sort(Comparator.comparing(StepCountLog::getTimestamp));
        return logs;
    }

    public StepCountLog getLatestLogForPatient(int patientId) {
        List<StepCountLog> logs = getLogsForPatient(patientId);
        return logs.isEmpty() ? null : logs.get(logs.size() - 1);
    }
}

