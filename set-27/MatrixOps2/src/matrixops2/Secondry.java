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
public class Secondry {

    public int[] getAbove(int m[][])
    {
        int count = 0;
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                if(j<m[0].length-1-i)
                    count++;
                    
            }
        }
        int pos=0;
        int arr[] = new int[count];
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                if(j<m[0].length-1-i)
                    arr[pos++]=m[i][j];
                    
            }
        }
        
        return arr;
    }
    public int[] getBelow(int m[][])
    {
        int count = 0;
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                if(m[0].length-1-i<j)
                    count++;
                    
            }
        }
        int pos=0;
        int arr[] = new int[count];
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                if(m[0].length-1-i<j)
                    arr[pos++]=m[i][j];
                    
            }
        }
        return arr;
    }
}
