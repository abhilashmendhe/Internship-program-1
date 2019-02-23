/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KNN;

import java.util.ArrayList;
import preprocess.Datakeeper;

/**
 *
 * @author abhilash
 */
public class KnnInit {
    
    public ArrayList initialize(ArrayList data){
        
        double esum = new DistanceEvaluator().calculateD(data);
        ArrayList centroids = new Centroid().getCertCentroid();
        ArrayList getRange = new RangeMaker().getR(centroids,esum);
        ArrayList clusters = new Clusters().getCertClusters(getRange);
        
        System.out.println("Eucledian Distance: "+esum);
        System.out.println("\n\n");
        System.out.println("Centroids");
        for(int i=0; i<centroids.size(); i++)
            System.out.println(centroids.get(i));
        System.out.println("\n\n");
        System.out.println("Range");
        for(int i=0; i<getRange.size(); i++)
            System.out.println(getRange.get(i));
        System.out.println("\n\n\n");
        System.out.println("Cluster Data of KNN");
        System.out.println("");
        for(int i=0; i<clusters.size(); i++)
        {
            ArrayList t = (ArrayList) clusters.get(i);
            System.out.println("Cluster: "+(i+1));
            for(int j=0; j<t.size(); j++)
            {
                System.out.println(t.get(j));
            }
            System.out.println("\n\n");
        }
        
        System.out.println("\n\n\n\n\n");

          
          return clusters;
                  
    }
}
