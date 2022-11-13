
package task2;

import com.sun.opengl.util.FPSAnimator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.media.opengl.*;

public class EmojiFace extends JFrame  {

   static FPSAnimator animator = null;
    GLCanvas glcanvas = new GLCanvas();

    public static void main(String[] args) {
        final EmojiFace app = new EmojiFace();
        animator.start();
    }

    public EmojiFace() {
        //set the JFrame title
        super("Simple JOGL Application");

        //kill the process when the JFrame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      

        //only three JOGL lines of code ... and here they are 
        glcanvas.addGLEventListener(new EmojiLisener());
        animator = new FPSAnimator(glcanvas,60);

        // add the GLCanvas just like we would any Component
        add(glcanvas, BorderLayout.CENTER);
        setSize(800, 800);

        //center the JFrame on the screen
        setLocationRelativeTo(this);
        setVisible(true);
    }

    

}
