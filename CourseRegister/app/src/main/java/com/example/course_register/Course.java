package com.example.course_register;

public class Course {

    public int id;
    public String course_code;
    public String name;
    public String description;
    public String professor;

    // Constructor
    public Course(String course_code, int id,String description, String name, String professor) {
        this.id = id;
        this.course_code = course_code;
        this.name = name;
        this.description =description;
        this.professor = professor;

    }


}
