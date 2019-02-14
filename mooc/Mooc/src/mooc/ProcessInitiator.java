/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.io.IOException;
import java.util.ArrayList;
import jxl.read.biff.BiffException;
import preprocess.Labeler;
import preprocess.ReadDataSet;

/**
 *
 * @author abhil
 */
public class ProcessInitiator
{
    public void initProcess(String path) throws IOException, BiffException
    {
        ArrayList alldata = new ReadDataSet().readAllData(path);
        ArrayList certified = new ReadDataSet().readCertified(alldata);
        ArrayList notcertified = new ReadDataSet().readNotCertified(alldata);
        
        ArrayList labelcerti = new Labeler().getLabelledCertified(certified);
        ArrayList labelnotcerti = new Labeler().getLabelledNotCertified(notcertified);
        new kmeans.KmeansInit().initialize(labelcerti,labelnotcerti);

    }
}
