/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenth;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JApplet;

/**
 *
 * @author abhilash
 */
public class LineYearMonth extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    
    
    public void paint(Graphics g)
    {
        // y-axis
        g.setColor(Color.black);
        
     g.drawLine(400, 130, 400, 800);
        g.drawLine(400, 130, 410, 140);
        g.drawLine(400, 130, 390, 140);
        g.drawString("0", 370, 820);
//        g.drawString("10", 370, 740);
//        g.drawString("20", 370, 680);
//        g.drawString("30", 370, 620);
//        g.drawString("40", 370, 560);
//        g.drawString("50", 370, 500);
//        g.drawString("60", 370, 440);
//        g.drawString("70", 370, 380);
//        g.drawString("80", 370, 320);
//        g.drawString("90", 370, 260);
//        g.drawString("100", 370, 200);
        int n = 770;
        int nn = 20;
        for(int i=0; i<21; i++)
        {
            
            g.drawString(Integer.toString(nn), 370, n);
            n -= 30;
            nn += 20;
        }
        System.out.println(nn);
        // x-axis
        g.drawLine(400, 800, 1200, 800);
        g.drawLine(1200, 800, 1190, 790);
        g.drawLine(1200, 800, 1190, 810);
        
        g.drawString("Jan", 460, 830);
        g.drawString("Feb", 520, 830);
        g.drawString("Mar", 580, 830);
        g.drawString("Apr", 640, 830);
        g.drawString("May", 700, 830);
        g.drawString("Jun", 760, 830);
        g.drawString("Jul", 820, 830);
        g.drawString("Aug", 880, 830);
        g.drawString("Sep", 940, 830);
        g.drawString("Oct", 1000, 830);
        g.drawString("Nov", 1060, 830);
        g.drawString("Dec", 1120, 830);
        
        g.drawString("Months", 750, 880);
        
        g.drawString("Electricity Reading", 200, 500);
//        
        ArrayList<Integer> months = new ArrayList<Integer>();
        months.add(460);
        months.add(520);
        months.add(580);
        months.add(640);
        months.add(700);
        months.add(760);
        months.add(820);
        months.add(880);
        months.add(940);
        months.add(1000);
        months.add(1060);
        months.add(1120);
        
        
        
        
        
        
        ArrayList<Integer> year_2016 = new ArrayList<Integer>();
        year_2016.add(124);
        year_2016.add(145);
        year_2016.add(245);
        year_2016.add(256);
        year_2016.add(304);
        year_2016.add(308);
        year_2016.add(245);
        year_2016.add(202);
        year_2016.add(178);
        year_2016.add(178);
        year_2016.add(167);
        year_2016.add(152);
        
        ArrayList<Integer> year_2017 = new ArrayList<Integer>();
        year_2017.add(156);
        year_2017.add(156);
        year_2017.add(256);
        year_2017.add(277);
        year_2017.add(355);
        year_2017.add(356);
        year_2017.add(298);
        year_2017.add(215);
        year_2017.add(200);
        year_2017.add(165);
        year_2017.add(178);
        year_2017.add(189);
        
        ArrayList<Integer> year_2018 = new ArrayList<Integer>();
        year_2018.add(145);
        year_2018.add(178);
        year_2018.add(278);
        year_2018.add(298);
        year_2018.add(389);
        year_2018.add(402);
        year_2018.add(341);
        year_2018.add(220);
        year_2018.add(189);
        year_2018.add(179);
        year_2018.add(199);
        year_2018.add(204);
        
        
        //g.drawString("20", 430, 890);
        
        for(int i=0; i<11; i++)
        {
            int lines1 = (int) (800 - (year_2016.get(i)*1.5));
            int lines2 = (int) (800 - (year_2016.get(i+1)*1.5));
                    
            g.setColor(Color.red);
            g.drawLine(months.get(i),lines1,months.get(i+1),lines2);
            
            int l1 = (int) (800 - (year_2017.get(i)*1.5));
            int l2 = (int) (800 - (year_2017.get(i+1)*1.5));
                    
            g.setColor(Color.green);
            g.drawLine(months.get(i),l1,months.get(i+1),l2);
            
            int m1 = (int) (800 - (year_2018.get(i)*1.5));
            int m2 = (int) (800 - (year_2018.get(i+1)*1.5));
                    
            g.setColor(Color.blue);
            g.drawLine(months.get(i), m1, months.get(i+1), m2);
        }
        
        
        g.setColor(Color.black);
        g.drawString("2016", 1200, 415);
        g.setColor(Color.red);
        g.fillRect(1260, 400, 20, 20);
//        
        g.setColor(Color.black);
        g.drawString("2017", 1200, 445);
        g.setColor(Color.green);
        g.fillRect(1260, 430, 20, 20);

        g.setColor(Color.black);
        g.drawString("2018", 1200, 475);
        g.setColor(Color.blue);
        g.fillRect(1260, 460, 20, 20);
    }
    
    
    // TODO overwrite start(), stop() and destroy() methods
}
