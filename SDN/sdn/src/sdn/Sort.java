/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdn;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class Sort {
    
    public ArrayList getsort(ArrayList all)
    {
        for(int i=0; i<all.size(); i++)
        {
            for(int j=0; j<all.size()-1; j++)
            {
                ArrayList t1 = (ArrayList) all.get(j);
                //System.out.println(t1.get(2));
                long size1 =  (long) t1.get(2);
                
                ArrayList t2 = (ArrayList) all.get(j+1);
                long size2 = (long) t2.get(2);
                
                if(size1>size2)
                {
                    all.set(j, t2);
                    all.set(j+1, t1);
                }
                
            }
        }
       return all;
    }
}
