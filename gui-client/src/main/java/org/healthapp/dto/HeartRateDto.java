package org.healthapp.dto;

public class HeartRateDto {
    private int bpm;
    private String timestamp;
    private String status;
    private String patientName;

    public HeartRateDto() {}

    public HeartRateDto(int bpm, String timestamp, String status, String patientName) {
        this.bpm = bpm;
        this.timestamp = timestamp;
        this.status = status;
        this.patientName = patientName;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}

