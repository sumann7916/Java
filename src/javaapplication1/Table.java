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
public class Table extends JFrame {

    Table() {
        String[] countries = {"Nepal", "India", "China"};
        JList jlist = new JList(countries);
        add(jlist);

        //Some default settings
        setVisible(true);
        setTitle("Hello World");
        setSize(450, 450);
        setDefaultCloseOperation(3);

    }
}
