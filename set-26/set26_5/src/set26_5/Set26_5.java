/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_5;

/**
 *
 * @author abhil
 */
public class Set26_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Five arr = new Five();
        
        arr.callA1(1);
        arr.callA2(2);
        arr.callA3(3);
        arr.callA4(4);
        arr.callA5(5);
        
        int array[] = arr.formArray();
        System.out.println("Actual array is ");
        for(int i=0; i<array.length; i++)
            System.out.print(" "+array[i]);
        Reverse r = new Reverse();
        System.out.println("\nReverse array is");
        r.getReverse(array);
        System.out.println();
    }
    
}
