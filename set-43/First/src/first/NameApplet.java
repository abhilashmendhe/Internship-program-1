
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author abhilash
 */
public class NameApplet extends JApplet {

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
        g.drawString("Ankit", 100, 200);
       
        
        g.setColor(Color.black);
        g.drawString("Vithal", 100, 300);
         
        g.setColor(Color.MAGENTA);
        g.drawString("Suchit", 100, 400);
        
        g.setColor(Color.orange);
        g.drawString("Abhilash",100, 500);
        
        g.setColor(Color.pink);
        g.drawString("Shreepad", 100, 600);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
