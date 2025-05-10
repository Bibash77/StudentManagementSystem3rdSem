package org.example.config;

import org.example.entities.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * @author Bibash Bogati
 * @created 2025-05-09
 */
public class DatabaseConnector {

    public static Statement createConnection() {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           // create connection
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/test_db", "root" , "root");

           // statement
           Statement statement = connection.createStatement();

           return statement;
       } catch (Exception e) {
           e.printStackTrace();
          throw new RuntimeException(e);
       }
    }


    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // create connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/test_db", "root" , "root");

            // statement
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement getConnectionWithPrepared(String sql, Student student) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // create connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/test_db", "root" , "root");

            // statement
            PreparedStatement statement = connection.prepareStatement("INSERT into student (id , name, rollNo,email) values (?, ?, ?, ?)");
            statement.setInt(1, 1);
            statement.setString(2, "name");




            statement.setString(1, sql);

            return statement;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}





