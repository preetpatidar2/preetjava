package preet.learn;


import java.awt.*;
import java.awt.event.*;

class text extends Frame{
    text(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
                System.out.println("OK!!!!!");
            }
        });
    }
    public static void main(String args[]){
        text t = new text();
        t.setSize(500,500);
        t.setVisible(true);
        t.setTitle("text");
        t.setLayout(null);
        TextField t1 = new TextField("Enter text 1");
        t1.setBounds(20,40,60,30);
        t.add(t1);
        TextField t2;
        t2= new TextField("Enter text 2");
        t2.setBounds(220,40,60,30);
        t.add(t2);

    }
}
