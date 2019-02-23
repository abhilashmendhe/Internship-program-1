/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eeg;

import Entropy.Einit;
import Fuzzy.Fuzzyinit;
import KNN.KnnInit;
import Pearson.Pinit;
import Regression.LRinit;
import hmm.Hmminit;
import java.io.IOException;
import java.util.ArrayList;
import jxl.read.biff.BiffException;
import preprocess.Datakeeper;
import preprocess.LabelledSet;
import preprocess.ReadDataSet;

/**
 *
 * @author abhilash
 */
public class ProcessInitiator {
    
    public void initProcess(String trainpath) throws IOException, BiffException
    {
        ArrayList alldata = new ReadDataSet().readAllData(trainpath);
        Datakeeper.raw_data = alldata;
        
        ArrayList labelleddata = new LabelledSet().getLabelledData(alldata);
        
        System.out.println("RAW DataSet is");
        for(int i=0; i<alldata.size(); i++)
            System.out.println(alldata.get(i));
        System.out.println("\n\n\n");
        System.out.println("Labelled Data set");
        for(int i=1; i<labelleddata.size(); i++)
        {
            System.out.println(labelleddata.get(i));
        }
        System.out.println("\n\n");
        ArrayList cluster = new KnnInit().initialize(labelleddata);
        
        
        ArrayList regression_cluster = new LRinit().initialize(cluster);
        
        ArrayList top_3_cluster = new Einit().initialize(regression_cluster);
        ArrayList topPclust =  new Pinit().initialize(top_3_cluster);
        
        ArrayList hmmcluster = new Hmminit().initialize(topPclust, labelleddata);
        
        new Fuzzyinit().initialize(hmmcluster);
    }
}
