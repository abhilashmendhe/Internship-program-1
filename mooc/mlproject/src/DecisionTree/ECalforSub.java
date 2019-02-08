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
    
    public ArrayList calSubRootE(ArrayList top, int tindex) throws IOException
    {
        
        ArrayList subnodes = new ArrayList();
        String featureT_entropy[] = top.get(0).toString().split("#");
        String subfeaturesT_subentropy[] = top.get(1).toString().split("/");

        ArrayList fetchall = new ReadCSV().readD();
        ArrayList firstRcol = (ArrayList)fetchall.get(0);
        int featureTindex  = 0;
        for(int i=0; i<firstRcol.size(); i++)
        {
            if(firstRcol.get(i).toString().toLowerCase().equals(featureT_entropy[0]))
                featureTindex = i;
        }
        
        ArrayList branch = new Branch().getBranch(top, tindex);
        //System.out.println(branch);
        for(int i=0; i<subfeaturesT_subentropy.length; i++)
        {
            ArrayList add = new ArrayList();
            double total = 0;
            String spl[] = subfeaturesT_subentropy[i].split("#");
            double ent = Double.parseDouble(spl[1]);
            for(int z=0; z<branch.size(); z++)
            {
                ArrayList t1 = (ArrayList)branch.get(z);
                if(subfeaturesT_subentropy[i].contains(t1.get(0).toString()))
                    total++;
            }
            double biggest = 0;
            String biggestnodename = "";
            for(int j=0; j<firstRcol.size(); j++)
            {
                if(j!=featureTindex && j!=tindex)
                {
                ArrayList uniq = new ArrayList();
                HashSet u = new HashSet();
                for(int k=0; k<branch.size(); k++)
                {
                    ArrayList t1 = (ArrayList)branch.get(k);
                    if(subfeaturesT_subentropy[i].contains(t1.get(0).toString()) && j!=tindex)
                    {   
                        u.add(t1.get(j));
                    }

                }
                uniq.addAll(u);
                //System.out.println(uniq);
                double gain=0;
                for(int l=0; l<uniq.size(); l++)
                {
                    double yes = 0;
                    double no = 0;
                    for(int y=1; y<firstRcol.size(); y++)
                    for(int m=0; m<branch.size(); m++)
                    {
                        ArrayList t1 = (ArrayList) branch.get(m);
                        if(subfeaturesT_subentropy[i].contains(t1.get(0).toString()))
                        if(uniq.get(l).equals(t1.get(y)))
                        {
                            if(t1.get(tindex).equals("yes"))
                                yes++;
                            else
                                no++;
                            
                        }
                    }
                    //System.out.println(yes+" "+no);
                    double eee = new Entropy().infoG(yes, no)*((yes+no)/total);
                    if(!Double.toString(eee).equals("NaN"))
                        gain += eee;
                    //System.out.println(eee);
                    //System.out.println("==============");
                }
                gain = ent - gain;
                
                //System.out.println(firstRcol.get(j)+"  "+gain);
                //System.out.println("------------------------");
                if(biggest<gain)
                {
                    biggest = gain;
                    biggestnodename = firstRcol.get(j).toString();
                }   
            
                }
                
            
            }
            
                //System.out.println(subfeaturesT_subentropy[i]+"    "+biggestnodename+"#"+biggest);
            
            //System.out.println(total);
            //System.out.println("---------------------------");
            add.add(subfeaturesT_subentropy[i].toLowerCase());
            add.add(biggestnodename+"#"+biggest);
            subnodes.add(add);
        }
        
        return subnodes;
    }   
    
}
