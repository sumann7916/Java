/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.*;
import java.awt.FlowLayout;

/**
 *
 * @author suman
 */
public class TextField extends JFrame {

    TextField() {
        JTextField jTextField1 = new JTextField();
        JTextField jTextField2 = new JTextField(20);
        JTextField jTextField3 = new JTextField("Hello");
        JTextField jTextField4 = new JTextField("Hello", 20);

        //For Text Area
        JTextArea jTextArea = new JTextArea();
        JTextArea jTextArea1 = new JTextArea(3, 10);
        JTextArea jTextArea2 = new JTextArea("hello");
        JTextArea jTextArea3 = new JTextArea("hell0", 3, 10);

        //For Password Field
        JPasswordField jPasswordField = new JPasswordField(20);

//        add(jTextField1);
//        add(jTextField2);
//        add(jTextField3);
//        add(jTextField4);
        add(jPasswordField);

        add(jTextArea);
        add(jTextArea1);
        add(jTextArea2);
        add(jTextArea3);

        setLayout(new FlowLayout());// Because default is card layout
        //Some default settings
        setVisible(true);
        setTitle("Hello World");
        setSize(450, 450);
        setDefaultCloseOperation(3);

    }

}
