package models;

public class Student {
    private String id;
    private String name;

    /**
     * Create new Student with given ID and name.
     * @param id the Student ID
     * @param name the Student Name
     */

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the ID no of the student.
     *
     * @return student ID
     */

    public String getId() {

        return id;
    }

    /**
     * Returns the name of the student.
     *
     * @return student name
     */

    public String getName() {

        return name;
    }

    /**
     * Returns student Details in readable format.
     *
     * @return formatted Student string
     */

    public String toString() {

        return "ID : " + id + "  ,  Name : " + name;
    }
}