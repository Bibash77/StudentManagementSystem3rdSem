package org.example.app.javalist;

import javax.swing.*;
import java.awt.*;

/**
 * @author Bibash Bogati
 * @created 2025-05-19
 */
public class GridLayoutExample {
    JFrame systemFrame;

    public void initialize() {
        systemFrame = new JFrame();
        systemFrame.setTitle("Display List");
        systemFrame.setSize(400,400);
        systemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel panel = new JPanel(new GridLayout(2,2, 10,10));
        panel.setSize(200, 200);
        panel.setBounds(10,10,100,100);
        panel.setBackground(Color.WHITE);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 1");
        JButton button3 = new JButton("Button 1");
        JButton button4 = new JButton("Button 1");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        systemFrame.add(panel);

        systemFrame.setVisible(true);
    }



    public static void main(String[] args) {
        GridLayoutExample example = new GridLayoutExample();
        example.initialize();

    }


}
