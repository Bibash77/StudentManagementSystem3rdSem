package org.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bibash Bogati
 * @created 2025-04-27
 */
public class Student implements Serializable {

    private Integer id;
    private String name;
    private Integer rollNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String email;
    private List<Course> course = new ArrayList<>();


    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }


    // one to one

    // one to many

    // many to many


    public Student() {
    }

    public Student(String name, Integer rollNo, String email, Course course) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
