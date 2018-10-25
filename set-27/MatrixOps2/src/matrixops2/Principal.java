/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixops2;

/**
 *
 * @author abhil
 */
public class Principal {
    public int[] getAbove(int m[][])
    {
        int count = 0;
        int inn = 1;
        for(int i=0; i<m.length; i++)
        {
            for(int j=inn; j<m[0].length; j++)
            {
                if(i<m[0].length-1)
                    count++;
            }
            inn++;
        }
        
        int innn = 1;
        int pos=0;
        int arr[] = new int[count];
        for(int i=0; i<m.length; i++)
        {
            for(int j=innn; j<m[0].length; j++)
            {
                if(i<m[0].length-1)
                    arr[pos++]=m[i][j];
                    
            }
            innn++;
        }
        
        return arr;
    }
    public int[] getBelow(int m[][])
    {
        int count = 0;
        int inn = 0;
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                if(j<inn)
                    count++;            
            }
            inn++;
        }
        
        int pos=0;
        int innn=0;
       
        int arr[] = new int[count];
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                if(j<innn)
                    arr[pos++]=m[i][j];
            }       
            innn++;
        }
        return arr;
    }
}
