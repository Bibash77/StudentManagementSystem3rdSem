package org.example.service;

import org.example.entities.Course;
import org.example.entities.Student;

import java.util.List;

/**
 * @author Bibash Bogati
 * @created 2025-04-27
 */
public interface StudentService {

    // add
    void add(Student student);

    // remove
    void remove(int index);

    // update
    void update(int id, Student student);


    // print
    void printStudentList();

    // get

    List<Student> getStudentList();

    void enroll(int index, Course course);


}
