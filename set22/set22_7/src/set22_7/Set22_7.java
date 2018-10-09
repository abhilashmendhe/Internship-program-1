/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_7;

/**
 *
 * @author abhil
 */
public class Set22_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1,2,3,4,5};
        BigSmall a1 = new BigSmall();
        
        a1.setData(a.length);
        a1.setArray(a);
        Data d = a1.getBigSmall();
        
        System.out.println("Big is "+d.big);
        System.out.println("Small is "+d.small);
    }
    
}
