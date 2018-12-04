/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decryption;

/**
 *
 * @author abhil
 */
public class Inverse {
    public double[][] getInverse(double mat[][])
    {
        double invmat[][] = new double[mat.length][mat[0].length];
        int cofact[][]= new int[mat.length][mat[0].length];
        try{
        // Product of Minors
        
        invmat[0][0] = (mat[1][1] * mat[2][2]) - (mat[1][2] * mat[2][1]);
        invmat[0][1] = (mat[1][0] * mat[2][2]) - (mat[1][2] * mat[2][0]);
        invmat[0][2] = (mat[1][0] * mat[2][1]) - (mat[1][1] * mat[2][0]);
        invmat[1][0] = (mat[0][1] * mat[2][2]) - (mat[0][2] * mat[2][1]);
        invmat[1][1] = (mat[0][0] * mat[2][2]) - (mat[0][2] * mat[2][0]);
        invmat[1][2] = (mat[0][0] * mat[2][1]) - (mat[0][1] * mat[2][0]);
        invmat[2][0] = (mat[0][1] * mat[1][2]) - (mat[0][2] * mat[1][1]);
        invmat[2][1] = (mat[0][0] * mat[1][2]) - (mat[0][2] * mat[1][0]);
        invmat[2][2] = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
        
        // Product of Cofactors
        
        int sign = 0;
        
        for(int i=0; i<invmat.length; i++)
        {
            for(int j=0; j<invmat[0].length; j++)
            {
                if(sign%2==0)
                    cofact[i][j] = (int)invmat[i][j]*1;
                else
                    cofact[i][j] = (int)invmat[i][j]*-1;
                
                sign++;
            }
            
        }
        
        // Product of Adjugate
        
        for(int i=0; i<cofact.length; i++)
        {
            for(int j=0; j<cofact[0].length; j++)
            {
                if(i!=j)
                    invmat[i][j] = cofact[j][i]; 
                    
                
            }
        }
        
        double determinant = (mat[0][0] * ((mat[1][1] * mat[2][2]) - (mat[1][2] * mat[2][1])) - mat[0][1] * ((mat[1][0] * mat[2][2]) - (mat[1][2] * mat[2][0])) + mat[0][2] * ((mat[1][0] * mat[2][1]) - (mat[1][1] * mat[2][0])));
        
        // Inverse
        for(int i=0; i<invmat.length; i++)
        {
            for(int j=0; j<invmat[0].length; j++)
                invmat[i][j] = invmat[i][j]/determinant;
        
        }
        }
        catch(Exception ex)
        {
            System.out.println("Exception in class Matrix");
            System.out.println("Error in function getInverse: "+ex);
        }
        return invmat;
    }
}
