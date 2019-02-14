/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import java.util.ArrayList;
import preprocess.Datakeeper;

/**
 *
 * @author abhilash
 */
public class Centroid {
 
    public ArrayList getCertCentroid(){
        
        ArrayList getC = new ArrayList();
        
        double cmsize = Datakeeper.certifiedmaster.size();
        double c1 = (21*cmsize)/100;
        ArrayList t1 = (ArrayList) Datakeeper.certifiedmaster.get((int)c1);
        getC.add(t1.get(t1.size()-1));
        
        double c2 = (44*cmsize)/100;
        ArrayList t2 = (ArrayList) Datakeeper.certifiedmaster.get((int)c2);
        getC.add(t2.get(t2.size()-1));
        
        double c3 = (63*cmsize)/100;
        ArrayList t3 = (ArrayList) Datakeeper.certifiedmaster.get((int)c3);
        getC.add(t3.get(t3.size()-1));
        
        double c4 = (84*cmsize)/100;
        ArrayList t4 = (ArrayList) Datakeeper.certifiedmaster.get((int)c4);
        getC.add(t4.get(t4.size()-1));
        
        double c5 = (98*cmsize)/100;
        ArrayList t5 = (ArrayList) Datakeeper.certifiedmaster.get((int)c5);
        getC.add(t5.get(t5.size()-1));

        //System.out.println(getC);
        
        return getC;
    }
    
    public ArrayList getNonCertCentroid(){
        
        ArrayList getC = new ArrayList();
        
        double cmsize = Datakeeper.noncertifiedmaster.size();
        double c1 = (15*cmsize)/100;
        ArrayList t1 = (ArrayList) Datakeeper.noncertifiedmaster.get((int)c1);
        getC.add(t1.get(t1.size()-1));
        
        double c2 = (35*cmsize)/100;
        ArrayList t2 = (ArrayList) Datakeeper.noncertifiedmaster.get((int)c2);
        getC.add(t2.get(t2.size()-1));
        
        double c3 = (55*cmsize)/100;
        ArrayList t3 = (ArrayList) Datakeeper.noncertifiedmaster.get((int)c3);
        getC.add(t3.get(t3.size()-1));
        
        double c4 = (70*cmsize)/100;
        ArrayList t4 = (ArrayList) Datakeeper.noncertifiedmaster.get((int)c4);
        getC.add(t4.get(t4.size()-1));
        
        double c5 = (94*cmsize)/100;
        ArrayList t5 = (ArrayList) Datakeeper.noncertifiedmaster.get((int)c5);
        getC.add(t5.get(t5.size()-1));

        //System.out.println(getC);
        
        return getC;
    }
}
