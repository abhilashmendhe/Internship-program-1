/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author abhil
 */
public class Sort {

    
    public int[] getAscendingSort(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            
        }
        
        return a;
    }
    
    public int[] getDecendingSort(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(a[j]<a[j+1])
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            
        }
        
        return a;
    }
}
