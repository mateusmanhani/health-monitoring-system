package org.healthapp.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class StepCountLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int steps;

    private Timestamp timestamp;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public StepCountLog(int id, int steps, Timestamp timestamp, Patient patient) {
        this.id = id;
        this.steps = steps;
        this.timestamp = timestamp;
        this.patient = patient;
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

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
