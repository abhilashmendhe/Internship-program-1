/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.project;

import DecisionTree.ECalforRoot;
import DecisionTree.ECalforSub;
import DecisionTree.EntropyTarget;
import DecisionTree.GetTree;
import DecisionTree.TargetIndex;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Suchit
 */
public class MlProject {

    /**
     * @param args the command line arguments
     */
    public static int targetindex = 0;
    public static void main(String[] args) throws IOException {
       
  //      ArrayList all = new readCSV().readdataset();  
//        new EntropyCal().cal();
            //new ECalforSub().cal("play");
            String tattr = "play";
            int ind = new TargetIndex().getindex(tattr);
            targetindex = ind;
            new GetTree().getNodes(tattr, ind);
    }
}
