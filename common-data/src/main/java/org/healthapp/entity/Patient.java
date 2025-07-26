package org.healthapp.entity;

public class Patient {
    private int patientId;
    private String name;
    private String surname;
    private int age;

    // Constructor
    public Patient(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    // No Args Constructor
    public Patient() {
    }

    //  Getters and Setters
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
