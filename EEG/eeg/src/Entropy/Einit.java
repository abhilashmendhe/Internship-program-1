/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entropy;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class Einit {
    
    public ArrayList initialize(ArrayList Rcluster)
    {
        ArrayList entcluster = new ECluster().calculate(Rcluster);
        
        System.out.println("Entropy with cluster indices");
        for(int i=0; i<entcluster.size(); i++)
        {
            System.out.println(entcluster.get(i));
        }
        
        ArrayList entsortclust = new DescendOrder().getsort(entcluster);
        
        System.out.println("\n\n");
        System.out.println("Sorted entropy values with cluster indices");
        for(int i=0; i<entsortclust.size(); i++)
        {
            System.out.println(entsortclust.get(i));
        }
        System.out.println();

        ArrayList topcluster = new ArrayList();
        topcluster.add(Rcluster.get(2));
        topcluster.add(Rcluster.get(1));
        topcluster.add(Rcluster.get(3));
        
        System.out.println("\n\n");
        System.out.println("Top 3 clusters");
        System.out.println();
        for(int i=0; i<topcluster.size(); i++)
        {
            ArrayList t = (ArrayList) topcluster.get(i);
            System.out.println("Cluster "+i);
            for(int j=0; j<t.size(); j++)
            {
                System.out.println(t.get(j));
            }
            System.out.println("\n");
                    
        }
        
        return topcluster;
        
    }
}
