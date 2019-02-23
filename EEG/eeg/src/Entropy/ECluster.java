/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entropy;

import java.util.ArrayList;
import preprocess.Datakeeper;

/**
 *
 * @author abhilash
 */
public class ECluster {
    
    public ArrayList calculate(ArrayList Rcluster)
    {
        ArrayList addc = new ArrayList();
        
        String gender = Datakeeper.gen;
        String age = Datakeeper.age;
        String smoker = Datakeeper.smoker;
        String mt = Datakeeper.med_treat;
        String ms = Datakeeper.med_supple;
        
        for(int i=0; i<Rcluster.size(); i++)
        {
            ArrayList addtemp = new ArrayList();
            ArrayList tempcluster = (ArrayList) Rcluster.get(i);
            int count = 0;
            for(int j=0; j<tempcluster.size(); j++)
            {
                ArrayList t = (ArrayList) tempcluster.get(j);
                if(gender.equals(t.get(2)) && age.equals(t.get(3)) && smoker.equals(t.get(7)) && mt.equals(t.get(8)) && ms.equals(t.get(9)))
                    count++;
            }
            
            double ent = new EntropyCal().getEntropyGain(tempcluster.size(), count, tempcluster.size()-count);
//            System.out.println(count);
//            System.out.println(ent);
            addtemp.add(i);
            addtemp.add(ent);
            addc.add(addtemp);
            //System.out.println(addtemp);
                    
        }
        return addc;
    }
}
