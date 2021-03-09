package preet.learn;

import java.awt.*;
import java.awt.event.*;
class house extends Frame
{

    house()
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
        g.setColor(Color.black);
        
        g.drawLine(50,300,375,300);                
        g.drawLine(80,300,80,150);                 
        g.drawLine(200,300,200,150); 	       
        g.drawLine(50,170,140,110); 	       
        g.drawLine(140,110,230,170);              
        // to draw entrance(door frame)
        g.drawLine(110,220,110,300);	      
        g.drawLine(170,220,170,300); 	      
        g.drawLine(110,220,170,220); 	      
        // to draw the man
        g.drawLine(320,280,300,300); 	      
        g.drawLine(320,280,340,300); 	      
        g.drawLine(320,280,320,250); 	      
        g.drawLine(300,270,320,250); 	      
        g.drawLine(340,270,320,250); 	    
        g.drawOval(310,230,20,20);              







        //sun in the sky
        g.setColor (Color.orange);
        g.fillArc (100,20,80,80,0,360);
        g.drawLine (95,55,75,55);
        g.drawLine (140,105,140,125);
        g.drawLine (140,15,140,0);
        g.drawLine (185,60,205,60);
        g.drawLine (105,35,85,25);
        g.drawLine (120,20,105,5);
        g.drawLine (100,80,80,90);
        g.drawLine (115,100,100,120);
        g.drawLine (175,5,160,20);
        g.drawLine (205,25,175,35);
        g.drawLine (205,90,175,80);
        g.drawLine (175,120,160,100);




        //garden
        g.setColor(Color.green);
        g.fillRect(0,300,3000,2550);
        g.drawRect(0,300,2150,1550); g.setColor(Color.green);
        g.fillRect(0,300,3000,2550);
        g.drawRect(0,300,2150,1550);



    }
    public void IndexOutOfBoundsException(String s)
    {

    }

    public static void main(String arg[]) {

        house H = new house();
        H.setSize(3000,3000);
        H.setTitle("house");
        H.setVisible(true);
    }
}
