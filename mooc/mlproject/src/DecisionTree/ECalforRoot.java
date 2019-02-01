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
public class ECalforRoot {
    
//    public ArrayList calculate(String tattr, int tindex) throws IOException
//    {
//        
//        double ig = new EntropyTarget().calIGft(tattr);
//        
//        //System.out.println(gain);
//        
//        ArrayList alldata = new ReadCSV().readdataset();
//        //System.out.println(alldata);
//        
//        ArrayList col = (ArrayList)alldata.get(0);
//       
//        
////        System.out.println(tattrindex);
//        ArrayList allnodes = new ArrayList();
//        
//        for(int i=0; i<col.size(); i++)
//        {
//            ArrayList t = (ArrayList)alldata.get(0);
//            String s = t.get(i).toString().toLowerCase();
//            ArrayList getnodes = new ArrayList();
//            if(i!=tindex || !s.equals(tattr))
//            {
//                //System.out.println(s);
//                HashSet uele = new HashSet();
//                ArrayList uniq = new ArrayList();
//                for(int j=1; j<alldata.size(); j++)
//                {
//                    ArrayList temp = (ArrayList)alldata.get(j);
//                    //System.out.println(temp.get(i));
//                    uele.add(temp.get(i));
//                }
//                uniq.addAll(uele);
//                //System.out.println(uniq);
//                double e = 0;
//                for(int k=0; k<uniq.size(); k++)
//                {
//                    
//                    double yesc = 0;
//                    double noc = 0;
//                    double total = 0;
//                    String temp1 = (String) uniq.get(k);
//                    ArrayList addtarget = new ArrayList();
//                    for(int l=1; l<alldata.size(); l++)
//                    {
//                        ArrayList temp2 = (ArrayList) alldata.get(l);
//                        //System.out.println(temp2.get(i));
//                        if(temp1.equals(temp2.get(i)))
//                        {
//                            if(temp2.get(tindex).equals("yes"))
//                                yesc++;
//                            else
//                                noc++;
//                            //System.out.println(temp2.get(tattrindex));
//                        }
//                        total++;
//                    }
//                    addtarget.add(yesc);
//                    addtarget.add(noc);
//                    getnodes.add(addtarget);
//                    double I = new Entropy().infoG(yesc, noc)*((yesc+noc)/total);
//                    //System.out.println(I);
//                    if(!Double.toString(I).equals("NaN"))
//                        e += I;
//                }
//                double gain = ig - e;
//               // System.out.println(gain);
//                getnodes.add(s);
//                getnodes.add(uniq);
//                getnodes.add(gain);
//                
//                allnodes.add(getnodes);
//            }
//        }
//        allnodes.add(tindex);
//        return allnodes;
//    }    
    
    public ArrayList calculate(String tattr, int tindex) throws IOException
    {
        
        double ig = new EntropyTarget().calIGft(tattr);
        
        //System.out.println(gain);
        
        ArrayList alldata = new ReadCSV().readdataset();
        //System.out.println(alldata);
        
        ArrayList col = (ArrayList)alldata.get(0);
       
        
//        System.out.println(tattrindex);
        ArrayList allnodes = new ArrayList();
        
        for(int i=0; i<col.size(); i++)
        {
            ArrayList t = (ArrayList)alldata.get(0);
            String s = t.get(i).toString().toLowerCase();
            ArrayList getnodes = new ArrayList();
            if(i!=tindex || !s.equals(tattr))
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
                ArrayList adduniqwithE = new ArrayList();
                for(int k=0; k<uniq.size(); k++)
                {
                    
                    double yesc = 0;
                    double noc = 0;
                    double total = 0;
                    String temp1 = (String) uniq.get(k);
                    ArrayList adduniqqq = new ArrayList();
                    String play = "";
                    for(int l=1; l<alldata.size(); l++)
                    {
                        ArrayList temp2 = (ArrayList) alldata.get(l);
                        //System.out.println(temp2.get(i));
                        if(temp1.equals(temp2.get(i)))
                        {
                            if(temp2.get(tindex).equals("yes"))
                                yesc++;
                            else
                                noc++;
                            //System.out.println(temp2.get(tattrindex));
                            play = (String) temp2.get(tindex);
                        }
                        total++;
                    }
                   
                    double en = new Entropy().infoG(yesc, noc);
                    //System.out.println(uniq.get(k)+" "+en);
                    if(Double.toString(en).equals("NaN"))
                    {
                        adduniqqq.add(uniq.get(k));
                        adduniqqq.add(en);
                        adduniqqq.add(play);
                    }
                    else
                    {
                       adduniqqq.add(uniq.get(k));
                        adduniqqq.add(en); 
                    }
                    double I = new Entropy().infoG(yesc, noc)*((yesc+noc)/total);
                    //System.out.println(I);
                    if(!Double.toString(I).equals("NaN"))
                        e += I;
                    //System.out.println(adduniqqq);
                    adduniqwithE.add(adduniqqq);
                }
                //System.out.println(adduniqwithE);
                double gain = ig - e;
               // System.out.println(gain);
                getnodes.add(s);
                getnodes.add(adduniqwithE);
                getnodes.add(gain);
                
                allnodes.add(getnodes);
            }
        }
        return allnodes;
    }    
}
