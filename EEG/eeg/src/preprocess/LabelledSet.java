/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preprocess;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author abhilash
 */
public class LabelledSet {
 
    public ArrayList getLabelledData(ArrayList alldata)
    {
        HashSet u3 = new HashSet();
        HashSet u4 = new HashSet();
        HashSet u5 = new HashSet();
        HashSet u6 = new HashSet();
        HashSet u7 = new HashSet();
        
        ArrayList u_smoker = new ArrayList();
        ArrayList u_med_treatment = new ArrayList();
        ArrayList u_med_supplements = new ArrayList();
        ArrayList u_test_type = new ArrayList();
        ArrayList u_test_name = new ArrayList();
        
        for(int i=0; i<alldata.size(); i++)
        {
            ArrayList t = (ArrayList) alldata.get(i);
            String smoker=(String)t.get(7).toString().trim();
            String med_treat=(String)t.get(8).toString().trim();
            String med_supple=(String)t.get(9).toString().trim();
            String test_t=(String)t.get(11).toString().trim();
            String test_n=(String)t.get(12).toString().trim();
            
            u3.add(smoker);
            u4.add(med_treat);
            u5.add(med_supple);
            u6.add(test_t);
            u7.add(test_n);
            
           
        }
         
        u_smoker.addAll(u3);
        u_med_treatment.addAll(u4); 
        u_med_supplements.addAll(u5);
        u_test_type.addAll(u6); 
        u_test_name.addAll(u7); 
//        u_smoker.remove(0);
//        u_med_treatment.remove(0);
//        u_med_supplements.remove(0);
//        u_test_type.remove(0);
//        u_test_name.remove(0);
        
        
        ArrayList smokerindex = new ArrayList();
        ArrayList med_treatindex = new ArrayList();
        ArrayList med_supplegenindex = new ArrayList();
        ArrayList test_tindex = new ArrayList();
        ArrayList test_nindex = new ArrayList();
        
        
        for(int i=0;i<u_smoker.size();i++)
        {
            ArrayList temp=new ArrayList();
            temp.add(Integer.toString(i));
            temp.add((String)u_smoker.get(i));
            smokerindex.add(temp);
        }
        
        for(int i=0;i<u_med_treatment.size();i++)
        {
            ArrayList temp=new ArrayList();
            temp.add(Integer.toString(i));
            temp.add((String)u_med_treatment.get(i));
            med_treatindex.add(temp);
        }
        for(int i=0;i<u_med_supplements.size();i++)
        {
            ArrayList temp=new ArrayList();
            temp.add(Integer.toString(i));
            temp.add((String)u_med_supplements.get(i));
            med_supplegenindex.add(temp);
        }
        for(int i=0;i<u_test_type.size();i++)
        {
            ArrayList temp=new ArrayList();
            temp.add(Integer.toString(i));
            temp.add((String)u_test_type.get(i));
            test_tindex.add(temp);
        }
        for(int i=0;i<u_test_name.size();i++)
        {
            ArrayList temp=new ArrayList();
            temp.add(Integer.toString(i));
            temp.add((String)u_test_name.get(i));
            test_nindex.add(temp);
        }
        
        ArrayList lablled = new ArrayList();
         
        for(int i=1; i<alldata.size(); i++)
        {
            ArrayList t = (ArrayList) alldata.get(i);
            
            ArrayList temp=new ArrayList();
            for(int k=0;k<7;k++)
                temp.add((String)t.get(k));
                
            
            String smoker=t.get(7).toString();
            String med_treat = t.get(8).toString();
            String med_supple = t.get(9).toString();
            String test_type = t.get(11).toString();
            String test_name = t.get(12).toString();
            
            int x1=getLabel(smoker,smokerindex);
            int x2=getLabel(med_treat,med_treatindex);
            int x3=getLabel(med_supple, med_supplegenindex);
            int x4=getLabel(test_type, test_tindex);
            int x5=getLabel(test_name, test_nindex);
            
            temp.add(Integer.toString(x1));
            temp.add(Integer.toString(x2));
            temp.add(Integer.toString(x3));
            
            for(int k=10;k<11;k++)
                temp.add((String)t.get(k));
            
            temp.add(Integer.toString(x4));
            temp.add(Integer.toString(x5));
            
            for(int k=13;k<t.size();k++)
                temp.add((String)t.get(k));
            lablled.add(temp);
        }
        return lablled;
        
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
