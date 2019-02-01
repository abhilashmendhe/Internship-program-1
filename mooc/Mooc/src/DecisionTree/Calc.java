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
public class Calc {
    
    public void cal(String tattr) throws IOException, BiffException
    {
         ArrayList s = new DescendingOrder().descendSort(new ECalforRoot().calculate(tattr));
         for(int i=0; i<s.size(); i++)
         {
             ArrayList t = (ArrayList) s.get(i);
             System.out.println(t.get(0)+"  "+t.get(2));
         }
       
    }
}
