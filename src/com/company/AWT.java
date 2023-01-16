package com.company;
import java.awt.*;
import javax.swing.*;
public class AWT extends JFrame {
    AWT(){
        JButton b = new JButton("Click here");
        setBounds(430, 110,400,600);
        setSize(40,40);
        setLayout(null);
        setVisible(true);
        add(b);
    }
    public static void main(String[] args) {
        AWT a1 = new AWT();

    }
}
