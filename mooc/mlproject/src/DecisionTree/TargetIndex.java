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
public class TargetIndex {
    public int getindex(String tattr) throws IOException
    {
        int ind = 0;
        ArrayList all = new ReadCSV().readdataset();
        ArrayList t = (ArrayList) all.get(0);
        for(int i=0; i<t.size();i++)
        {
            if(t.get(i).toString().toLowerCase().equals(tattr))
                ind = i;
        }
        
        return ind;
    }
}
