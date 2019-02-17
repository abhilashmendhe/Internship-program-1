/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.text.DecimalFormat;
import java.util.ArrayList;
import jxl.demo.Demo;

/**
 *
 * @author abhilash
 */
public class Fuzzy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList alldata = new Create().cre();
        
        System.out.println(alldata);
//        System.out.println();
//        
        double min = 0.4;
        double max = 0.4;
        
        for(int i=0; i<alldata.size(); i++)
        {
            ArrayList t = (ArrayList) alldata.get(i);
            double temp = (double) t.get(1);
            
            if(min>temp)
                min = temp;
            if(max<temp)
                max = temp;
                        
            
        }
        
        ArrayList ranges = new Ranges().getRanges(max, min);
        System.out.println(ranges);
        
        ArrayList getclust = new FuzzyClassification().classify(alldata, ranges);
        
        for(int i=0; i<getclust.size(); i++)
        {
            ArrayList tt = (ArrayList) getclust.get(i);
            
            System.out.println(tt);
            
        }
        
    }
    
}
