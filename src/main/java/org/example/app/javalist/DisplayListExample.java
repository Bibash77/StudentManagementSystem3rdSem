package org.example.app.javalist;

import javax.swing.*;

/**
 * @author Bibash Bogati
 * @created 2025-05-19
 */
public class DisplayListExample {

    JFrame systemFrame;

    public void initialize () {
         systemFrame = new JFrame();
         systemFrame.setTitle("Display List");
         systemFrame.setSize(400,400);
         systemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set null layout to use absolute positioning
        systemFrame.setLayout(null);

        String [] courses = {"JAVA", "DOTNET", "DATABASE"};
        JList<String> list = new JList(courses);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(20, 20, 400, 400);

        systemFrame.add(scrollPane);


        systemFrame.setVisible(true);
    }


    public static void main(String[] args) {
        DisplayListExample example = new DisplayListExample();
        example.initialize();

    }


}
