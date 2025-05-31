package com.sagun.records;

public class Student {
    private String name;
    private String id;
    private double gpa;
    private String major;

    public Student(String name, String id, double gpa, String major) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa + ", Major: " + major;
    }
}
