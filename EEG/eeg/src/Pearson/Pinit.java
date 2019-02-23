/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pearson;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class Pinit {
    
    public ArrayList initialize(ArrayList topcluster)
    {
        ArrayList clusterPearsonCo = new MeanOfClusterCorelation().cal(topcluster);
        System.out.println("Cluster of pearsonCo");
        for(int i=0; i<clusterPearsonCo.size(); i++)
        {
            System.out.println(clusterPearsonCo.get(i));
        }
        
        ArrayList sortedclustP = new DescendOrder().getsort(clusterPearsonCo);
        System.out.println("Sorted Pearson cluster");
        for(int i=0; i<sortedclustP.size(); i++)
            System.out.println(sortedclustP.get(i));
        
        ArrayList firstclust = (ArrayList) sortedclustP.get(0);
        int topindex = (int) firstclust.get(0);
        
        ArrayList firsttopcluster = (ArrayList) topcluster.get(topindex);
        
        return firsttopcluster;
                
    }
}
