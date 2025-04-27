package org.example;

import org.example.entities.Course;
import org.example.entities.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bibash Bogati
 * @created 2025-04-27
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // construct student
        Student student = new Student();
        student.setName("John");
        student.setRollNo(1);
        student.setEmail("abc@gmail.com");


// construct course
        Course javaCourse = new Course();
        javaCourse.setCourseName("Java");
        javaCourse.setCourseId(1);

        Course pythonCourse = new Course();
        pythonCourse.setCourseName("Python");
        pythonCourse.setCourseId(2);



        List<Course> courseList = new ArrayList<>();
        courseList.add(javaCourse);
        courseList.add(pythonCourse);



        student.setCourse(courseList);

//        student.getCourse().remove(0);

//        courseList.set(0, javaCourse);

        for (Course course1 : student.getCourse()) {

           int index =  courseList.indexOf(course1);
            if(index == 0) {
                course1.setCourseName("Advance Java");
            }

            System.out.println(course1.getCourseName() + " " + course1.getCourseId());
        }




//        ----- update java course



    }
}