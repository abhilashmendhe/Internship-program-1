/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuzzy;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import preprocess.Datakeeper;

/**
 *
 * @author abhilash
 */
public class Classification {
    
    public void getClassify(ArrayList cluster)
    {
        ArrayList vl = new ArrayList();
        ArrayList l = new ArrayList();
        ArrayList m = new ArrayList();
        ArrayList h = new ArrayList();
        ArrayList vh = new ArrayList();
        
        ArrayList all = new ArrayList();
        String gender = Datakeeper.gen;
        String age = Datakeeper.age;
        String smoker = Datakeeper.smoker;
        String mt = Datakeeper.med_treat;
        String ms = Datakeeper.med_supple;
        System.out.println("\n\n\n");
        for(int i=0; i<cluster.size(); i++)
        {
            int count = 0;
            ArrayList row = (ArrayList) cluster.get(i);
            if(gender.equals(row.get(2)))
                count++;
            
            if(age.equals(row.get(3)))
                count++;
            
            if(mt.equals(row.get(8)))
                count++;
            
            if(ms.equals(row.get(9)))
                count++;
            
            if(smoker.equals(row.get(7)))
                    count++;
            
            if(count==5)
                vh.add(row);
            if(count==4)
                h.add(row);
            if(count==3)
                m.add(row);
            if(count==2)
                l.add(row);
            if(count==1 || count==0)
                vl.add(row);
            
        }
        
        System.out.println("Very High Stability Readings of the below data");
        for(int i=0; i<vh.size(); i++)
        {
            System.out.println(vh.get(i));
        }
        System.out.println("\n");
        
        System.out.println("High Stability Readings of the below data");
        for(int i=0; i<h.size(); i++)
        {
            System.out.println(h.get(i));
        }
        System.out.println("\n");
        
        System.out.println("Medium Stability Readings of the below data");
        for(int i=0; i<m.size(); i++)
        {
            System.out.println(m.get(i));
        }
        System.out.println("\n");
        
        System.out.println("Low Stability Readings of the below data");
        for(int i=0; i<l.size(); i++)
        {
            System.out.println(l.get(i));
        }
        System.out.println("\n");
        
        System.out.println("Very Low Stability Readings of the below data");
        for(int i=0; i<vl.size(); i++)
        {
            System.out.println(vl.get(i));
            
        }
        System.out.println("\n");
               
        ArrayList getstability = new ArrayList();
        getstability.add(vh.size()+"#vh");
        getstability.add(h.size()+"#h");
        getstability.add(m.size()+"#m");
        getstability.add(l.size()+"#l");
        getstability.add(vl.size()+"#vl");
        ArrayList sortedstability = new DescendOrder().getsort(getstability);
        
        System.out.println(sortedstability);
        //System.out.println(getstability);
        
        String s[] = sortedstability.get(0).toString().split("#");
        if(s[1].equals("vh"))
            JOptionPane.showMessageDialog(null, "Stability factor for the provided data is very high");
        else if(s[1].equals("h"))
            JOptionPane.showMessageDialog(null, "Stability factor for the provided data is high");
        else if(s[1].equals("m"))
            JOptionPane.showMessageDialog(null, "Stability factor for the provided data is medium");
        else if(s[1].equals("l"))
            JOptionPane.showMessageDialog(null, "Stability factor for the provided data is low");
        else
            JOptionPane.showMessageDialog(null, "Stability factor for the provided data is very low");
    }
}
