package mainapp;

import java.util.Scanner;

import models.Student;
import models.Course;
import services.EnrollmentManager;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EnrollmentManager manager = new EnrollmentManager();
        Student[] students = new Student[100];

        int studentCount = 0;
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Enroll Student");
            System.out.println("3. List Students");
            System.out.println("4. Search Student");
            System.out.println("5. Sort Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    String id = input.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = input.nextLine();
                    students[studentCount] = new Student(id, name);
                    studentCount++;

                    System.out.println("Student added successfully.");
                    break;

                case 2:

                    System.out.print("Enter Student ID: ");
                    String searchId = input.nextLine();
                    Student student = manager.searchStudentById(students, studentCount, searchId);
                    if (student != null) {
                        System.out.print("Enter Course Code: ");
                        String courseCode = input.nextLine();

                        System.out.print("Enter Course Title: ");
                        String courseTitle = input.nextLine();
                        Course course = new Course(courseCode, courseTitle);
                        manager.enrollStudent(student, course);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    manager.listStudents(students, studentCount);
                    break;

                case 4:

                    System.out.print("Enter Student ID to search: ");
                    String findId = input.nextLine();
                    Student foundStudent = manager.searchStudentById(students, studentCount, findId);
                    if (foundStudent != null) {
                        System.out.println("Student Found:");
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    manager.sortStudentByName(students, studentCount);
                    System.out.println("Students sorted successfully.");
                    manager.listStudents(students, studentCount);
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        } while (choice != 6);
        input.close();
    }
}