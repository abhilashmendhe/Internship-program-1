/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KNN;

import java.util.ArrayList;
import preprocess.Datakeeper;

/**
 *
 * @author abhilash
 */
public class Centroid {
 
    public ArrayList getCertCentroid(){
        
        ArrayList getC = new ArrayList();
        
        double cmsize = Datakeeper.addeddistance.size();
        double c1 = (21*cmsize)/100;
        ArrayList t1 = (ArrayList) Datakeeper.addeddistance.get((int)c1);
        //System.out.println(t1);
        getC.add(t1.get(t1.size()-1));
        
        double c2 = (33*cmsize)/100;
        ArrayList t2 = (ArrayList) Datakeeper.addeddistance.get((int)c2);
        getC.add(t2.get(t2.size()-1));
        
        double c3 = (68*cmsize)/100;
        ArrayList t3 = (ArrayList) Datakeeper.addeddistance.get((int)c3);
        getC.add(t3.get(t3.size()-1));
        
        double c4 = (90*cmsize)/100;
        ArrayList t4 = (ArrayList) Datakeeper.addeddistance.get((int)c4);
        getC.add(t4.get(t4.size()-1));
        
        double c5 = (95*cmsize)/100;
        ArrayList t5 = (ArrayList) Datakeeper.addeddistance.get((int)c5);
        getC.add(t5.get(t5.size()-1));

        //System.out.println(getC);
        
        return getC;
    }
}
