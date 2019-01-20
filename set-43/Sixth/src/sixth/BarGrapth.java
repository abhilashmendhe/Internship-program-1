/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixth;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author abhilash
 */
public class BarGrapth extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        
        // Y-axis (Height)
        g.drawLine(400, 160, 400, 800);
        g.drawLine(400, 160, 410, 170);
        g.drawLine(400, 160, 390, 170);
        g.drawString("0", 370, 820);
        g.drawString("20", 370, 740);
        g.drawString("40", 370, 680);
        g.drawString("60", 370, 620);
        g.drawString("80", 370, 560);
        g.drawString("100", 370, 500);
        g.drawString("120", 370, 440);
        g.drawString("140", 370, 380);
        g.drawString("160", 370, 320);
        g.drawString("180", 370, 260);
        g.drawString("200", 370, 200);
        
        g.drawLine(400, 800, 1040, 800);
        g.drawString("1", 430, 830);
        g.drawString("2", 460, 830);
        g.drawString("3", 490, 830);
        g.drawString("4", 520, 830);
        g.drawString("5", 550, 830);
        g.drawString("6", 580, 830);
        g.drawString("7", 610, 830);
        g.drawString("8", 640, 830);
        g.drawString("9", 670, 830);
        g.drawString("10", 700, 830);
        g.drawString("11", 730, 830);
        g.drawString("12", 760, 830);
        g.drawString("13", 790, 830);
        g.drawString("14", 820, 830);
        g.drawString("15", 850, 830);
        g.drawString("16", 880, 830);
        g.drawString("17", 910, 830);
        g.drawString("18", 940, 830);
        g.drawString("19", 970, 830);
        g.drawString("20", 1000, 830);
        
        g.drawLine(1040, 800, 1030, 790);
        g.drawLine(1040, 800, 1030, 810);
        
        g.setColor(Color.GREEN);
        g.fillRect(450, 666, 20, 134);
        
        g.setColor(Color.red);
        g.fillRect(540, 532, 20, 268);
        
        g.setColor(Color.yellow);
        g.fillRect(690, 512, 20, 288);
        
        g.setColor(Color.ORANGE);
        g.fillRect(840, 444, 20, 356);
        
        g.setColor(Color.PINK);
        g.fillRect(990, 290, 20, 510);
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
