/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import ml.project.ReadCSV;

/**
 *
 * @author abhilash
 */
public class Subbranches {
    
    public void getSubBranch(ArrayList subnodes, int tindex) throws IOException
    {
        System.out.println(subnodes);
        String rootbranch = (String) subnodes.get(0);
        String subB = (String) subnodes.get(1).toString().toLowerCase();
        
        int subBindex = 0;
        
        ArrayList all = new ReadCSV().readD();
        ArrayList firstrowcol = (ArrayList) all.get(0);
        
        for(int i=0; i<firstrowcol.size(); i++)
        {
            if(subB.contains(firstrowcol.get(i).toString().toLowerCase()))
                subBindex = i;
        }
        //System.out.println(subBindex);
        HashSet u = new HashSet();
        ArrayList uniq = new ArrayList();
        for(int i=0; i<firstrowcol.size(); i++)
        {
            for(int j=0; j<all.size(); j++)
            {
                ArrayList t = (ArrayList) all.get(j);
                if(rootbranch.contains(t.get(i).toString()))
                {
                    String subBfeatures = (String) t.get(subBindex);
                    System.out.println(subBfeatures);
                    u.add(subBfeatures);
                }
            }
        }
        
        uniq.addAll(u);
        System.out.println(uniq);
        
        for(int z=0; z<uniq.size(); z++)
        {
            double yes = 0;
            double no = 0;
            String s = uniq.get(z).toString().toLowerCase();
            for(int i=0; i<firstrowcol.size(); i++)
            {
                for(int j=0; j<all.size(); j++)
                {
                    ArrayList t = (ArrayList) all.get(j);
                    if(rootbranch.contains(t.get(i).toString()))
                    {
                       if(s.equals(t.get(subBindex)))
                       {
                            if(t.get(tindex).toString().equals("yes"))
                                yes++;
                            else 
                                no++;
                       }
                    }
                }
            }
            System.out.println(yes+" "+no);
            double eee = new Entropy().infoG(yes, no);
        }
        
        
    }
}
