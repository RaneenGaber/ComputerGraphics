/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.awt.Color;
import javax.media.opengl.*;

class EmojiLisener implements GLEventListener {

    int r = 50;
    int y = 0;
    int angle = 1;
    int startangle = 90;
    int startangle11 = 90;

    boolean DirectionUP = false;

    @Override
    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

        gl.glViewport(0, 0, 600, 300);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(0, 800.0, 0, 800.0, -1.0, 1.0);

    }

    @Override
    public void display(GLAutoDrawable drawable) {

        GL gl = drawable.getGL();

        gl.glClear(GL.GL_COLOR_BUFFER_BIT);

        gl.glPointSize(13.0f);
        gl.glColor3f(1.0f, 0.0f, 0.0f);

        gl.glPushMatrix();
        gl.glTranslated(400, 400, 0);
        shape(gl, new Color(1f, 1f, 0f, 1f), 300, 1, 0, 1);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(400, 400, 0);
        halfcircle(gl, new Color(0f, 0f, 0f, 1f), 200, 1, 0, 1);
        gl.glPopMatrix();
        for(int i =0 ;i<150;i++){
        gl.glPushMatrix();
        gl.glTranslated(250, 500, 0);
        gl.glRotated(startangle, 0, 0, 1);
        STAR(gl, new Color(1f, 0f, 0f, 1f), i, 72, 0, 2);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glTranslated(550, 500, 0);
        gl.glRotated(startangle11, 0, 0, 1);
        STAR(gl, new Color(1f, 0f, 0f, 1f), i, 72, 0, 2);
        gl.glPopMatrix();
        }
        startangle--;
        startangle11++;

    }

    void shape(GL gl, Color c, int r, int angle, int startangle, int step) {

        gl.glColor3fv(c.getColorComponents(null), 0);
        gl.glBegin(GL.GL_POLYGON);

        for (int i = startangle; i < 360 * step + startangle; i += step * angle) {
            gl.glVertex2d(r * Math.cos(Math.toRadians(i)), r * Math.sin(Math.toRadians(i)));

        }
        gl.glEnd();

    }

    void STAR(GL gl, Color c, int r, int angle, int startangle, int step) {

        gl.glColor3fv(c.getColorComponents(null), 0);
        gl.glBegin(GL.GL_LINE_LOOP);

        for (int i = 0; i <= 360; i += angle) {
        gl.glVertex2d(r * Math.cos(Math.toRadians(2*i)), r * Math.sin(Math.toRadians(2*i)));
       
        }
        gl.glEnd();

    }

    void halfcircle(GL gl, Color c, int r, int angle, int startangle, int step) {

        gl.glColor3fv(c.getColorComponents(null), 0);
        gl.glBegin(GL.GL_POLYGON);

        for (int i = 360; i > 180 * step + startangle; i -= angle) {
            gl.glVertex2d(r * Math.cos(Math.toRadians(i)), r * Math.sin(Math.toRadians(i)));

        }
        gl.glEnd();

    }

    @Override
    public void reshape(
            GLAutoDrawable drawable,
            int x,
            int y,
            int width,
            int height
    ) {
    }

    /**
     * If the display depth is changed while the program is running this method
     * is called. Nowadays this doesn't happen much, unless a programmer has his
     * program do it.
     */
    @Override
    public void displayChanged(
            GLAutoDrawable drawable,
            boolean modeChanged,
            boolean deviceChanged
    ) {
    }

    public void dispose(GLAutoDrawable arg0) {
        // TODO Auto-generated method stub

    }

}
