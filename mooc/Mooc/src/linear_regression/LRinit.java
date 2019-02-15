/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear_regression;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class LRinit {
    
    public void initialize(ArrayList cert_cluster, ArrayList non_cert_cluster, ArrayList labeldata)
    {
        ArrayList cert_cluster_on_testdata = new CalculateED().calculate_cert(cert_cluster,labeldata);
        ArrayList cert_noncluster_on_testdata = new CalculateED().calculate_noncert(non_cert_cluster,labeldata);
        
//        System.out.println("Test on Certified");
//        for(int i=0; i<cert_cluster_on_testdata.size(); i++)
//        {
//            System.out.println(cert_cluster_on_testdata.get(i));
//        }
//        System.out.println("\n\n\n");
//        System.out.println("Test on Non-Certified");
//        for(int i=0; i<cert_noncluster_on_testdata.size(); i++)
//        {
//            System.out.println(cert_noncluster_on_testdata.get(i));
//        }
    }
}
