/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author suman
 */
public class HeadAndBody extends JFrame {

    HeadAndBody() {
        String[] head = {"Name", "Age"};
        String[][] body = {{"Ram", "7"},
        {"Shyam", "8"}
        };

        JTable jTable = new JTable(body, head);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        add(jScrollPane);

        //Some default settings
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Hello World");
        setSize(450, 450);
        setDefaultCloseOperation(3);

    }
}
