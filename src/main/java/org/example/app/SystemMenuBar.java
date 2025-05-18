package org.example.app;

import javax.swing.*;

/**
 * @author Bibash Bogati
 * @created 2025-05-18
 */
public class SystemMenuBar extends JMenuBar {


    public SystemMenuBar() {


        JMenu addStudentMenu = new JMenu("Add Student");
        JMenu removeStudentMenu = new JMenu("Remove Student");
        JMenu updateStudentMenu = new JMenu("Update Student");
        JMenu deleteStudentMenu = new JMenu("Delete Student");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        addStudentMenu.add(exitMenuItem);

        add(addStudentMenu);
        add(removeStudentMenu);
        add(updateStudentMenu);
        add(deleteStudentMenu);
    }
}
