/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class FuzzyClassification {
    
    public ArrayList classify(ArrayList alldata, ArrayList ranges)
    {
        ArrayList clusters = new ArrayList();
        
        
        for(int i=0; i<ranges.size(); i++)
        {
            ArrayList t = (ArrayList) ranges.get(i);
            double l = (double) t.get(0);
            double h = (double) t.get(1);
            ArrayList temp = new ArrayList();
            for(int j=0; j<alldata.size(); j++)
            {
                ArrayList tt = (ArrayList) alldata.get(j);
                double tval = (double) tt.get(1);
                
                if(tval > l && tval < h)
                    temp.add(tt);
                
            }
            clusters.add(temp);
        }
        
        
        return clusters;
    }
}
