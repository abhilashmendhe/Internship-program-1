/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import java.util.ArrayList;
import preprocess.Datakeeper;

/**
 *
 * @author abhilash
 */
public class Clusters {
    
    public ArrayList getCertClusters(ArrayList ranges)
    {
        ArrayList clust = new ArrayList();
        
        ArrayList cm = Datakeeper.certifiedmaster;
        //System.out.println(ranges);
        for(int i=0; i<ranges.size(); i++)
        {
            ArrayList t = (ArrayList)ranges.get(i);
            double cnegative = (double)t.get(0);
            double cpositive = (double)t.get(1);
           // System.out.println(cnegative+" "+cpositive);
            ArrayList subclust = new ArrayList();
            for(int j=0; j<cm.size(); j++)
            {
                ArrayList t1 = (ArrayList)cm.get(j);
                double v = (double)t1.get(t1.size()-1);
                if(v>cnegative && v<cpositive)
                {
                    subclust.add(t1);
                }
            }
            clust.add(subclust);
        }
        
        return clust;
    }
    public ArrayList getNonCertClusters(ArrayList ranges)
    {
        ArrayList clust = new ArrayList();
        
        ArrayList cm = Datakeeper.noncertifiedmaster;
        //System.out.println(ranges);
        for(int i=0; i<ranges.size(); i++)
        {
            ArrayList t = (ArrayList)ranges.get(i);
            double cnegative = (double)t.get(0);
            double cpositive = (double)t.get(1);
           // System.out.println(cnegative+" "+cpositive);
            ArrayList subclust = new ArrayList();
            for(int j=0; j<cm.size(); j++)
            {
                ArrayList t1 = (ArrayList)cm.get(j);
                double v = (double)t1.get(t1.size()-1);
                if(v>cnegative && v<cpositive)
                {
                    subclust.add(t1);
                }
            }
            clust.add(subclust);
        }
        
        return clust;
    }
}
