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
public class KmeansInit {
    
    public ArrayList initialize(ArrayList certdata, ArrayList noncertdata){
        
        double ecertsum = new DistanceEvaluator().calculateCertD(certdata);
        ArrayList Certcentroids = new Centroid().getCertCentroid();
        ArrayList getCertRange = new RangeMaker().getR(Certcentroids,ecertsum);
        ArrayList certclusters = new Clusters().getCertClusters(getCertRange);
        
        System.out.println("\n\n\n");
        System.out.println("Eucledian Distance of certified: "+ecertsum);
        System.out.println();
        System.out.println("Centroid of Certified");
        for(int i=0; i<Certcentroids.size(); i++)
            System.out.println(Certcentroids.get(i));
        System.out.println("\n");
        System.out.println("Certified cluster range");
        for(int i=0; i<getCertRange.size(); i++)
            System.out.println(getCertRange.get(i));
        System.out.println("\n");
        System.out.println("Cluster of Certified Data");
        for(int i=0; i<certclusters.size(); i++)
        {
            ArrayList t = (ArrayList) certclusters.get(i);
            System.out.println("Cluster: "+(i+1));
            for(int j=0; j<t.size(); j++)
            {
                System.out.println(t.get(j));
            }
            System.out.println("\n\n");
        }
        
        System.out.println("\n\n\n\n\n");
        double cnoncertsum = new DistanceEvaluator().calculateNonCertD(noncertdata);
        ArrayList NonCertcentroids = new Centroid().getNonCertCentroid();
        ArrayList getNonCertRange = new RangeMaker().getR(NonCertcentroids, cnoncertsum);
        ArrayList noncertclusters = new Clusters().getNonCertClusters(getNonCertRange);
        
        
        System.out.println("Eucledian Distance of non-certified: "+cnoncertsum);
        System.out.println();
        System.out.println("Centroid of non-Certified");
        for(int i=0; i<NonCertcentroids.size(); i++)
            System.out.println(NonCertcentroids.get(i));
        System.out.println("\n");
        System.out.println("Non-Certified cluster range");
        for(int i=0; i<getNonCertRange.size(); i++)
            System.out.println(getNonCertRange.get(i));
        System.out.println("\n");
        System.out.println("Cluster of Non-Certified Data");
        for(int i=0; i<noncertclusters.size(); i++)
        {
            ArrayList t = (ArrayList) noncertclusters.get(i);
            System.out.println("Cluster: "+(i+1));
            for(int j=0; j<t.size(); j++)
            {
                System.out.println(t.get(j));
            }
            System.out.println("\n\n");
        }
        
          ArrayList allclusters = new ArrayList();
          allclusters.add(certclusters);
          allclusters.add(noncertclusters);
          
          return allclusters;
                  
    }
}
