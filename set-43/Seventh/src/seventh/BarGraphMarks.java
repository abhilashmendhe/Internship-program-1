/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JApplet;

/**
 *
 * @author abhilash
 */
public class BarGraphMarks extends JApplet {

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
        // y-axis
        g.drawLine(400, 160, 400, 800);
        g.drawLine(400, 160, 410, 170);
        g.drawLine(400, 160, 390, 170);
        g.drawString("0", 370, 820);
        g.drawString("10", 370, 740);
        g.drawString("20", 370, 680);
        g.drawString("30", 370, 620);
        g.drawString("40", 370, 560);
        g.drawString("50", 370, 500);
        g.drawString("60", 370, 440);
        g.drawString("70", 370, 380);
        g.drawString("80", 370, 320);
        g.drawString("90", 370, 260);
        g.drawString("100", 370, 200);
        Integer.toString(9);
        
        // x-axis
        g.drawLine(400, 800, 1080, 800);
        g.drawLine(1080, 800, 1070, 790);
        g.drawLine(1080, 800, 1070, 810);
        
        g.drawString("Maths", 520, 830);
        g.drawString("Physics", 640, 830);
        g.drawString("Chemistry", 760, 830);
        g.drawString("Biology", 880, 830);
        g.drawString("Electronics", 1000, 830);
        
        
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(56);
        marks.add(91);
        marks.add(85);
        marks.add(45);
        marks.add(67);
        
 
//        ArrayList<Integer> marks = new ArrayList<Integer>();
//        marks.add(40);
//        marks.add(100);
//        marks.add(10);
//        marks.add(10);
//        marks.add(7);
        
        ArrayList<Integer> subject = new ArrayList<Integer>();
        subject.add(520);
        subject.add(640);
        subject.add(760);
        subject.add(880);
        subject.add(1000);
        
        g.setColor(Color.orange);
        for(int i=0; i<5; i++)
        {
            int y = 800-(marks.get(i)*6);
            g.fillRect( subject.get(i), y, 20, 800-y);
        }
        
    }
    // TODO overwrite start(), stop() and destroy() methods
}
