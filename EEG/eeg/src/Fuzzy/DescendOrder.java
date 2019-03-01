/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuzzy;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class DescendOrder {
    
    public ArrayList getsort(ArrayList stability)
    {
        ArrayList sorted = new ArrayList();
        
        for(int i=0; i<stability.size(); i++)
        {
            
            for(int j=0; j<stability.size()-1; j++)
            {
                String ss1 = (String) stability.get(j);
                String s1[] = ss1.split("#");
                int v1 = Integer.parseInt(s1[0]);
            
                String ss2 = (String) stability.get(j+1);
                String s2[] = ss2.split("#");
                int v2 = Integer.parseInt(s2[0]);
                
                if (v1 < v2) {
                    stability.set(j, ss2);
                    stability.set(j+1, ss1);
                }
            }
        }
        
        return stability;
    }
}
