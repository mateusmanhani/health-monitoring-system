package org.healthapp.dto;

public class StepCountDto {
    private int steps;
    private String timestamp;
    private String patientName;

    public StepCountDto() {}

    public StepCountDto(int steps, String timestamp, String patientName) {
        this.steps = steps;
        this.timestamp = timestamp;
        this.patientName = patientName;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
