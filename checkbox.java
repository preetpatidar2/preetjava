import java.awt.*;
import java.awt.event.*;

class checkbox extends Frame{
    checkbox(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
                System.out.println("done");
            }
        });
    }
    public static void main(String args[]){
        checkbox c = new checkbox();
        c.setSize(5000,5000);
        c.setTitle("CHECKBOX");
        c.setVisible(true);
        c.setLayout(null);
        Checkbox c1 = new Checkbox("click",true);
        c1.setBounds(220,120,60,30);
        c.add(c1);
        Checkbox c2,c3;//checbox 2 and 3

        c2 = new Checkbox("click");
        c2.setBounds(220,220,60,30);
        c.add(c2);
        c3 = new Checkbox("click",true);
        c3.setBounds(220,320,110,30);
        c.add(c3);
    }
}
