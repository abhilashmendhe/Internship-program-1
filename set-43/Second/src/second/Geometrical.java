/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author abhilash
 */
public class Geometrical extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(400, 200, 300, 100);
        g.drawRect(400, 200, 300, 100);
        
        g.setColor(Color.BLUE);
        g.fillOval(800, 200, 100, 100);
        
        g.setColor(Color.GREEN);
        g.drawLine(1200, 400, 1300, 200);
        
        g.setColor(Color.GREEN);
        g.drawLine(1300, 200, 1400, 400);
        
        g.setColor(Color.GREEN);
        g.drawLine(1400, 400, 1200, 400);
        
        g.setColor(Color.ORANGE);
        g.fillOval(300, 600, 600, 300);
        
        
        int x[] = {1500,1600,1700};//,1600,1700,1500};
        int y[] = {800,500,800};//,800,800};
        //g.fillpo
        g.fillPolygon(x,y ,3);
    }
            
    // TODO overwrite start(), stop() and destroy() methods
}
