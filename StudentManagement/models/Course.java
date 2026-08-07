package models;

public class Course {
    private String code;
    private String title;

    /**Create New Course
     * @param code the course code.
     * @param title the course tittle.
     */

     public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    /** Return the Course Code
     *
     * @return Course Code
     */

    public String getCode (){

        return code;
    }

    /** Return the Course Tittle
     *
     * @return Course Tittle
     */

    public String getTitle () {

        return title;
    }

    /** Return the formatted Corse code and tittle
     *
     * @return formatted course String
     */

    public String toString () {

        return "Course Code : " + code + " Course tittle : " + title;
    }

}