/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_6;

/**
 *
 * @author abhil
 */
public class Set24_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1,2,3,4};
        IntArray i1 = new IntArray();
        IntArray i2 = new IntArray(a);
        
        i1.getMerge(i2);
    }
    
}
