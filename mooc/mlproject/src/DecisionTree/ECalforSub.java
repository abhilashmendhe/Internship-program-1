/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import ml.project.MlProject;
import ml.project.ReadCSV;

/**
 *
 * @author abhilash
 */
public class ECalforSub {
    
    //int tindex;
    // Arraylist inside sortnodes  
    // 0 - attribute name
    // 1 - arraylist of entries present with entropy of an single attribute
    // 2 - final gain of that single attribute
    
    public void calSubRootE(ArrayList top, ArrayList sub, int tindex) throws IOException
    {
        String featureT_entropy[] = top.get(0).toString().split("#");
        String subfeaturesT_subentropy[] = top.get(1).toString().split("/");
//        System.out.println(top);
//        System.out.println(sub);
        String featureT = featureT_entropy[0];
        double entropyT = Double.parseDouble(featureT_entropy[1]);
        //System.out.println(entropyT);
        ArrayList fetchall = new ReadCSV().readD();
        ArrayList firstRcol = (ArrayList)fetchall.get(0);
        
//        for(int i=0; i<subfeaturesT_subentropy.length; i++)
//        {
//            double total = 0;
//            ArrayList uniq = new ArrayList();
//            int featureTind = 0;
//            
//            for(int j=0; j<firstRcol.size(); j++)
//            {
//                for(int k=0; k<fetchall.size(); k++)
//                {
//                    ArrayList t1 = (ArrayList)fetchall.get(k);
//                    if(featureT.equals(t1.get(j).toString().toLowerCase()))
//                        featureTind = j;
//                    if(subfeaturesT_subentropy[i].contains(t1.get(j).toString().toLowerCase()))
//                    {
//                        uniq.add(t1);
//                        total++;
//                    }
//                }
//                HashSet u = new HashSet();
//                ArrayList uniq1 = new ArrayList();
//                for(int l=0; l<uniq.size(); l++)
//                {
//                    ArrayList t1 = (ArrayList)uniq.get(l);
//                    if(featureTind!=j && tindex!=j)
//                    {
//                        u.add(t1.get(j));
//                    }
//                    
//                }
//                uniq1.addAll(u);
//                
//                for(int m=0; m<uniq1.size(); m++)
//                {
//                    String s1 = (String) uniq1.get(m);
//                    double yes = 0;
//                    double no = 0;
//                   // System.out.println(s1);
//                }
//                
//            }
//            
//            for(int z=0; z<uniq.size(); z++)
//            {
//                System.out.println(uniq.get(z));
//            }
//            //System.out.println(total);
//        }
//    }
    }   
    
    public void getBranch()
    {
        
    }
}
