/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_5;

/**
 *
 * @author abhil
 */
public class Set25_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Five firstarr = new Five(1, 1, 2, 3, 1);
        int firstarray[] = firstarr.getArray();
        
        Unique u = new Unique();
        int unique[] = u.getUniqueArray(firstarray);
        
        System.out.println("Unique elements are");
        for(int i=0; i<unique.length; i++)
            System.out.print(" "+unique[i]);
        
        System.out.println();
    }
    
}
