/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regression;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class Rrangecluster {
    
    public ArrayList range(ArrayList cluster)
    {
        ArrayList ranges = new ArrayList();
        
        for(int i=0; i<cluster.size(); i++)
        {
            ArrayList temprange = new ArrayList();
            
            ArrayList tempclust = (ArrayList) cluster.get(i);
            double mean = 0;
            for(int j=0; j<tempclust.size(); j++)
            {
                ArrayList temprow = (ArrayList) tempclust.get(j);
                double tempdist = (double) temprow.get(temprow.size() - 1);
                mean += tempdist;
            }
            
            mean = mean / tempclust.size();
            System.out.println("Mean of cluster "+i+": "+mean);
            double sd = 0;
            for(int k=0; k<tempclust.size(); k++)
            {
                ArrayList temprow = (ArrayList) tempclust.get(k);
                double tempdist = (double) temprow.get(temprow.size() - 1);
                sd  = sd + Math.pow((tempdist-mean), 2);
            }
            sd = Math.sqrt(sd);
            System.out.println("SD of cluster "+i+": "+sd);
            temprange.add(mean-sd);
            temprange.add(mean+sd);
            System.out.println("");
            
            ranges.add(temprange);
                    
        }
        
        return ranges;
    }
}
