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
public class DecrytionHelper {
    
    public String getDecrytionString(String ciphertext)
    {
        String plaintext = "";
        
        String encarr[] = ciphertext.split(",");
        double encarray[] = new double[encarr.length];
        double encodemat[][] = {{1,5,3},{1,25,9},{1,125,27}};
        double encmat[][] = new double[3][4];
        double arm[] = {1,5,3,1,25,9,1,125,27,1,5,3};
        for(int i=0; i<encarray.length; i++)
            encarray[i] = Double.parseDouble(encarr[i]);
        
       
        
        double decodmat[][] = new Inverse().getInverse(encodemat);
        int x = 12;
        int k=0, l=0;
        int temp = 1;
        int inc = 1;
        for(int i=0; i<=encarr.length; i++)
        {
            
            if(i!=x)
            {
                if(temp++!=5)
                {
                    if(i==encarr.length)
                        break;
                    encmat[k][l++] = encarray[i];
                }
                else
                {
                    temp=1;
                    k++;
                    l=0;
                    i--;
                }
            }
            else
            {
                temp=1;
                k=0;
                l=0;
                i--;
                
                x++;
                x = x+11;
                
                double decmatrix[][] = new Product().getProduct(decodmat, encmat);
                
        double encarr1[] = new double[12];
                
        int e=0,f=0;
        int tmp1 = 1;
        for(int j=0; j<encarr1.length; j++)
        {
            if(tmp1++%4!=0)
            {
                encarr1[j] = Math.round(decmatrix[e++][f])-arm[j];
            }
            else
            {
                e=0;
                f++;
                j--;
            }
        }
        
        for(int m=0; m<encarr1.length; m++)
        {
            char ch = (char)encarr1[m];
            plaintext += ch;
            
        }
                
            
            
        }

        }
        
        return plaintext;
    }
}
