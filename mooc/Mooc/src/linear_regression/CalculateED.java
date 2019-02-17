/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear_regression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author abhilash
 */
public class CalculateED {
 
    public ArrayList calculate_cert(ArrayList cert_clust, ArrayList labeldata)
    {
        //System.out.println("Certified Cluster");
        ArrayList ret_certified_cluster = new ArrayList();
        double small=0.0;
        ArrayList<Double> meanval = new ArrayList<Double>();
        for(int i=0; i<cert_clust.size(); i++)
        {
            ArrayList t_cluster = (ArrayList)cert_clust.get(i);
            
            double mean = 0;
            for(int j=1; j<labeldata.size(); j++)
            {
                ArrayList t = (ArrayList) labeldata.get(j);
                
                double sum = 0;
                for(int k=0; k<t_cluster.size(); k++)
                {
                    ArrayList t_clust_data = (ArrayList)t_cluster.get(k);
                    
                    double temp1_2 = Double.parseDouble((String)t.get(2));
                    double temp2_2 = Double.parseDouble((String)t_clust_data.get(2));
                    double ed2 = Math.pow((temp1_2-temp2_2), 2);
                    ed2=Math.sqrt(ed2);

                    double temp1_3 = Double.parseDouble((String)t.get(3));
                    double temp2_3 = Double.parseDouble((String)t_clust_data.get(3));
                    double ed3 = Math.pow((temp1_3-temp2_3), 2);
                    ed3=Math.sqrt(ed3);
                    
                    double temp1_5 = Double.parseDouble((String)t.get(5));
                    double temp2_5 = Double.parseDouble((String)t_clust_data.get(6));
                    double ed5 = Math.pow((temp1_5-temp2_5), 2);
                    ed5=Math.sqrt(ed5);
                    
                    double temp1_6 = Double.parseDouble((String)t.get(6));
                    double temp2_6 = Double.parseDouble((String)t_clust_data.get(7));
                    double ed6 = Math.pow((temp1_5-temp2_5), 2);
                    ed6=Math.sqrt(ed6);
                    
                    double temp1_7 = Double.parseDouble((String)t.get(7));
                    double temp2_7 = Double.parseDouble((String)t_clust_data.get(8));
                    double ed7 = Math.pow((temp1_7-temp2_7), 2);
                    ed7=Math.sqrt(ed7);
                    
                    double temp1_10 = Double.parseDouble((String)t.get(10));
                    double temp2_10 = Double.parseDouble((String)t_clust_data.get(11));
                    double ed10 = Math.pow((temp1_10-temp2_10), 2);
                    ed10=Math.sqrt(ed10);
                    
                    double temp1_12 = Double.parseDouble((String)t.get(12));
                    double temp2_12 = Double.parseDouble((String)t_clust_data.get(13));
                    double ed12 = Math.pow((temp1_12-temp2_12), 2);
                    ed12=Math.sqrt(ed12);
                    
                    double temp1_13 = Double.parseDouble((String)t.get(13));
                    double temp2_13 = Double.parseDouble((String)t_clust_data.get(14));
                    double ed13 = Math.pow((temp1_13-temp2_13), 2);
                    ed13=Math.sqrt(ed13);
                    
                    double temp1_14 = Double.parseDouble((String)t.get(14));
                    double temp2_14 = Double.parseDouble((String)t_clust_data.get(15));
                    double ed14 = Math.pow((temp1_14-temp2_14), 2);
                    ed14=Math.sqrt(ed14);
                    
                    
                    double total = ed2+ed3+ed5+ed6+ed7+ed10+ed12+ed13+ed14;
                    total = total/9;
                    sum+=total;
                }
                sum = sum / t_cluster.size();
                mean +=sum;
                
            }
            mean = mean / (labeldata.size()-1);

            
            
           meanval.add(mean);
        }

            int index = 0;
            small = meanval.get(0);
            for(int i=0; i<meanval.size(); i++)
            {
                double t = meanval.get(i);
                if(small>t)
                {
                    index = i;
                }
            }

          ret_certified_cluster.addAll((Collection) cert_clust.get(index));
          
        return ret_certified_cluster;
    }
    
