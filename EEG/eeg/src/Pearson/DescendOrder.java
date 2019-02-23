/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pearson;

import Entropy.*;
import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class DescendOrder {
    
    public ArrayList getsort(ArrayList entc)
    {
        ArrayList sorted = new ArrayList();
        
        for(int i=0; i<entc.size(); i++)
        {
            
            for(int j=0; j<entc.size()-1; j++)
            {
                ArrayList t = (ArrayList) entc.get(j);
                double v1 = (double)t.get(1);
 
                ArrayList t1 = (ArrayList) entc.get(j+1);
                double v2 = (double)  t1.get(1);
            
                if (v1 < v2) {
                    entc.set(j, t1);
                    entc.set(j+1, t);
                }
            }
        }
        
        return entc;
    }
}
