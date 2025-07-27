package org.healthapp.dto;

public class StepCountLogDto {
    private int steps;
    private String timestamp;

    public StepCountLogDto() {}

    public StepCountLogDto(int steps, String timestamp) {
        this.steps = steps;
        this.timestamp = timestamp;
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
}

