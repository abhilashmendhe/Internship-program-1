/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiddenmarkovmodel;

import java.util.ArrayList;
import kmeans.Clusters;

/**
 *
 * @author abhilash
 */
public class Baumwelch {
    
    public double[][] getMatrix(ArrayList cert_cluster_fp, ArrayList cert_cluster_bp, ArrayList noncert_cluster_fp, ArrayList noncert_cluster_bp, ArrayList singletestlabel)
    {
        double mat[][] = new double[2][2];
        
        
        
        double mean_cert_fp = 0;
        
        for(int i=0; i<cert_cluster_fp.size(); i++)
        {
            ArrayList t = (ArrayList) cert_cluster_fp.get(i);
            double temp1_2 = Double.parseDouble((String)singletestlabel.get(2));
            double temp2_2 = Double.parseDouble((String)t.get(2));
            double ed2 = Math.pow((temp1_2-temp2_2), 2);
            ed2=Math.sqrt(ed2);

            double temp1_3 = Double.parseDouble((String)singletestlabel.get(3));
            double temp2_3 = Double.parseDouble((String)t.get(3));
            double ed3 = Math.pow((temp1_3-temp2_3), 2);
            ed3=Math.sqrt(ed3);

            double temp1_5 = Double.parseDouble((String)singletestlabel.get(5));
            double temp2_5 = Double.parseDouble((String)t.get(6));
            double ed5 = Math.pow((temp1_5-temp2_5), 2);
            ed5=Math.sqrt(ed5);

            double temp1_6 = Double.parseDouble((String)singletestlabel.get(6));
            double temp2_6 = Double.parseDouble((String)t.get(7));
            double ed6 = Math.pow((temp1_5-temp2_5), 2);
            ed6=Math.sqrt(ed6);

            double temp1_7 = Double.parseDouble((String)singletestlabel.get(7));
            double temp2_7 = Double.parseDouble((String)t.get(8));
            double ed7 = Math.pow((temp1_7-temp2_7), 2);
            ed7=Math.sqrt(ed7);

            double temp1_10 = Double.parseDouble((String)singletestlabel.get(10));
            double temp2_10 = Double.parseDouble((String)t.get(11));
            double ed10 = Math.pow((temp1_10-temp2_10), 2);
            ed10=Math.sqrt(ed10);

            double temp1_12 = Double.parseDouble((String)singletestlabel.get(12));
            double temp2_12 = Double.parseDouble((String)t.get(13));
            double ed12 = Math.pow((temp1_12-temp2_12), 2);
            ed12=Math.sqrt(ed12);

            double temp1_13 = Double.parseDouble((String)singletestlabel.get(13));
            double temp2_13 = Double.parseDouble((String)t.get(14));
            double ed13 = Math.pow((temp1_13-temp2_13), 2);
            ed13=Math.sqrt(ed13);

            double temp1_14 = Double.parseDouble((String)singletestlabel.get(14));
            double temp2_14 = Double.parseDouble((String)t.get(15));
            double ed14 = Math.pow((temp1_14-temp2_14), 2);
            ed14=Math.sqrt(ed14);
            
            double total = ed2+ed3+ed5+ed6+ed7+ed10+ed12+ed13+ed14;
            total = total / 9;
            mean_cert_fp += total;
        }
        
        mean_cert_fp = mean_cert_fp / cert_cluster_fp.size(); 
        
        double mean_cert_bp = 0;
        
        for(int i=0; i<cert_cluster_bp.size(); i++)
        {
            ArrayList t = (ArrayList) cert_cluster_bp.get(i);
            double temp1_2 = Double.parseDouble((String)singletestlabel.get(2));
            double temp2_2 = Double.parseDouble((String)t.get(2));
            double ed2 = Math.pow((temp1_2-temp2_2), 2);
            ed2=Math.sqrt(ed2);

            double temp1_3 = Double.parseDouble((String)singletestlabel.get(3));
            double temp2_3 = Double.parseDouble((String)t.get(3));
            double ed3 = Math.pow((temp1_3-temp2_3), 2);
            ed3=Math.sqrt(ed3);

            double temp1_5 = Double.parseDouble((String)singletestlabel.get(5));
            double temp2_5 = Double.parseDouble((String)t.get(6));
            double ed5 = Math.pow((temp1_5-temp2_5), 2);
            ed5=Math.sqrt(ed5);

            double temp1_6 = Double.parseDouble((String)singletestlabel.get(6));
            double temp2_6 = Double.parseDouble((String)t.get(7));
            double ed6 = Math.pow((temp1_5-temp2_5), 2);
            ed6=Math.sqrt(ed6);

            double temp1_7 = Double.parseDouble((String)singletestlabel.get(7));
            double temp2_7 = Double.parseDouble((String)t.get(8));
            double ed7 = Math.pow((temp1_7-temp2_7), 2);
            ed7=Math.sqrt(ed7);

            double temp1_10 = Double.parseDouble((String)singletestlabel.get(10));
            double temp2_10 = Double.parseDouble((String)t.get(11));
            double ed10 = Math.pow((temp1_10-temp2_10), 2);
            ed10=Math.sqrt(ed10);

            double temp1_12 = Double.parseDouble((String)singletestlabel.get(12));
            double temp2_12 = Double.parseDouble((String)t.get(13));
            double ed12 = Math.pow((temp1_12-temp2_12), 2);
            ed12=Math.sqrt(ed12);

            double temp1_13 = Double.parseDouble((String)singletestlabel.get(13));
            double temp2_13 = Double.parseDouble((String)t.get(14));
            double ed13 = Math.pow((temp1_13-temp2_13), 2);
            ed13=Math.sqrt(ed13);

            double temp1_14 = Double.parseDouble((String)singletestlabel.get(14));
            double temp2_14 = Double.parseDouble((String)t.get(15));
            double ed14 = Math.pow((temp1_14-temp2_14), 2);
            ed14=Math.sqrt(ed14);
            
            double total = ed2+ed3+ed5+ed6+ed7+ed10+ed12+ed13+ed14;
            total = total / 9;
            mean_cert_bp += total;
        }
        
        mean_cert_bp = mean_cert_bp / cert_cluster_bp.size(); 
        
        double mean_noncert_fp = 0;
        
        for(int i=0; i<noncert_cluster_fp.size(); i++)
        {
            ArrayList t = (ArrayList) noncert_cluster_fp.get(i);
            double temp1_2 = Double.parseDouble((String)singletestlabel.get(2));
            double temp2_2 = Double.parseDouble((String)t.get(2));
            double ed2 = Math.pow((temp1_2-temp2_2), 2);
            ed2=Math.sqrt(ed2);

            double temp1_3 = Double.parseDouble((String)singletestlabel.get(3));
            double temp2_3 = Double.parseDouble((String)t.get(3));
            double ed3 = Math.pow((temp1_3-temp2_3), 2);
            ed3=Math.sqrt(ed3);

            double temp1_5 = Double.parseDouble((String)singletestlabel.get(5));
            double temp2_5 = Double.parseDouble((String)t.get(6));
            double ed5 = Math.pow((temp1_5-temp2_5), 2);
            ed5=Math.sqrt(ed5);

            double temp1_6 = Double.parseDouble((String)singletestlabel.get(6));
            double temp2_6 = Double.parseDouble((String)t.get(7));
            double ed6 = Math.pow((temp1_5-temp2_5), 2);
            ed6=Math.sqrt(ed6);

            double temp1_7 = Double.parseDouble((String)singletestlabel.get(7));
            double temp2_7 = Double.parseDouble((String)t.get(8));
            double ed7 = Math.pow((temp1_7-temp2_7), 2);
            ed7=Math.sqrt(ed7);

            double temp1_10 = Double.parseDouble((String)singletestlabel.get(10));
            double temp2_10 = Double.parseDouble((String)t.get(11));
            double ed10 = Math.pow((temp1_10-temp2_10), 2);
            ed10=Math.sqrt(ed10);

            double temp1_12 = Double.parseDouble((String)singletestlabel.get(12));
            double temp2_12 = Double.parseDouble((String)t.get(13));
            double ed12 = Math.pow((temp1_12-temp2_12), 2);
            ed12=Math.sqrt(ed12);

            double temp1_13 = Double.parseDouble((String)singletestlabel.get(13));
            double temp2_13 = Double.parseDouble((String)t.get(14));
            double ed13 = Math.pow((temp1_13-temp2_13), 2);
            ed13=Math.sqrt(ed13);

            double temp1_14 = Double.parseDouble((String)singletestlabel.get(14));
            double temp2_14 = Double.parseDouble((String)t.get(15));
            double ed14 = Math.pow((temp1_14-temp2_14), 2);
            ed14=Math.sqrt(ed14);
            
            double total = ed2+ed3+ed5+ed6+ed7+ed10+ed12+ed13+ed14;
            total = total / 9;
            mean_noncert_fp += total;
        }
        
        mean_noncert_fp = mean_noncert_fp / noncert_cluster_fp.size(); 
        
        double mean_noncert_bp = 0;
        
        for(int i=0; i<noncert_cluster_bp.size(); i++)
        {
            ArrayList t = (ArrayList) noncert_cluster_bp.get(i);
            double temp1_2 = Double.parseDouble((String)singletestlabel.get(2));
            double temp2_2 = Double.parseDouble((String)t.get(2));
            double ed2 = Math.pow((temp1_2-temp2_2), 2);
            ed2=Math.sqrt(ed2);

            double temp1_3 = Double.parseDouble((String)singletestlabel.get(3));
            double temp2_3 = Double.parseDouble((String)t.get(3));
            double ed3 = Math.pow((temp1_3-temp2_3), 2);
            ed3=Math.sqrt(ed3);

            double temp1_5 = Double.parseDouble((String)singletestlabel.get(5));
            double temp2_5 = Double.parseDouble((String)t.get(6));
            double ed5 = Math.pow((temp1_5-temp2_5), 2);
            ed5=Math.sqrt(ed5);

            double temp1_6 = Double.parseDouble((String)singletestlabel.get(6));
            double temp2_6 = Double.parseDouble((String)t.get(7));
            double ed6 = Math.pow((temp1_5-temp2_5), 2);
            ed6=Math.sqrt(ed6);

            double temp1_7 = Double.parseDouble((String)singletestlabel.get(7));
            double temp2_7 = Double.parseDouble((String)t.get(8));
            double ed7 = Math.pow((temp1_7-temp2_7), 2);
            ed7=Math.sqrt(ed7);

            double temp1_10 = Double.parseDouble((String)singletestlabel.get(10));
            double temp2_10 = Double.parseDouble((String)t.get(11));
            double ed10 = Math.pow((temp1_10-temp2_10), 2);
            ed10=Math.sqrt(ed10);

            double temp1_12 = Double.parseDouble((String)singletestlabel.get(12));
            double temp2_12 = Double.parseDouble((String)t.get(13));
            double ed12 = Math.pow((temp1_12-temp2_12), 2);
            ed12=Math.sqrt(ed12);

            double temp1_13 = Double.parseDouble((String)singletestlabel.get(13));
            double temp2_13 = Double.parseDouble((String)t.get(14));
            double ed13 = Math.pow((temp1_13-temp2_13), 2);
            ed13=Math.sqrt(ed13);

            double temp1_14 = Double.parseDouble((String)singletestlabel.get(14));
            double temp2_14 = Double.parseDouble((String)t.get(15));
            double ed14 = Math.pow((temp1_14-temp2_14), 2);
            ed14=Math.sqrt(ed14);
            
            double total = ed2+ed3+ed5+ed6+ed7+ed10+ed12+ed13+ed14;
            total = total / 9;
            mean_noncert_bp += total;
        }
        
        mean_noncert_bp = mean_noncert_bp / noncert_cluster_bp.size(); 
        //System.out.println(mean_cert_fp);
        
        mat[0][0] = mean_cert_fp;
        mat[0][1] = mean_cert_bp;
        mat[1][0] = mean_noncert_fp;
        mat[1][1] = mean_noncert_bp;
        
        return mat;
    }
}
