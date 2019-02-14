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
public class DistanceEvaluator {
    
    public double calculateCertD(ArrayList certD)
    {
        
        ArrayList master = new ArrayList();
        double esum=0;
       
        for(int i=0; i<certD.size(); i++)
        {
            ArrayList t1 = (ArrayList)certD.get(i);
            
            double sum = 0;
            for(int j=0; j<certD.size(); j++)
            {
                ArrayList t2 = (ArrayList)certD.get(j);
                
                    
                if(i!=j)
                {

                    double temp1_2 = Double.parseDouble((String)t1.get(2));
                    double temp2_2 = Double.parseDouble((String)t2.get(2));
                    double ed2 = Math.pow((temp1_2-temp2_2), 2);
                    ed2=Math.sqrt(ed2);

                    double temp1_3 = Double.parseDouble((String)t1.get(3));
                    double temp2_3 = Double.parseDouble((String)t2.get(3));
                    double ed3 = Math.pow((temp1_3-temp2_3), 2);
                    ed3=Math.sqrt(ed3);
                    
                    double temp1_6 = Double.parseDouble((String)t1.get(6));
                    double temp2_6 = Double.parseDouble((String)t2.get(6));
                    double ed6 = Math.pow((temp1_6-temp2_6), 2);
                    ed6=Math.sqrt(ed6);
                    
                    double temp1_7 = Double.parseDouble((String)t1.get(7));
                    double temp2_7 = Double.parseDouble((String)t2.get(7));
                    double ed7 = Math.pow((temp1_7-temp2_7), 2);
                    ed7=Math.sqrt(ed7);
                    
                    double temp1_8 = Double.parseDouble((String)t1.get(8));
                    double temp2_8 = Double.parseDouble((String)t2.get(8));
                    double ed8 = Math.pow((temp1_8-temp2_8), 2);
                    ed8=Math.sqrt(ed8);
                    
                    double temp1_11 = Double.parseDouble((String)t1.get(11));
                    double temp2_11 = Double.parseDouble((String)t2.get(11));
                    double ed11 = Math.pow((temp1_11-temp2_11), 2);
                    ed11=Math.sqrt(ed11);
                    
                    double temp1_13 = Double.parseDouble((String)t1.get(13));
                    double temp2_13 = Double.parseDouble((String)t2.get(13));
                    double ed13 = Math.pow((temp1_13-temp2_13), 2);
                    ed13=Math.sqrt(ed13);
                    
                    double temp1_14 = Double.parseDouble((String)t1.get(14));
                    double temp2_14 = Double.parseDouble((String)t2.get(14));
                    double ed14 = Math.pow((temp1_14-temp2_14), 2);
                    ed14=Math.sqrt(ed14);
                    
                    double temp1_15 = Double.parseDouble((String)t1.get(15));
                    double temp2_15 = Double.parseDouble((String)t2.get(15));
                    double ed15 = Math.pow((temp1_15-temp2_15), 2);
                    ed15=Math.sqrt(ed15);
                    
                    double total = ed2+ed3+ed6+ed7+ed8+ed11+ed13+ed14+ed15;
                    total=total/9;
                    sum=sum+total;

                }
                
               
            }
            
            sum=sum/certD.size()-1;
            t1.add(sum);
            master.add(t1);
            esum=esum+sum;
        }
        
        esum=esum/certD.size();
        esum=Math.sqrt(esum);
        Datakeeper.certifiedmaster=master;
        
        return esum;
    }
    
    public double calculateNonCertD(ArrayList nocertD)
    {
        
        ArrayList master = new ArrayList();
        double esum=0;
       
        for(int i=0; i<nocertD.size(); i++)
        {
            ArrayList t1 = (ArrayList)nocertD.get(i);
            
            double sum = 0;
            for(int j=0; j<nocertD.size(); j++)
            {
                ArrayList t2 = (ArrayList)nocertD.get(j);
                
                    
                if(i!=j)
                {

                    double temp1_2 = Double.parseDouble((String)t1.get(2));
                    double temp2_2 = Double.parseDouble((String)t2.get(2));
                    double ed2 = Math.pow((temp1_2-temp2_2), 2);
                    ed2=Math.sqrt(ed2);

                    double temp1_3 = Double.parseDouble((String)t1.get(3));
                    double temp2_3 = Double.parseDouble((String)t2.get(3));
                    double ed3 = Math.pow((temp1_3-temp2_3), 2);
                    ed3=Math.sqrt(ed3);
                    
                    double temp1_6 = Double.parseDouble((String)t1.get(6));
                    double temp2_6 = Double.parseDouble((String)t2.get(6));
                    double ed6 = Math.pow((temp1_6-temp2_6), 2);
                    ed6=Math.sqrt(ed6);
                    
                    double temp1_7 = Double.parseDouble((String)t1.get(7));
                    double temp2_7 = Double.parseDouble((String)t2.get(7));
                    double ed7 = Math.pow((temp1_7-temp2_7), 2);
                    ed7=Math.sqrt(ed7);
                    
                    double temp1_8 = Double.parseDouble((String)t1.get(8));
                    double temp2_8 = Double.parseDouble((String)t2.get(8));
                    double ed8 = Math.pow((temp1_8-temp2_8), 2);
                    ed8=Math.sqrt(ed8);
                    
                    double temp1_11 = Double.parseDouble((String)t1.get(11));
                    double temp2_11 = Double.parseDouble((String)t2.get(11));
                    double ed11 = Math.pow((temp1_11-temp2_11), 2);
                    ed11=Math.sqrt(ed11);
                    
                    double temp1_13 = Double.parseDouble((String)t1.get(13));
                    double temp2_13 = Double.parseDouble((String)t2.get(13));
                    double ed13 = Math.pow((temp1_13-temp2_13), 2);
                    ed13=Math.sqrt(ed13);
                    
                    double temp1_14 = Double.parseDouble((String)t1.get(14));
                    double temp2_14 = Double.parseDouble((String)t2.get(14));
                    double ed14 = Math.pow((temp1_14-temp2_14), 2);
                    ed14=Math.sqrt(ed14);
                    
                    double temp1_15 = Double.parseDouble((String)t1.get(15));
                    double temp2_15 = Double.parseDouble((String)t2.get(15));
                    double ed15 = Math.pow((temp1_15-temp2_15), 2);
                    ed15=Math.sqrt(ed15);
                    
                    double total = ed2+ed3+ed6+ed7+ed8+ed11+ed13+ed14+ed15;
                    total=total/9;
                    sum=sum+total;

                }
                
               
            }
            
            sum=sum/nocertD.size()-1;
            t1.add(sum);
            master.add(t1);
            esum=esum+sum;
        }
        
        esum=esum/nocertD.size();
        esum=Math.sqrt(esum);
        Datakeeper.noncertifiedmaster=master;
        
        return esum;
    }
}
