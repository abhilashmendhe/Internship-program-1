/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionTree;

import java.io.IOException;
import java.util.ArrayList;
import ml.project.ReadCSV;

/**
 *
 * @author abhilash
 */
public class Branch {
    
    public ArrayList getBranch(ArrayList top, int tindex) throws IOException
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
        ArrayList uniq = new ArrayList();
        
        for(int i=0; i<subfeaturesT_subentropy.length; i++)
        {
           
            for(int j=0; j<firstRcol.size(); j++)
            {
                for(int k=0; k<fetchall.size(); k++)
                {
                    ArrayList t1 = (ArrayList)fetchall.get(k);
                    if(subfeaturesT_subentropy[i].contains(t1.get(j).toString().toLowerCase()))
                    {
                        uniq.add(t1);
                        
                    }
                }   
            }
            
        }
        return uniq; 
    }
    
}
