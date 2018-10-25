/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set27_8;

/**
 *
 * @author abhil
 */
import arrays.*;
public class Set27_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a1[] = {4,12,11,3,1,19,13};
        int a2[] = {4,12,11,3,1,19,13};
       
        int a3[] = {4,12,11,3,1,19,13};
        int a4[] = {4,12,11,3,1,19,13};
        
        Sort s = new Sort();
        Rotate r = new Rotate();
        
        System.out.println("Array before sort");
        for(int i=0; i<a1.length; i++)
            System.out.print(" "+a1[i]);
        System.out.println();
        int asec[] = s.getAscendingSort(a1);
        System.out.println("Sorted array in asecending order");
        for(int i=0; i<asec.length; i++)
            System.out.print(" "+asec[i]);
        
        System.out.println("\n----------------------------------------------------");
        
        System.out.println("Array before sort");
        for(int i=0; i<a2.length; i++)
            System.out.print(" "+a2[i]);
        System.out.println();
        
        int desec[] = s.getDecendingSort(a2);
        System.out.println("Sorted array in desecending order");
        for(int i=0; i<desec.length; i++)
            System.out.print(" "+desec[i]);
        
        
        System.out.println("\n----------------------------------------------------");
        
        System.out.println("Array before rotation");
        for(int i=0; i<a3.length; i++)
            System.out.print(" "+a3[i]);
        System.out.println();
        int top[] = r.fromTop(a3, 3);
        
        System.out.println("Array after rotation from top");
        for(int i=0; i<top.length; i++)
            System.out.print(" "+top[i]);
        
        System.out.println("\n----------------------------------------------------");
        
      
        System.out.println("Array before rotation");
        for(int i=0; i<a4.length; i++)
            System.out.print(" "+a4[i]);
        System.out.println();
        int bottom[] = r.fromBottom(a4, 3);
        System.out.println("Array after rotation from bottom");
        for(int i=0; i<bottom.length; i++)
            System.out.print(" "+bottom[i]);
        
        System.out.println();
    }
    
}
