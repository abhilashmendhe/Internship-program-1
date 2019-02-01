/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionTree;

import java.io.IOException;
import java.util.ArrayList;
import jxl.read.biff.BiffException;
import mooc.ReadDataSet;

/**
 *
 * @author abhilash
 */
public class IGforT {
        public double calIGft(String tattr) throws IOException, BiffException
    {
        ArrayList all = new ReadDataSet().readcsv();
        int yc = 0;
        int nc = 0;
        
        int ind = 0;
        for(int i=0; i<all.size(); i++)
        {
            ArrayList t = (ArrayList) all.get(i);
               
            if(ind==0)
            {
                for(int j=0; j<t.size(); j++)
                {
                    if(tattr.equals(t.get(j).toString().toLowerCase()))
                        ind = j;
                }
            }
            else
            {
                if(t.get(ind).equals("0"))
                    yc++;
                else
                    nc++;
            }
        }
        double ig = new InformationGain().infoG(yc, nc);
        
        return ig;
        
    }
}
