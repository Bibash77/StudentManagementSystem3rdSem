package org.example.app;

import org.example.entities.Student;
import org.example.service.studentDao.StudentDaoService;
import org.example.service.studentDao.StudentDaoServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Bibash Bogati
 * @created 2025-05-18
 */
public class MainFrameExample {



    public static void main(String[] args) {
        StudentDaoService service = new StudentDaoServiceImpl();

        JFrame systemFrame = new SystemFrame();
        JMenuBar menuBar = new SystemMenuBar();

        // Set null layout to use absolute positioning
        systemFrame.setLayout(null);

        // Name field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 20, 100, 25);
        systemFrame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(130, 20, 200, 25);
        systemFrame.add(nameField);

        // Roll Number field
        JLabel rollNoLabel = new JLabel("Roll No");
        rollNoLabel.setBounds(20, 60, 100, 25);
        systemFrame.add(rollNoLabel);

        JTextField rollNoField = new JTextField();
        rollNoField.setBounds(130, 60, 200, 25);
        systemFrame.add(rollNoField);

        // Gender field
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(20, 100, 100, 25);
        systemFrame.add(genderLabel);

        // Radio buttons for gender
        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(130, 100, 80, 25);
        systemFrame.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(220, 100, 100, 25);
        systemFrame.add(femaleButton);

        // Button group for gender selection
        ButtonGroup group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);

        // Description area
        JLabel descriptionLabel = new JLabel("Description");
        descriptionLabel.setBounds(20, 140, 100, 25);
        systemFrame.add(descriptionLabel);

        JTextArea descriptionArea = new JTextArea();
        descriptionArea.setBounds(130, 140, 300, 100);
        descriptionArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        systemFrame.add(descriptionArea);

        // Submit button
        JButton jButton = new JButton("Submit");
        jButton.setBounds(130, 260, 100, 30);
        systemFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                    String name = nameField.getText();
                    String gender = maleButton.isSelected() ? "Male" : "Female";

                    Integer rollNoValue = Integer.parseInt(rollNoField.getText());
                    String description = descriptionArea.getText();

                    Student student = new Student(name, rollNoValue, description, null);
                    service.addStudent(student);

                    System.out.println(nameField.getText());
            }
        });


        systemFrame.setJMenuBar(menuBar);
        systemFrame.setVisible(true);
    }



}
