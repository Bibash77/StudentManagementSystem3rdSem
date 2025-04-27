package org.example.service;

import org.example.entities.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bibash Bogati
 * @created 2025-04-27
 */
public class StudentServiceImpl implements StudentService {

    List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void update(int index, Student student) {

    }

    @Override
    public void printStudentList() {

    }

    @Override
    public List<Student> getStudentList() {
        return students;
    }
}
