package org.healthapp.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "heart_rate_log")
public class HeartRateLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int logId;

    private int patientId;

    private int bpm;


    private Timestamp timestamp;

    // Constructors
    public HeartRateLog(int patient, int bpm, Timestamp timestamp) {
        this.patientId = patient;
        this.bpm = bpm;
        this.timestamp = timestamp;
    }

    public HeartRateLog() {
    }

    //  Getters and Setters
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getPatient() {
        return patientId;
    }

    public void setPatient(int patient) {
        this.patientId = patient;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
