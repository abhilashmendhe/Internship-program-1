/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_9;

/**
 *
 * @author abhil
 */
public class Set22_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[] = {1,2,3,4,5};
        
        MeanSD m = new MeanSD();
        
        m.getData(a.length);
        m.getArray(a);
        
        Data d = m.getMeanSD();
        
        System.out.println("Mean is "+d.mean);
        System.out.println("SD is "+d.sd);
    }
    
}
