/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set27_9;

/**
 *
 * @author abhil
 */
import matrixops.*;
public class Set27_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Addition a= new Addition();
        int m1[][] = {{1,2},{1,2}};
        int m2[][] = {{10,20},{10,20}};
        int add[][] = a.getAdd(m1, m2);
        
        Subtrction s = new Subtrction();
        int sub[][] = s.getSub(m1, m2);
        
        System.out.println("Addition of two matrix is ");
        for(int i=0; i<add.length; i++)
        {
            for(int j=0; j<add[0].length; j++)
                System.out.print(" "+add[i][j]);
            
            System.out.println();
        }

System.out.println("Subtraction of two matrix is ");
        for(int i=0; i<sub.length; i++)
        {
            for(int j=0; j<sub[0].length; j++)
                System.out.print(" "+sub[i][j]);
            
            System.out.println();
        }
        
        System.out.println();
    }
    
}
