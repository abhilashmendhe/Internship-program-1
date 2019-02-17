/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class Ranges {
    
    public ArrayList getRanges(double max, double min)
    {
        
        
        double diffvalue = max - min;
        DecimalFormat d = new DecimalFormat("0.00");
        
        double dist = diffvalue / 5;
        String distance = d.format(dist);
        
        dist = Double.parseDouble(distance);
        
        double lr = 0 ;
        double hr = 0;
        ArrayList addrange = new ArrayList();
         
        for(int i=0; i<5; i++)
        {
            ArrayList addtr = new ArrayList();
            hr = hr + dist;
//            System.out.println(lr+"-"+hr);
            addtr.add(lr);
            addtr.add(hr);
            addrange.add(addtr);
            lr = hr;
        }
        
        //System.out.println(addrange);
        return addrange;
                
    }
}
