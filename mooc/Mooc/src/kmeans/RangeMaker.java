/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class RangeMaker {
    
    public ArrayList getR(ArrayList cent,double ed)
    {
        ArrayList ranges = new ArrayList();
        
        for(int i=0; i<cent.size(); i++)
        {
            ArrayList t = new ArrayList();
            double cpositive = ((double)cent.get(i) + ed);
            double cnegative = ((double)cent.get(i) - ed);
            t.add(cnegative);
            t.add(cpositive);
            ranges.add(t);
        }
        
        
        return ranges;
    }
}
