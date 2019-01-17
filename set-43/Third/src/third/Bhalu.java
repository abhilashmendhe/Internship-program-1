/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author abhilash
 */
public class Bhalu extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.orange);
        g.fillOval(920, 200, 180, 130);
        g.setColor(Color.BLACK);
        g.fillOval(970, 240, 15, 15);
        g.setColor(Color.BLACK);
        g.fillOval(1035, 240, 15, 15);
        
        g.setColor(Color.black);
        int x[] = {985,1015,1050};
        int y[] = {300,280,300};
        g.fillPolygon(x,y,3);
        
        g.setColor(Color.orange);
        g.fillOval(895, 162, 65, 65);
        g.setColor(Color.orange);
        g.fillOval(1060, 162, 65, 65);
        g.setColor(Color.orange);
        g.fillOval(848, 325, 330, 350);
        
        g.setColor(Color.green);
        g.fillOval(807, 300, 100, 100);
        g.setColor(Color.green);
        g.fillOval(1120, 300, 100, 100);
        g.setColor(Color.green);
        g.fillOval(807, 600, 100, 100);
        g.setColor(Color.green);
        g.fillOval(1120, 600, 100, 100);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
