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
        
        ArrayList sortednodes = new DescendingOrder().descendSort(new ECalforRoot().calculate(tattr,ti));
        //System.out.println(sortednodes);
        ArrayList topnodes = (ArrayList) sortednodes.get(0);
       // System.out.println(topnodes);
        ArrayList subnodes = new ECalforSub().getSubNodes(sortednodes);
       // System.out.println(subnodes);
        new ECalforSub().calSubRootE(topnodes,subnodes,ti);
    }
}
