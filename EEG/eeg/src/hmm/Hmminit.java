/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmm;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class Hmminit {
    
    public ArrayList initialize(ArrayList clust, ArrayList labelledData)
    {
        double mean_clust = new Mean_SD().getMean(clust);
        double sd_clust = new Mean_SD().getSD(clust);
        System.out.println("\n\n");
        System.out.println("Mean of HMM cluster: "+mean_clust);
        System.out.println("SD of HMM cluster: "+sd_clust);
        System.out.println("");
        ArrayList backwardP = new BackwardProbabilty().getBP(clust, mean_clust, sd_clust);
        ArrayList forwardP = new ForwardProbabilty().get(clust, mean_clust, sd_clust);
        
        ArrayList getclust = new ArrayList();
        
        if(backwardP.size() > forwardP.size())
            getclust.addAll(backwardP);
        else
            getclust.addAll(forwardP);
        
        System.out.println("Top cluster from HMM");
        for(int i=0; i<getclust.size(); i++)
        {
            System.out.println(getclust.get(i));
        }
        
        return getclust;
    }
}
