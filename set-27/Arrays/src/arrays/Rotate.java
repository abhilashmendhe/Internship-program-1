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
public class Rotate {
    public int[] fromTop(int a[], int n)
    {
        
        while(n>0)
        {
            int tmp = a[a.length-1];
            
            for(int i=0; i<a.length; i++)
            {
                if(a.length-1-i>0)
                    a[a.length-1-i] = a[a.length-2-i];
            }
            a[0] = tmp;
            n--;
        }
        return a;
    }
    
    public int[] fromBottom(int a[], int n)
    {
        while(n>0)
        {
            int tmp = a[0];
            
            for(int i=0; i<a.length-1; i++)
            {
                a[i] = a[i+1];
            }
            a[a.length-1]=tmp;
            n--;
        }
        
        return a;
    }
}
