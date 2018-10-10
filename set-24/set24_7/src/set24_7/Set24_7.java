/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_7;

/**
 *
 * @author abhil
 */
public class Set24_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[] = {1,2,3,4,5};
        IntArray i1 = new IntArray(a);
        MeanSd msd = new MeanSd();
        
        
        Datakeeper ans = msd.getMeanSd(i1);
        
        System.out.println("Mean is "+ans.mean);
        System.out.println("SD is "+ans.sd);
    }
    
}
