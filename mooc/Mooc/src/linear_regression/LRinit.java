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
    
    public ArrayList initialize(ArrayList cert_cluster, ArrayList non_cert_cluster, ArrayList labeldata)
    {
        ArrayList all_cluster = new ArrayList();
        ArrayList cert_cluster_on_testdata = new CalculateED().calculate_cert(cert_cluster,labeldata);
        ArrayList cert_noncluster_on_testdata = new CalculateED().calculate_noncert(non_cert_cluster,labeldata);
        
        all_cluster.add(cert_cluster_on_testdata);
        all_cluster.add(cert_noncluster_on_testdata);
        
        return all_cluster;
               
        
    }
}
