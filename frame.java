package preet.learn;

import java.awt.*;
import java.awt.event.*;
class frame extends Frame {
    frame() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("EXIT!!!!");
                dispose();

            }
        });

    }

    public static void main(String arg[]) {
        frame f = new frame();
        f.setSize(350, 350);
        f.setVisible(true);
        f.setTitle("frame-1");

    }
}
