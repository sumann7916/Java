/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.*;
import java.awt.FlowLayout;

public class JavaApplication1 extends JFrame {

    JavaApplication1() {
        JLabel jLabel1 = new JLabel("Hello World");
        add(jLabel1);
        setVisible(true);
        setTitle("Hello World");
        setSize(450, 450);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new HeadAndBody();
    }

}
