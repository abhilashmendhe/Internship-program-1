/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_6;

import javax.sound.midi.Soundbank;

/**
 *
 * @author abhi
 */
public class Test {
    
    public int n;

    int arr[];
    public void getLenght(int x)
    {
        n=x;
        arr = new int[x];
    }
    
    public void setArray(int b[])
    {
        for(int i=0; i<b.length; i++)
            arr[i] = b[i];
    }
    
    public int[] getSDRange()
    {
        double mean = 0;
        double var = 0;
        double sd = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
            mean = (double)(mean+arr[i]);    
        }
        mean = (double)(mean/arr.length);
        
        for(int i=0; i<arr.length; i++)
            var += Math.pow((mean-arr[i]), 2);
        
        sd += Math.sqrt((var)/arr.length);
        
        double r1 = mean-sd;
        double r2 = mean+sd;
        System.out.println("\nmean: "+mean+"\nsd: "+sd);
        System.out.println("\nR1: "+r1+"\nR2: "+r2);
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(r1<arr[i] && arr[i]<r2)
                count++;
        }
        
        int range[] = new int[count];
        int pos = 0;
        for(int i=0; i<arr.length; i++)
        {
            if((r1<=arr[i]) && (arr[i]<=r2))
                range[pos++] = arr[i];
        }
    
        return range;
    }
    
   
}
