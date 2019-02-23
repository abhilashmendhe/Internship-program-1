/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmm;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class Mean_SD {
    
    public double getMean(ArrayList data)
    {
        double mean = 0;
        for(int i=0; i<data.size(); i++)
        {
            ArrayList t = (ArrayList)data.get(i);
            double val = (double) t.get(t.size()-1);
            mean += val;
        }
        mean = mean / data.size();
        return mean;
        
    }
    
    public double getSD(ArrayList data)
    {
        double mean = getMean(data);
        double var = 0;
        for(int i=0; i<data.size(); i++)
        {
            ArrayList t = (ArrayList)data.get(i);
            double val = (double) t.get(t.size()-1);
            var += Math.pow((val-mean), 2);
        }
        var = var / data.size();
        
        double sd = Math.sqrt(var);
            
        return sd;
    }
}
