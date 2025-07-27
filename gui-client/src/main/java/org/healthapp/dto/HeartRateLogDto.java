package org.healthapp.dto;

public class HeartRateLogDto {
    private int bpm;
    private String timestamp;

    public HeartRateLogDto() {}

    public HeartRateLogDto(int bpm, String timestamp) {
        this.bpm = bpm;
        this.timestamp = timestamp;
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
}

