package org.example.app.javalist;

import javax.swing.*;

/**
 * @author Bibash Bogati
 * @created 2025-05-19
 */
public class SelectExample {


    JFrame systemFrame;

    public void initialize () {
        systemFrame = new JFrame();
        systemFrame.setTitle("Display List");
        systemFrame.setSize(400,400);
        systemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set null layout to use absolute positioning
        systemFrame.setLayout(null);

        JLabel nameLabel = new JLabel("Select Course");
        nameLabel.setBounds(10, 10, 200, 20);
        systemFrame.add(nameLabel);


        String [] courses = {"JAVA", "DOTNET", "DATABASE"};
        JComboBox<String> list = new JComboBox<>(courses);
        list.setBounds(10, 40, 200, 20);



        JLabel inutLabel = new JLabel("Enter Name");
        inutLabel.setBounds(10, 70, 200, 20);
        systemFrame.add(inutLabel);

        JList<String> dataList = new JList<>(courses);
        JScrollPane scrollPane = new JScrollPane(dataList);
        scrollPane.setBounds(10, 150, 200, 20);

        systemFrame.add(dataList);


        systemFrame.setVisible(true);
    }


    public static void main(String[] args) {
        SelectExample example = new SelectExample();
        example.initialize();

    }
}
