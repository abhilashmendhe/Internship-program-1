/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encrytion;

import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class EncrytionHelper {
    
    public String getEncryptString(String st)
    {
        
        String ciphertext = "";
        double arm[] = {1,5,3,1,25,9,1,125,27,1,5,3};
        double encodingmatrix[][] = {{1,5,3},{1,25,9},{1,125,27}};
        double encarr[] = new double[st.length()];
        double mat[][] = new double[3][4];
        
        int k=0,l=0;
        int tmp = 1;
        for(int j=0; j<st.length(); j++)
        {
            char ch = st.charAt(j);
            double x = (int)ch+arm[j];
            encarr[j] = (int)x;
            if(tmp++%4!=0)
            {
                mat[k++][l] = (double) x;
            }
            else
            {
                k=0;
                l++;
                j--;
            }
        }
        
        
        double encmat[][] = new Product().getProduct(encodingmatrix, mat);
        
        
        
        for(int i=0; i<encmat.length; i++)
        {
            for(int j=0; j<encmat[0].length; j++)
            {
                
                double d=Math.round(encmat[i][j]);
                ciphertext=ciphertext+Double.toString(d)+",";
                
               
            }
                //System.out.print(" "+Math.round(encmat[i][j]));
            System.out.println();
        }
        ciphertext=ciphertext.substring(0,ciphertext.length()-1);
        
        
    return ciphertext;
    }
}