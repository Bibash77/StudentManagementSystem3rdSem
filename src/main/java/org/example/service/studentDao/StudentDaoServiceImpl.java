package org.example.service.studentDao;

import org.example.Main;
import org.example.config.DatabaseConnector;
import org.example.entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Bibash Bogati
 * @created 2025-05-09
 */
public class StudentDaoServiceImpl implements StudentDaoService {

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try {
            Statement statement = DatabaseConnector.createConnection();
            ResultSet resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Integer age = resultSet.getInt("rollNo");
                String email = resultSet.getString("email");

                Student student = new Student(name, age, email,null);
                students.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
 try {


     Statement statement = DatabaseConnector.createConnection();
     String query = "INSERT into student (id , name, rollNo,email) values(" + getRandomId() + ", '" +  student.getName() +"' ," + student.getRollNo()+ ", '"
             + student.getEmail()+ "'" + ")";
//     int rows = statement.executeUpdate("INSERT into student (id , name, rollNo,email) values" +
//             " (2, 'test1', 1, 'test1@gmail.com')");

     int rows = statement.executeUpdate(query);
     System.out.println(rows);
 } catch (Exception e) {
     e.printStackTrace();
 }
    }

    @Override
    public void updateStudent(Student student) {
        try {
            Connection connection = DatabaseConnector.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update student set name = ? and rollNo = ? and email = ? where id = ?");

            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getRollNo());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setInt(4, student.getId());

            int rows = preparedStatement.executeUpdate();
            if(rows > 0) {
                System.out.println("Student successfully updated !!!!");
            }
        } catch (Exception exception){
            exception.printStackTrace();
        }

    }

    @Override
    public void deleteStudent(Student student) {

    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> searchStudentsByName(String studentName) {
        return List.of();
    }


    private Integer getRandomId() {
        Random r= new Random();
        // Generate random integers in range 0 to 999
        int r1 = r.nextInt(1000);
        return r1;
    }

}
