/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiddenmarkovmodel;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class HMMinit {
    
    public void initialize(ArrayList LRcertified, ArrayList LRnoncertified, ArrayList labeltest)
    {
        
        double mean_lr_certified = new Mean_SD().getMean(LRcertified);
        double sd_lr_certified = new Mean_SD().getSD(LRcertified);
        
        ArrayList cert_cluster_bp = new BackwardProbabilty().getBP(LRcertified, mean_lr_certified, sd_lr_certified);
        ArrayList cert_cluster_fp = new ForwardProbabilty().get(LRcertified, mean_lr_certified, sd_lr_certified);
        
        double mean_lr_noncertified = new Mean_SD().getMean(LRnoncertified);
        double sd_lr_noncertified = new Mean_SD().getSD(LRnoncertified);
        
        ArrayList noncert_cluster_bp = new BackwardProbabilty().getBP(LRnoncertified, mean_lr_noncertified, sd_lr_noncertified);
        ArrayList noncert_cluster_fp = new ForwardProbabilty().get(LRnoncertified, mean_lr_noncertified, sd_lr_noncertified);
        
        double welchmat[][] = new double[2][2];
        System.out.println("Welch matrix\n");
        
        System.out.println(" cert_cluster_fp "+"        cert_cluster_bp");
        System.out.println(" noncert_cluster_fp "+"     noncert_cluster_bp");
        System.out.println("\n");
        
        for(int i=0; i<labeltest.size(); i++)
        {
            ArrayList t = (ArrayList) labeltest.get(i);
            welchmat = new Baumwelch().getMatrix(cert_cluster_fp, cert_cluster_bp, noncert_cluster_fp, noncert_cluster_bp, t);
            System.out.println("User ID: "+t.get(1));
            for(int j=0; j<welchmat.length; j++)
            {
                for(int k=0; k<welchmat[0].length; k++)
                    System.out.print(" "+welchmat[j][k]);
            
                System.out.println();
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
//        System.out.println("Certified cluster Backward P");
//        for(int i=0; i<cert_cluster_bp.size(); i++)
//            System.out.println(cert_cluster_bp.get(i));
//        
//        System.out.println("\n\nCertified cluster Forward P");
//        for(int i=0; i<cert_cluster_fp.size(); i++)
//            System.out.println(cert_cluster_fp.get(i));
//        
//        System.out.println("\n\n\n\n");
//        
//        System.out.println("Non Certified cluster Backward P");
//        for(int i=0; i<noncert_cluster_bp.size(); i++)
//            System.out.println(noncert_cluster_bp.get(i));
//        
//        System.out.println("\n\nNon Certified cluster Forward P");
//        for(int i=0; i<noncert_cluster_fp.size(); i++)
//            System.out.println(noncert_cluster_fp.get(i));
    }
}