    public ArrayList calculate_noncert(ArrayList noncert_clust, ArrayList labeldata)
    {
        //System.out.println("\n Non Certified Cluster");
        ArrayList ret_non_certified_cluster = new ArrayList();
        double small=0.0;
        ArrayList<Double> meanval = new ArrayList<Double>();
        
        for(int i=0; i<noncert_clust.size(); i++)
        {
            ArrayList t_cluster = (ArrayList)noncert_clust.get(i);
            
            double mean = 0;
            for(int j=1; j<labeldata.size(); j++)
            {
                ArrayList t = (ArrayList) labeldata.get(j);
                
                double sum = 0;
                for(int k=0; k<t_cluster.size(); k++)
                {
                    ArrayList t_clust_data = (ArrayList)t_cluster.get(k);
                    
                    double temp1_2 = Double.parseDouble((String)t.get(2));
                    double temp2_2 = Double.parseDouble((String)t_clust_data.get(2));
                    double ed2 = Math.pow((temp1_2-temp2_2), 2);
                    ed2=Math.sqrt(ed2);

                    double temp1_3 = Double.parseDouble((String)t.get(3));
                    double temp2_3 = Double.parseDouble((String)t_clust_data.get(3));
                    double ed3 = Math.pow((temp1_3-temp2_3), 2);
                    ed3=Math.sqrt(ed3);
                    
                    double temp1_5 = Double.parseDouble((String)t.get(5));
                    double temp2_5 = Double.parseDouble((String)t_clust_data.get(6));
                    double ed5 = Math.pow((temp1_5-temp2_5), 2);
                    ed5=Math.sqrt(ed5);
                    
                    double temp1_6 = Double.parseDouble((String)t.get(6));
                    double temp2_6 = Double.parseDouble((String)t_clust_data.get(7));
                    double ed6 = Math.pow((temp1_5-temp2_5), 2);
                    ed6=Math.sqrt(ed6);
                    
                    double temp1_7 = Double.parseDouble((String)t.get(7));
                    double temp2_7 = Double.parseDouble((String)t_clust_data.get(8));
                    double ed7 = Math.pow((temp1_7-temp2_7), 2);
                    ed7=Math.sqrt(ed7);
                    
                    double temp1_10 = Double.parseDouble((String)t.get(10));
                    double temp2_10 = Double.parseDouble((String)t_clust_data.get(11));
                    double ed10 = Math.pow((temp1_10-temp2_10), 2);
                    ed10=Math.sqrt(ed10);
                    
                    double temp1_12 = Double.parseDouble((String)t.get(12));
                    double temp2_12 = Double.parseDouble((String)t_clust_data.get(13));
                    double ed12 = Math.pow((temp1_12-temp2_12), 2);
                    ed12=Math.sqrt(ed12);
                    
                    double temp1_13 = Double.parseDouble((String)t.get(13));
                    double temp2_13 = Double.parseDouble((String)t_clust_data.get(14));
                    double ed13 = Math.pow((temp1_13-temp2_13), 2);
                    ed13=Math.sqrt(ed13);
                    
                    double temp1_14 = Double.parseDouble((String)t.get(14));
                    double temp2_14 = Double.parseDouble((String)t_clust_data.get(15));
                    double ed14 = Math.pow((temp1_14-temp2_14), 2);
                    ed14=Math.sqrt(ed14);
                    
                    
                    double total = ed2+ed3+ed5+ed6+ed7+ed10+ed12+ed13+ed14;
                    total = total/9;
                    sum+=total;
                }
                
                sum = sum / t_cluster.size();
                
                mean += sum;
            }
            
            mean = mean / (labeldata.size()-1);
           
            meanval.add(mean);
        }
        
        int index = 0;
        small = meanval.get(0);
        for(int i=0; i<meanval.size(); i++)
        {
            double t = meanval.get(i);
            if(small>t)
            {
                index = i;
            }
        }
        
        ret_non_certified_cluster = (ArrayList) noncert_clust.get(index);
        return ret_non_certified_cluster;
    }
}
