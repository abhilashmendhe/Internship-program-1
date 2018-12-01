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
public class Product {
    
    public double[][] getProduct(double mat1[][], double mat2[][])
    {
        
        double mat3[][] = new double[mat1.length][mat2[0].length];
            
            try{
            for(int i=0; i<mat1.length; i++)
            {
                for(int j=0; j<mat2[0].length; j++)
                {
                    for(int k=0; k<mat1[0].length; k++)
                        mat3[i][j] += mat1[i][k]*mat2[k][j];
                       
                }
            }
            }
            catch(Exception ex)
        {
            System.out.println("Exception in class Matrix");
            System.out.println("Error in function getInverse: "+ex);
        }
         return mat3;
    }
    
    
    
    
    
    
}
