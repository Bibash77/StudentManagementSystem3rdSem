package org.example.service.studentDao;

import org.example.entities.Student;

import java.util.List;

/**
 * @author Bibash Bogati
 * @created 2025-05-09
 */
public interface StudentDaoService {

    // fucntion to get student list
    List<Student> getStudents();

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Student student);

    Student getStudentById(int id);

    List<Student> searchStudentsByName(String studentName);
}
