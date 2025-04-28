package org.example;

import org.example.entities.Course;
import org.example.entities.Student;
import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author Bibash Bogati
 * @created 2025-04-27
 */
public class MainClass {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();

        boolean runProgram = true;

        while (runProgram) {
            int choice;
            System.out.println("Enter \n 1 to add \n 2 to remove \n 3 update \n 4 fetch students \n 5 to exit program \n 6 enroll in course");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // take new date from user and add
                    Student student = new Student();

                    System.out.println("Enter student name: ");
                    String name = scanner.next();

                    System.out.println("Enter student roll number: ");
                    Integer rollNo = scanner.nextInt();

                    System.out.println("Enter student email: ");
                    String email = scanner.next();


                    student.setName(name);
                    student.setRollNo(rollNo);
                    student.setEmail(email);

                    studentService.add(student);
                    System.out.println("Student added successfully !!!");
                    break;
                case 2:
                    // g
                    int indexToRemove = 0;
                    studentService.remove(indexToRemove);
                    break;

                case 3:
                    // update students...
                    // ask user index

                    // fetch data for that index and display data

                    // ask user to enter new name and update at that index
                    break;
                case 4:
                    // fetch student
                    // ask index
                    // delete in index
                    List<Student> students = studentService.getStudentList();
                    System.out.println("-----Displaying all students in the list----");
                    for (Student stdData : students) {
                        System.out.println(stdData.getName() + " " + stdData.getRollNo() + " " + stdData.getEmail());

                       if(stdData.getCourse() != null) {
                           for (Course course : stdData.getCourse()) {
                               System.out.println(course.getCourseId() + " " + course.getCourseName());
                           }
                       }
                    }
                    break;
                case 5:
                    runProgram = false;
                    break;

                case 6:
                    System.out.println("Enter Student Index");
                    Integer studentIndex = scanner.nextInt();

                    System.out.println("Enter Course Id");
                    Integer courseId = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Enter Course Name");
                    String courseName = scanner.next();

                    Course course = new Course(courseId, courseName, null, null);

                    studentService.enroll(studentIndex, course);

                    break;
                    default:
                        System.out.println("Invalid choice");
            }

        }
    }

}
