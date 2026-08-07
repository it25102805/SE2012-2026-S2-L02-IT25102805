package services;

import models.Student;
import models.Course;


public class EnrollmentManager {

    /**
     * Enrolls a student in a course.
     * @param student Student object
     * @param course Course object
     */

    public void enrollStudent (Student student, Course course){
        if(student == null || course == null) {
            System.out.println("Enrollment failed.");
            return;
        }
        System.out.println("Enrollment Successful.");
        System.out.println(student.getName() + " enrolled in " + course.getTitle());

    }

    /**
     * Searches a student by ID.
     * @param student Student array
     * @param count Number of students
     * @param id Student ID
     * @return Student if found, if not  null
     */

    public Student searchStudentById (Student[] student , int count , String id ){
        for (int i = 0; i < count; i++ ) {
            if (student[i].getId().equalsIgnoreCase(id)){
                return student[i];
            }
        }
        return null;
    }

    /**
     * Sorts students alphabetically by name.
     * @param student Student array
     * @param count Number of students
     */

    public void sortStudentByName(Student[] student , int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count- i - 1; j++) {
                if (student[j].getName().compareToIgnoreCase(student[j + 1].getName()) > 0) {
                    Student temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        System.out.println("Students sorted successful");
    }

    /**
     * Displays all students.
     * @param student Student array
     * @param count Number of students
     */

    public void listStudents(Student[] student , int count ){
        if (count == 0){
            System.out.println("No Student Available");
            return;
        }

        for (int i = 0; i < count; i++){
            System.out.println(student[i]);
        }
    }
}
