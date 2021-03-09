package preet.learn;

import java.awt.*;
import java.awt.event.*;
class smile extends Frame
{

    smile()
    {
        this.addWindowListener(new WindowAdapter()

        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }


    public void paint(Graphics g)
    {


        g.setColor(Color.yellow);
        g.fillOval(75,75,150,150);
        g.drawOval(75,75,150,150);
        //face
        g.setColor(Color.black);
        g.fillOval(100,100,15,15);
        g.drawOval(100,100,15,15);
        //eye
        g.fillOval(180,100,15,15);
        g.drawOval(180,100,15,15);
        g.setColor(Color.pink);
        g.fillArc(110,140,75,50,0,-175);
        g.drawArc(110,140,75,50,0,-175);
    }

    public static void main(String arg[])
    {
        smile S = new smile();
        S.setSize(400,400);
        S.setTitle("SMILEY");
        S.setVisible(true);
    }
}
