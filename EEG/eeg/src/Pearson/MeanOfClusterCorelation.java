/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pearson;

import java.util.ArrayList;
import preprocess.Datakeeper;
import sun.awt.motif.X11GBK;

/**
 *
 * @author abhilash
 */
public class MeanOfClusterCorelation {
    
    public ArrayList cal(ArrayList cluster)
    {
        String gender = Datakeeper.gen;
        String age = Datakeeper.age;
        String smoker = Datakeeper.smoker;
        String mt = Datakeeper.med_treat;
        String ms = Datakeeper.med_supple;
        
        ArrayList clusterPearsonCo = new ArrayList();
        for(int i=0; i<cluster.size(); i++)
        {
            ArrayList subclust = (ArrayList) cluster.get(i);
            int size = subclust.size();
            ArrayList addsub = new ArrayList();
            double mean = 0;
            double y[] = new double[size];
            
            for(int k=0; k<y.length; k++)
            {
                y[k] = k;
            }
            
            double x1[] = new double[size];
            double x2[] = new double[size];
            double x3[] = new double[size];
            double x4[] = new double[size];
            double x5[] = new double[size];
            for(int j=0; j<subclust.size(); j++)
            {
                ArrayList row = (ArrayList) subclust.get(j);
                if(gender.equals(row.get(2)))
                    x1[j] = j;
                else
                    x1[j] = 0;
                
                if(age.equals(row.get(3)))
                    x2[j] = j;
                else
                    x2[j] = 0;
                
                if(smoker.equals(row.get(7)))
                    x3[j] = j;
                else
                    x3[j] = 0;
                
                if(mt.equals(row.get(8)))
                    x4[j] = j;
                else
                    x4[j] = 0;
                
                if(ms.equals(row.get(9)))
                    x5[j] = j;
                else
                    x5[j] = 0;
            }
//            System.out.println("Cluster "+i);
//            System.out.println("");
//            System.out.print("y: ");
//            for(int m=0; m<y.length; m++)
//                System.out.print(" "+y[m]);
//            System.out.println();
//            System.out.print("x1: ");
//            for(int m=0; m<x1.length; m++)
//            {
//                System.out.print(" "+x1[m]);
//            }
//            System.out.println();
//            
//            System.out.print("x2: ");
//            for(int m=0; m<x2.length; m++)
//            {
//                System.out.print(" "+x2[m]);
//            }
//            System.out.println();
//            System.out.print("x3: ");
//            for(int m=0; m<x3.length; m++)
//            {
//                System.out.print(" "+x3[m]);
//            }
//            System.out.println();
//            System.out.print("x4: ");
//            for(int m=0; m<x4.length; m++)
//            {
//                System.out.print(" "+x4[m]);
//            }
//            System.out.println();
//            System.out.print("x5: ");
//            for(int m=0; m<x5.length; m++)
//            {
//                System.out.print(" "+x5[m]);
//            }
//            System.out.println();
//            
//            System.out.println("\n\n");
            double x1y = new PearsonCorrelation().getCorrelation(x1, y);
            double x2y = new PearsonCorrelation().getCorrelation(x2, y);
            double x3y = new PearsonCorrelation().getCorrelation(x3, y);
            double x4y = new PearsonCorrelation().getCorrelation(x4, y);
            double x5y = new PearsonCorrelation().getCorrelation(x5, y);
//            System.out.println(x1y);
//            System.out.println(x2y);
//            System.out.println(x3y);
//            System.out.println(x4y);
//            System.out.println(x5y);
            mean = x1y + x2y + x3y + x4y + x5y;
            mean = mean / 5;
            addsub.add(i);
            addsub.add(mean);
            clusterPearsonCo.add(addsub);
            
            
        }
            return clusterPearsonCo;
    }
}
