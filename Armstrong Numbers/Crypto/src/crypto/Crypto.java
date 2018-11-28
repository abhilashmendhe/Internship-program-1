/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

/**
 *
 * @author abhil
 */
public class Crypto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mat1[][] = {{1,2,3},{4,5,6}};
        int mat2[][] = {{7,8},{9,10},{11,12}};
        
        int mat[][] = new Matrix().getMultiplication(mat1, mat2);
        
        
        
        
        int mat3[][] = {{3,0,2},{2,0,-2},{0,1,1}};
        for(int i=0; i<mat3.length; i++)
        {
            for(int j=0; j<mat3[0].length; j++)
                System.out.print(" "+mat3[i][j]);
            
            System.out.println();
        }
        
        System.out.println();
 
       
        double inv[][] = new Matrix().getInverse(mat3);
        System.out.println("Matrix of minors");
        for(int i=0; i<inv.length; i++)
        {
            for(int j=0; j<inv[0].length; j++)
                System.out.print(" "+inv[i][j]);
            
            System.out.println();
        }
        
    }
    
}
