package org.healthapp;

public class HeartRateDTO {

    private int bpm;
    private String timestamp;

    public HeartRateDTO(int bpm, String timestamp){
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
