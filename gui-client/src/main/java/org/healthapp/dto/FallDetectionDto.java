package org.healthapp.dto;

public class FallDetectionDto {
    private int patientId;
    private String message;
    private String timestamp;
    private String patientName;

    public FallDetectionDto(int patientId, String message, String timestamp, String patientName) {
        this.patientId = patientId;
        this.message = message;
        this.timestamp = timestamp;
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

