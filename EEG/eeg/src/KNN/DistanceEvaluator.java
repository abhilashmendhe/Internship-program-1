/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KNN;

import java.util.ArrayList;
import preprocess.Datakeeper;

/**
 *
 * @author abhilash
 */
public class DistanceEvaluator {
    
    public double calculateD(ArrayList data)
    {
        
        ArrayList master = new ArrayList();
        double esum=0;
       
        for(int i=0; i<data.size(); i++)
        {
            ArrayList t1 = (ArrayList)data.get(i);
            
            double sum = 0;
            for(int j=0; j<data.size(); j++)
            {
                ArrayList t2 = (ArrayList)data.get(j);
                
                    
                if(i!=j)
                {

                    double temp1_2 = Double.parseDouble((String)t1.get(11));
                    double temp2_2 = Double.parseDouble((String)t2.get(11));
                    double ed2 = Math.pow((temp1_2-temp2_2), 2);
                    ed2=Math.sqrt(ed2);

                    double temp1_3 = Double.parseDouble((String)t1.get(12));
                    double temp2_3 = Double.parseDouble((String)t2.get(12));
                    double ed3 = Math.pow((temp1_3-temp2_3), 2);
                    ed3=Math.sqrt(ed3);
                    
                    double temp1_6 = Double.parseDouble((String)t1.get(13));
                    double temp2_6 = Double.parseDouble((String)t2.get(13));
                    double ed6 = Math.pow((temp1_6-temp2_6), 2);
                    ed6=Math.sqrt(ed6);
//                    
//                    double temp1_7 = Double.parseDouble((String)t1.get(14));
//                    double temp2_7 = Double.parseDouble((String)t2.get(14));
//                    double ed7 = Math.pow((temp1_7-temp2_7), 2);
//                    ed7=Math.sqrt(ed7);
//                    
//                    double temp1_8 = Double.parseDouble((String)t1.get(16));
//                    double temp2_8 = Double.parseDouble((String)t2.get(16));
//                    double ed8 = Math.pow((temp1_8-temp2_8), 2);
//                    ed8=Math.sqrt(ed8);
                    
                    double temp1_11 = Double.parseDouble((String)t1.get(17));
                    double temp2_11 = Double.parseDouble((String)t2.get(17));
                    double ed11 = Math.pow((temp1_11-temp2_11), 2);
                    ed11=Math.sqrt(ed11);
                    
                    
                    double total = ed2+ed3+ed6+ed11;
                    total=total/6;
                    sum=sum+total;

                }
                
               
            }
            
            sum=sum/data.size()-1;
            t1.add(sum);
            master.add(t1);
            esum=esum+sum;
            //System.out.println(sum);
            //System.out.println(t1);
        }
        
        esum=esum/data.size();
        esum=Math.sqrt(esum);
        esum=Math.sqrt(esum);
        
        Datakeeper.addeddistance = master;
        return esum;
    }
    
}
