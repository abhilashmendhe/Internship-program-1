/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regression;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class LRinit {
    
    public ArrayList initialize(ArrayList clusters)
    {
        
        ArrayList rangecluster = new Rrangecluster().range(clusters);
        System.out.println("Ranges of Regression");
        for(int i=0; i<rangecluster.size(); i++)
            System.out.println(rangecluster.get(i));
        System.out.println("\n\n");
        ArrayList cluster = new RCluster().newRcluster(clusters,rangecluster);
        System.out.println("Cluster of Regression");
        System.out.println("");
        for(int i=0; i<cluster.size(); i++)
        {
            ArrayList t = (ArrayList) cluster.get(i);
            System.out.println("Cluster "+i);
            for(int j=2; j<t.size(); j++)
            {
                System.out.println(t.get(j));
            }
            System.out.println("\n\n");
        }
        
        return cluster;
        
    }
}
