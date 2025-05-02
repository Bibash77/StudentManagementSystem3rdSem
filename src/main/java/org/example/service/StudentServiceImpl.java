package org.example.service;

import org.example.entities.Course;
import org.example.entities.Student;
import org.example.service.file.FileService;
import org.example.service.file.FileServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bibash Bogati
 * @created 2025-04-27
 */
public class StudentServiceImpl implements StudentService {
    FileService fileService = new FileServiceImpl();
    List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) {
        students.add(student);
        fileService.writeFile(student.getRollNo().toString(), "Student Added !!!!" + student.getName());
    }

    @Override
    public void remove(int index) {
        students.remove(index);
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

    @Override
    public void enroll(int index, Course course) {
        // find your detail
        Student student = students.get(index);
        // add course in your detail
        student.getCourse().add(course);

        // update your detail in record
        students.set(index, student);


    }
}
