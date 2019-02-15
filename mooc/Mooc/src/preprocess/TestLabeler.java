/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preprocess;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import jxl.read.biff.BiffException;

/**
 *
 * @author abhilash
 */
public class TestLabeler {
    
    
    public ArrayList getLabelledTest(ArrayList certi) throws IOException, BiffException
    {
        HashSet u1 = new HashSet();
        HashSet u2 = new HashSet();
        ArrayList uniqloe = new ArrayList();
        ArrayList uniqgen = new ArrayList();
        
        for(int i=1; i<certi.size(); i++)
        {
            ArrayList t = (ArrayList) certi.get(i);
            String loe=(String)t.get(5);
            String gen=(String)t.get(6);
            u1.add(loe);
            u2.add(gen);
        }
        
        uniqloe.addAll(u1);
        uniqgen.addAll(u2);
        
        ArrayList loeindex = new ArrayList();
        ArrayList genindex = new ArrayList();
        for(int i=0;i<uniqloe.size();i++)
        {
            ArrayList temp=new ArrayList();
            temp.add(Integer.toString(i));
            temp.add((String)uniqloe.get(i));
            loeindex.add(temp);
        }
        
        for(int i=0;i<uniqgen.size();i++)
        {
            ArrayList temp=new ArrayList();
            temp.add(Integer.toString(i));
            temp.add((String)uniqgen.get(i));
            genindex.add(temp);
        }

        ArrayList lablledcerti=new ArrayList();
         
        for(int i=1; i<certi.size(); i++)
        {
            ArrayList t = (ArrayList) certi.get(i);
            
            ArrayList temp=new ArrayList();
            for(int k=0;k<5;k++)
                temp.add((String)t.get(k));
                
            String loe=t.get(5).toString();
            String gen=t.get(6).toString();
            int x1=getLabel(loe,loeindex);
            
            int x2=getLabel(gen,genindex);
            temp.add(Integer.toString(x1));
            temp.add(Integer.toString(x2));
             
            for(int k=7;k<t.size();k++)
                temp.add((String)t.get(k));
            lablledcerti.add(temp);
        }
        
           return lablledcerti;
    }
    
    
    
    public int getLabel(String str,ArrayList label)
    {
        int  lab=0;
        
        for(int i=0;i<label.size();i++)
        {
            ArrayList t=(ArrayList) label.get(i);
            if(str.equals((String)t.get(1)))
            {
                lab=Integer.parseInt((String)t.get(0));
                break;
            }
       }
        return lab;
    }
   
    
    
}
