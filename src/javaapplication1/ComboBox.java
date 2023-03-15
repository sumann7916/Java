/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.*;

/**
 *
 * @author suman
 */
public class ComboBox extends JFrame {

    ComboBox() {
        String[] countries = {"Nepal", "India", "China"};
        JComboBox jComboBox = new JComboBox();
        JComboBox jComboBox2 = new JComboBox(countries);
        JComboBox jComboBox3 = new JComboBox(countries);
        jComboBox3.setSelectedIndex(1);

        add(jComboBox);
        add(jComboBox2);
        add(jComboBox3);

        //Some default settings
        setVisible(true);
        setTitle("Hello World");
        setSize(450, 450);
        setDefaultCloseOperation(3);

    }
}
