/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import hiddenmarkovmodel.HMMinit;
import java.io.IOException;
import java.util.ArrayList;
import jxl.read.biff.BiffException;
import linear_regression.LRinit;
import preprocess.TrainLabeler;
import preprocess.ReadDataSet;
import preprocess.TestLabeler;

/**
 *
 * @author abhil
 */
public class ProcessInitiator
{
    public void initProcess(String trainpath, String testpath) throws IOException, BiffException
    {
        ArrayList alldata_train = new ReadDataSet().readAllData(trainpath);
        ArrayList certified = new ReadDataSet().readCertified(alldata_train);
        ArrayList notcertified = new ReadDataSet().readNotCertified(alldata_train);
        ArrayList labelcerti = new TrainLabeler().getLabelledCertified(certified);
        ArrayList labelnotcerti = new TrainLabeler().getLabelledNotCertified(notcertified);
        
        ArrayList alldata_test = new ReadDataSet().readAllData(testpath);
        ArrayList labeltest = new TestLabeler().getLabelledTest(alldata_test);
        
        System.out.println("Certified train labeled set");
        for(int i=0; i<labelcerti.size(); i++)
            System.out.println(labelcerti.get(i));
        
        System.out.println("\n\n");
        System.out.println("Non Certified train labeled set");
        for(int i=0; i<labelnotcerti.size(); i++)
            System.out.println(labelnotcerti.get(i));
        
        System.out.println("\n\n");
        System.out.println("Test labeled set");
        for(int i=0; i<labeltest.size(); i++)
            System.out.println(labeltest.get(i));
        
        ArrayList allclust = new kmeans.KmeansInit().initialize(labelcerti,labelnotcerti);
        ArrayList certified_cluster = (ArrayList) allclust.get(0);
        ArrayList certified_non_cluster = (ArrayList) allclust.get(1);
       
        
        
        
        ArrayList lr_belonging_cluster = new LRinit().initialize(certified_cluster, certified_non_cluster, labeltest);
        ArrayList lr_certified_cluster = (ArrayList) lr_belonging_cluster.get(0);
        ArrayList lr_non_certified_cluster = (ArrayList) lr_belonging_cluster.get(1);
        
        
//        System.out.println("Certified train labeled set");
//        for(int i=0; i<labelcerti.size(); i++)
//            System.out.println(labelcerti.get(i));
//        
//        System.out.println("\n\n");
//        System.out.println("Non Certified train labeled set");
//        for(int i=0; i<labelnotcerti.size(); i++)
//            System.out.println(labelnotcerti.get(i));
//        
//        System.out.println("\n\n");
//        System.out.println("Test labeled set");
//        for(int i=0; i<labeltest.size(); i++)
//            System.out.println(labeltest.get(i));
//        
//        System.out.println("\n\n\n\n");
//        System.out.println("Certfied Clusters");
//        for(int i=0; i<certified_cluster.size(); i++)
//        {
//            ArrayList t = (ArrayList) certified_cluster.get(i);
//            System.out.println("Cluster "+i);
//            for(int j=0; j<t.size(); j++)
//            {
//                System.out.println(t.get(j));
//            }
//            System.out.println("\n\n");
//        }
//        
//        System.out.println("\n\n\n");
//        System.out.println("Non Certfied Clusters");
//        for(int i=0; i<certified_non_cluster.size(); i++)
//        {
//            ArrayList t = (ArrayList) certified_non_cluster.get(i);
//            System.out.println("Cluster "+i);
//            for(int j=0; j<t.size(); j++)
//            {
//                System.out.println(t.get(j));
//            }
//            System.out.println("\n\n");
//        }
//        
        System.out.println("\n\n\n\n\n");
        System.out.println("Linear Regression Test on certified cluster");
        for(int i=0; i<lr_certified_cluster.size(); i++)
        {
            System.out.println(lr_certified_cluster.get(i));
        }
        
        System.out.println("\n\n");
        System.out.println("Linear Regression Test on non_certified cluster");
        for(int i=0; i<lr_non_certified_cluster.size(); i++)
        {
            System.out.println(lr_non_certified_cluster.get(i));
        }

        System.out.println("\n\n\n");
        System.out.println("Now HMM part");
        System.out.println("\n");
        new HMMinit().initialize(lr_certified_cluster, lr_non_certified_cluster, labeltest);
    }
}
