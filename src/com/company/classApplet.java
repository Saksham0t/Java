package com.company;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class classApplet extends Applet implements ActionListener{
    Label l1,l2,l3,l4,l5,l6,l7;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Button b,c;

    public void init() {

        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t4=new TextField();
        t5=new TextField();
        t6=new TextField();
        t7=new TextField();

        l1=new Label("First Number");
        l2=new Label("Second Number");
        l3=new Label("Third Number");
        l4=new Label("Fourth Number");
        l5=new Label("Fifth Number");
        l6=new Label("SUM");
        l7=new Label("AVERAGE");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(l7);
        add(t7);

        Button b=new Button("SUM");
        Button c=new Button("AVERAGE");
        b.addActionListener(this);
        c.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b) {
            int x1=Integer.parseInt(t1.getText());
            int x2=Integer.parseInt(t2.getText());
            int x3=Integer.parseInt(t3.getText());
            int x4=Integer.parseInt(t4.getText());
            int x5=Integer.parseInt(t5.getText());

            t6.setText(String.valueOf(x1+x2+x3+x4+x5));

        }
        else if(e.getSource()==c) {
            int x1=Integer.parseInt(t1.getText());
            int x2=Integer.parseInt(t2.getText());
            int x3=Integer.parseInt(t3.getText());
            int x4=Integer.parseInt(t4.getText());
            int x5=Integer.parseInt(t5.getText());

            t7.setText(String.valueOf((x1+x2+x3+x4+x5)/5));

        }
    }

}
