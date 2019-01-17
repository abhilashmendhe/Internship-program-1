/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author abhilash
 */
public class Flag extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g)
    {
        
       
        //base
            g.setColor(Color.black);
            g.drawRect(860, 680, 80, 30);
            g.drawRect(830, 710, 140, 30);
            g.drawRect(800, 740, 200, 30);
            
        //pole
        
        g.setColor(Color.darkGray);
        g.fillRect(897, 100, 8, 580);
        
        // triangle
        
        
        // flag 
        
        g.setColor(Color.orange);
        g.fillRect(905, 100, 200, 32);
        g.setColor(Color.white);
        g.fillRect(905, 132, 200, 32);
        g.setColor(Color.green);
        g.fillRect(905, 164, 200, 32);
        
        //chakra
        g.setColor(Color.blue);
        g.drawOval(992, 132, 32, 32);
        
        //chakra lines
        g.setColor(Color.blue);
        g.drawLine(1008, 132, 1008, 164);
        g.drawLine(1010, 133, 1006, 163);
        g.drawLine(1012, 136, 1004, 160);
        g.drawLine(1016, 137, 1002, 158);
        g.drawLine(1018, 139, 1000, 156);
        g.drawLine(1020, 140, 998, 154);
        g.drawLine(1022, 141, 996, 152);
        g.drawLine(1024, 142, 994, 152);
        g.drawLine(1026, 143, 992, 150);
        
        
        
        
    }
    // TODO overwrite start(), stop() and destroy() methods
}
