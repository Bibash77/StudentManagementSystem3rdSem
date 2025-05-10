package org.example.service;

import java.sql.*;

/**
 * @author Bibash Bogati
 * @created 2025-05-09
 */
public class DataBaseConnection {


    public static void main(String[] args) {

        try {
            // load driver
            Class.forName("com.mysql.jdbc.Driver");

            // create connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/test_db", "root" , "root");

            // statement
            Statement statement = connection.createStatement();


            int rows = statement.executeUpdate("INSERT into student (id , name, rollNo,email) values (2, 'test1', 1, 'test1@gmail.com')");
            rows = statement.executeUpdate("delete from student where id  = 1");
            System.out.println(rows + " rows deleted");

            // resultset
            ResultSet resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()) {
              String name =   resultSet.getString("name");
              Integer age =   resultSet.getInt("rollNo");
              String email =   resultSet.getString("email");

                System.out.println("Name: " + name +
                        "\n Age: " + age +
                        "\n Email: " + email);
            }


        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
