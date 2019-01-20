/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifth;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author abhilash
 */
public class Home extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        int []x = {560, 860, 1160};
        int []y = {350, 100, 350};
        g.fillPolygon(x,y,3);
        
        g.setColor(Color.orange);
        g.fillRect(660, 350, 410, 400);
        
        g.setColor(Color.black);
        g.fillRect(770, 735, 200, 15);
        
        g.setColor(Color.gray);
        g.fillRect(770, 727, 200, 8);
        
        g.setColor(Color.cyan);
        g.fillRect(820, 467, 100, 260);
        
        g.setColor(Color.black);
        g.fillOval(830, 600, 15, 15);
        
        g.setColor(Color.red);
        g.drawLine(1010, 190, 1010, 225);
        g.setColor(Color.red);
        g.drawLine(1050, 190, 1050, 258);
        
        g.setColor(Color.red);
        g.drawRect(990, 170, 80, 20);
        
        g.setColor(Color.blue);
        g.drawRect(710, 467, 80, 30);
    
        g.setColor(Color.blue);
        g.drawRect(950, 467, 80, 30);
        
        g.setColor(Color.blue);
        g.drawRect(710, 497, 40, 60);
        
        g.setColor(Color.blue);
        g.drawRect(950, 497, 40, 60);
        
        g.setColor(Color.blue);
        g.drawRect(990, 497, 40, 60);
        
        g.setColor(Color.blue);
        g.drawRect(750, 497, 40, 60);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
