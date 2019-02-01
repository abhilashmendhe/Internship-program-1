/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import jxl.read.biff.BiffException;
import mooc.ReadDataSet;

/**
 *
 * @author abhilash
 */
public class ECalforRoot {
    
    public ArrayList calculate(String tattr) throws IOException, BiffException
    {
        
        
        double ig = new IGforT().calIGft(tattr);
        //System.out.println(gain);
        
        ArrayList alldata = new ReadDataSet().readcsv();
        //System.out.println(alldata);
        
        int tattrindex = 0;
        ArrayList col = (ArrayList)alldata.get(0);
        
        for(int i=0; i<col.size(); i++)
        {
            String s = col.get(i).toString().toLowerCase();
            if(s.equals(tattr))
                tattrindex = i;
        }
        
//        System.out.println(tattrindex);
        ArrayList allnodes = new ArrayList();
        
        for(int i=0; i<col.size(); i++)
        {
            ArrayList t = (ArrayList)alldata.get(0);
            String s = t.get(i).toString().toLowerCase();
            ArrayList getnodes = new ArrayList();
            if(!s.equals(tattr))
            {
                //System.out.println(s);
                HashSet uele = new HashSet();
                ArrayList uniq = new ArrayList();
                for(int j=1; j<alldata.size(); j++)
                {
                    ArrayList temp = (ArrayList)alldata.get(j);
                    //System.out.println(temp.get(i));
                    uele.add(temp.get(i));
                }
                uniq.addAll(uele);
                //System.out.println(uniq);
                double e = 0;
                for(int k=0; k<uniq.size(); k++)
                {
                    
                    double yesc = 0;
                    double noc = 0;
                    double total = 0;
                    String temp1 = (String) uniq.get(k);
                    
                    for(int l=1; l<alldata.size(); l++)
                    {
                        ArrayList temp2 = (ArrayList) alldata.get(l);
                        //System.out.println(temp2.get(i));
                        if(temp1.equals(temp2.get(i)))
                        {
                            if(temp2.get(tattrindex).equals("0"))
                                yesc++;
                            else
                                noc++;
                            //System.out.println(temp2.get(tattrindex));
                        }
                        total++;
                    }
                    double I = new InformationGain().infoG(yesc, noc)*((yesc+noc)/total);
                    //System.out.println(I);
                    if(!Double.toString(I).equals("NaN"))
                        e += I;
                }
                double gain = ig - e;
               // System.out.println(gain);
                getnodes.add(s);
                getnodes.add(uniq);
                getnodes.add(gain);
                
                allnodes.add(getnodes);
            }
        }
        return allnodes;
    }     
}
