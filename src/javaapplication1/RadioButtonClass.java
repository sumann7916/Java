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
public class RadioButtonClass extends JFrame {

    RadioButtonClass() {
        JRadioButton jRadioButton1 = new JRadioButton();
        JRadioButton jRadioButton2 = new JRadioButton("test");
        JRadioButton jRadioButton3 = new JRadioButton("test2", true);
        JRadioButton jRadioButton4 = new JRadioButton("male");

        ButtonGroup btButtonGroup = new ButtonGroup();
        btButtonGroup.add(jRadioButton1);
        btButtonGroup.add(jRadioButton2);
        btButtonGroup.add(jRadioButton3);
        btButtonGroup.add(jRadioButton4);

        add(jRadioButton1);
        add(jRadioButton2);
        add(jRadioButton3);
        add(jRadioButton4);
        setLayout(new FlowLayout());// Because default is card layout
        //Some default settings
        setVisible(true);
        setTitle("Hello World");
        setSize(450, 450);
        setDefaultCloseOperation(3);

    }

}
