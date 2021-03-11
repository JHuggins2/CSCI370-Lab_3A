package com.example.advancedadapterdemo;

public class Student {
    private String firstName;
    private String lastName;
    private String major;

    public Student(String firstName, String lastName, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }
}
