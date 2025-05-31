package com.sagun.records;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        boolean running = true;

        while (running) {
            System.out.println("---- Student Record System ----");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Major: ");
                    String major = sc.nextLine();
                    sm.addStudent(name, id, gpa, major);
                    break;
                case 2:
                    sm.listStudents();
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    sm.searchById(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    sm.deleteById(sc.nextLine());
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.\n");
            }
        }

        sc.close();
    }
}
