/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

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
        
        ArrayList allclust = new kmeans.KmeansInit().initialize(labelcerti,labelnotcerti);
        ArrayList certified_cluster = (ArrayList) allclust.get(0);
        ArrayList certified_non_cluster = (ArrayList) allclust.get(1);
       
        ArrayList alldata_test = new ReadDataSet().readAllData(testpath);
        ArrayList labeltest = new TestLabeler().getLabelledTest(alldata_test);
        
        
        new LRinit().initialize(certified_cluster, certified_non_cluster, labeltest);
        
        
    }
}
