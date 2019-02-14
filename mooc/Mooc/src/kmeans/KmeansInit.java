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
    
    public void initialize(ArrayList certdata, ArrayList noncertdata){
        
        double ecertsum = new DistanceEvaluator().calculateCertD(certdata);
        ArrayList Certcentroids = new Centroid().getCertCentroid();
        ArrayList getCertRange = new RangeMaker().getR(Certcentroids,ecertsum);
        ArrayList certclusters = new Clusters().getCertClusters(getCertRange);
        
        
        double cnoncertsum = new DistanceEvaluator().calculateNonCertD(noncertdata);
        ArrayList NonCertcentroids = new Centroid().getNonCertCentroid();
        ArrayList getNonCertRange = new RangeMaker().getR(NonCertcentroids, cnoncertsum);
        ArrayList noncertclusters = new Clusters().getNonCertClusters(getNonCertRange);
        
        for(int i=0; i<noncertclusters.size(); i++)
            System.out.println(noncertclusters.get(i));
    }
}
