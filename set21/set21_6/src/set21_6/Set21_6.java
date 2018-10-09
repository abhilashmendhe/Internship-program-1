/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_6;

/**
 *
 * @author abhi
 */
public class Set21_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5};
        
        Test a1 = new Test();
        
        a1.getLenght(a.length);
        a1.setArray(a);
        int range[] = a1.getSDRange();
        
        System.out.println("Range is");
        for(int  i=0; i<range.length; i++)
            System.out.print(" "+range[i]);
        
        System.out.println();
    }
    
}
