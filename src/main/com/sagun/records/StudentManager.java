package com.sagun.records;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, String id, double gpa, String major) {
        students.add(new Student(name, id, gpa, major));
        System.out.println("Student added successfully.\n");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void searchById(String id) {
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                System.out.println(s + "\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    public void deleteById(String id) {
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                students.remove(s);
                System.out.println("Student deleted.\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }
}
