package org.healthapp;

import org.healthapp.entity.StepCountLog;
import org.healthapp.repository.InMemoryStepCountRepository;
import java.time.LocalDateTime;
import java.util.List;

public class StepCountLogService {
    private final InMemoryStepCountRepository repository = new InMemoryStepCountRepository();

    public void saveStepCount(int patientId, int stepCount) {
        repository.addLog(patientId, stepCount, LocalDateTime.now());
    }

    public StepCountLog getLatest(int patientId) {
        return repository.getLatestLogForPatient(patientId);
    }

    public List<StepCountLog> getHistory(int patientId) {
        return repository.getLogsForPatient(patientId);
    }
}
