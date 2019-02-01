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
public class EntropyTarget {
    
    public double calIGft(String tattr) throws IOException
    {
        ArrayList all = new ReadCSV().readdataset();
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
                if(t.get(ind).equals("yes"))
                    yc++;
                else
                    nc++;
            }
        }
        
        double ig = new Entropy().infoG(yc, nc);
       // System.out.println(ig);
       
               
       return ig;
    }
    
}
