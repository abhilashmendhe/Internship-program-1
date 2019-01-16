/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

import java.util.ArrayList;
import java.util.HashSet;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author abhilash
 */
public class DescendingOrder {
    
    public void getContentsinDescendingOrder(String cont)
    {
        ArrayList addall = new ArrayList();
        String tempc = cont.toLowerCase();
        String[] allcontent = tempc.split(" ");
        
        for(int i=0; i<allcontent.length; i++)
        {
            int count = 0;
            ArrayList tempcont = new ArrayList();
            for(int j=0; j<allcontent.length; j++)
            {
                String t = allcontent[i].trim();
                if(t.equals(allcontent[j]))
                    count++;
            }
            tempcont.add(allcontent[i]);
            tempcont.add(count);
            addall.add(tempcont);
//            System.out.println(allcontent[i]);
        }
        HashSet aa = new HashSet();
        aa.addAll(addall);
        addall.clear();
        addall.addAll(aa);
        //System.out.println(addall);
        
        for(int i=0; i<addall.size(); i++)
        {
            for(int j=0; j<addall.size()-1; j++)
            {
                ArrayList tmp1 = new ArrayList();
                tmp1 = (ArrayList) addall.get(j);
                int n1 = (int) tmp1.get(1);
                
                ArrayList tmp2 = new ArrayList();
                tmp2 = (ArrayList) addall.get(j+1);
                int n2 = (int) tmp2.get(1);
                
                if(n1<n2)
                {
                    addall.set(j, tmp2);
                    addall.set(j+1, tmp1);
                }
            }
        }
        
        System.out.println("Word contents");
        for(int i=0; i<addall.size(); i++)
        {
            System.out.println(addall.get(i));
        }
        
    }
}
