/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_5;

/**
 *
 * @author abhi
 */
public class Merge {

    public int[] getOneAfterAnother(int a[], int b[])
    {
        int m[] = new int[a.length+b.length];
        int pos=0;
        for(int i=0; i<a.length+b.length; i++)
        {
            
            if(a.length>i)
                m[i] = a[i];
            else
                m[i] = b[pos++];
        }
        return m;
    }
    
    public int[] getConsecutively(int a[], int b[])
    {
        int m[] = new int[a.length+b.length];
        int pos=0;
        for(int i=0; i<a.length+b.length; i++)
        {
            if(a.length>i)
                m[pos++] = a[i];
            if(b.length>i)
                m[pos++] = b[i];
        }
        return m;
    }
}
