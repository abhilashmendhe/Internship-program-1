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
public class RCluster {
    
    public ArrayList newRcluster(ArrayList clusters, ArrayList ranges)
    {
        ArrayList newclust = new ArrayList();
        
      //  for(int i=0; i<ranges.size(); i++)
       // {
           
            
            for(int j=0; j<clusters.size(); j++)
            {
                
                 ArrayList temprange = (ArrayList) ranges.get(j);
                // System.out.println("Range is "+temprange);
            ArrayList tempaddnew = new ArrayList();
            double low = (double)temprange.get(0);
            double high = (double)temprange.get(1);
                ArrayList t =(ArrayList) clusters.get(j);
                for(int k=0; k<t.size(); k++)
                {
                    ArrayList trow = (ArrayList)t.get(k);
                    double dist = (double) trow.get(trow.size()-1);
                    if(dist>low && dist<high)
                        tempaddnew.add(trow);
                }
                newclust.add(tempaddnew);
            }
            
       // }
        
        return newclust;
    }
}
