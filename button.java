package preet.learn;

import java.awt.*;
import java.awt.event.*;

class button extends Frame
{
    public static void main(String args[])
    {
        button f = new button();
        f.setSize(1500,1500);
        f.setVisible(true);
        f.setTitle("btn");
        f.setLayout(null);
        Button b = new Button("hello");
        Button b2 = new Button("click here");
        b.setBounds(50,100,80,30);
        b2.setBounds(700,100,80,30);
        f.add(b);
        f.add(b2);
    }
    button()
    {
