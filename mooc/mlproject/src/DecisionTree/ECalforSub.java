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
        //System.out.println(top);
        //System.out.println(sub);
        
        String featureT_entropy[] = top.get(0).toString().split("#");
        String subfeaturesT_subentropy[] = top.get(1).toString().split("/");
        String featureT = featureT_entropy[0];
        double entropyT = Double.parseDouble(featureT_entropy[1]);
        
//        System.out.println(featureT+entropyT);
//        System.out.println(subfeaturesT);

        ArrayList fetchall = new ReadCSV().readD();
        
        ArrayList firstRcol = (ArrayList)fetchall.get(0);
        
        for(int i=0; i<firstRcol.size(); i++)
        {
            if(firstRcol.get(i).toString().toLowerCase().equals(featureT) && i!=tindex)
            {
                for(int j=1; j<fetchall.size(); j++)
                {
//                    System.out.println(fetchall.get(j));
                    ArrayList t1 = (ArrayList)fetchall.get(j);
                    
//                 
                }
                    
            }
        }
        
    }
        
        
//    public void calSubRootE(ArrayList top, ArrayList sub, int tindex) throws IOException
//    {
//        ArrayList all = new ReadCSV().readdataset();
//        String aname = (String)top.get(0);
//       //String aname = "windy";
//        ArrayList entries = (ArrayList)top.get(1);
//        double entropy = (double) top.get(2);
////      System.out.println(sub);
////      System.out.println(entries);
//        ArrayList subentries = new ArrayList();
//        ArrayList subentriesentrpy = new ArrayList();
//        //System.out.println(entropy);
//        for(int i=0; i<entries.size(); i++)
//        {
//            ArrayList t = (ArrayList) entries.get(i);
//            subentries.add(t.get(0));
//            subentriesentrpy.add(t.get(1));
//        }        
////        System.out.println(subentries);
////        System.out.println(subentriesentrpy);
//        ArrayList col = (ArrayList)all.get(0);
//        int anameindex = 0;
//        for(int i=0; i<col.size(); i++)
//        {
//            if(col.get(i).toString().toLowerCase().equals(aname))
//                anameindex = i;
//        }
//       // System.out.println(anameindex);
//       for(int i=0; i<col.size(); i++)
//       {
//          for(int j=0; j<subentries.size(); j++)
//          {
//           double e = 0;
//           if(!subentriesentrpy.get(j).toString().equals("NaN"))
//            if(i!=tindex && i!=anameindex)
//            {
//                HashSet u = new HashSet();
//                ArrayList tu = new ArrayList();
//                String s = (String) subentries.get(j);
//                double ent = (double) subentriesentrpy.get(j);
//                for(int k=1; k<all.size(); k++)
//                {
//                    ArrayList t1 = (ArrayList) all.get(k);
//                    if(t1.get(anameindex).equals(s))
//                    {
////                        ArrayList t2 = (ArrayList) all.get(k);
//                        u.add(t1.get(i));
//                       // System.out.println(t1.get(i)+"  "+i);
//                        
//                    }
//                }
//                System.out.println("----------------");
//                tu.addAll(u);
////                System.out.println(tu);
//                for(int l=0; l<tu.size(); l++)
//                {
//                    String s1 = (String) tu.get(l);
//                    //System.out.println(s1);
//                    double yes = 0;
//                    double no = 0;
//                    double total = 0;
//                    for(int m=0; m<all.size(); m++)
//                    {
//                        ArrayList t2 = (ArrayList) all.get(m);
//                        if(t2.get(anameindex).equals(s))
//                        {
//                            if(s1.equals(t2.get(i)))
//                            {
////                                System.out.println(t2.get(MlProject.targetindex));
//                                if(t2.get(MlProject.targetindex).equals("yes"))
//                                    yes++;
//                                else
//                                    no++;
//                            }
//                            total++;
//                        }
//                    }
//                    //System.out.println(yes+" "+no);
//                    
//                    double I = new Entropy().infoG(yes, no)*((yes+no)/total);
//                    
//                    if(!Double.toString(I).equals("NaN"))
//                        e+=I;
//                    
//                    
//                } 
//                    double gain = ent - e;
//                    System.out.println(gain+s);
//               // System.out.println(tu);
//            }
//        }
//    }
//}        

    
    
    public ArrayList getSubNodes(ArrayList sortednodes)
    {
        ArrayList a = new ArrayList();
        for(int i=1; i<sortednodes.size(); i++)
        {
            ArrayList t1 = (ArrayList) sortednodes.get(i);
            a.add(t1);
        }
        return a;
    }
}
