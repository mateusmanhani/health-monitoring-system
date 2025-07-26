package org.healthapp.entity;

import java.time.LocalDateTime;

public class StepCountLog {
    private int id;
    private int steps;
    private LocalDateTime timestamp;
    private int patientId;

    public StepCountLog(int id, int steps, LocalDateTime timestamp, int patientId) {
        this.id = id;
        this.steps = steps;
        this.timestamp = timestamp;
        this.patientId = patientId;
    }

    public StepCountLog() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSteps() {
        return steps;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
