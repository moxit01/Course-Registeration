package com.example.course_register;

import java.util.ArrayList;

public class CourseList {

    public int id;
    public ArrayList<Course> items;
    public String email;


    public CourseList(int id, ArrayList<Course> items, String email) {
        this.id = id;
        this.items = items;
        this.email = email;
    }

    public CourseList(int id) {
        this.id = id;
    }

}
