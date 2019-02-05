/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionTree;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class GetTree {
    
    public void getNodes(String tattr, int ti) throws IOException
    {
        
        //ArrayList sortednodes = new DescendingOrder().descendSort(new ECalforRoot().calculate(tattr,ti));
        //System.out.println(sortednodes);
        
        ArrayList topnodes = (ArrayList) new ECalforRoot().calculate(tattr, ti);
        //System.out.println(topnodes);
        String subfeatures = topnodes.get(1).toString();
        //System.out.println(subfeatures);
        String impure_node = "";
        String pure_node = "";
        
        if(subfeatures.contains("NaN"))
        {
            String subfeatures_split[] = subfeatures.split("/");
            for(int i=0; i<subfeatures_split.length; i++)
            {
                if(!subfeatures_split[i].contains("NaN"))
                {
                    impure_node = impure_node + subfeatures_split[i]+"/";
                }
                else
                    pure_node = subfeatures_split[i];
            }
        }
        
        impure_node = impure_node.substring(0, impure_node.length()-1);
        topnodes.set(1, impure_node);
        
        new ECalforSub().calSubRootE(topnodes, ti);
        
    }
}
