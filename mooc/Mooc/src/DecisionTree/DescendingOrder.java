/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionTree;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class DescendingOrder {
    
    public ArrayList descendSort(ArrayList all)
    {
        ArrayList sort = all;
        
        for(int i=0; i<all.size(); i++)
        {
            for(int j=0; j<all.size()-1; j++)
            {
                ArrayList t1 = (ArrayList) sort.get(j);
                double d1 = (double) t1.get(2);
                //System.out.println(d1);
                
                ArrayList t2 = (ArrayList) sort.get(j+1);
                double d2 = (double) t2.get(2);
               // System.out.println(d2);
                if(d1<d2)
                {
                    sort.set(j, t2);
                    sort.set(j+1, t1);
                }
            }
        }

        return sort;
    }
}
