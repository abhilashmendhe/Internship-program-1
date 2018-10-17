/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_6;

/**
 *
 * @author abhil
 */
public class Set25_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Five ar = new Five();
        ar.getData(1, 2, 3, 4, 5);
        int array[] = ar.getArray();
        
        EvenOdd e = new EvenOdd();
        
        Datakeeper d = e.evenodd(array);
        
        int even[] = d.even;
        int odd[] = d.odd;
        
        System.out.println("Even array is ");
        for(int i=0; i<d.even.length; i++)
            System.out.print(" "+even[i]);
        
        System.out.println();
        
        System.out.println("Odd array is ");
        for(int i=0; i<d.odd.length; i++)
            System.out.print(" "+odd[i]);
    
        System.out.println();
    }
    
}
