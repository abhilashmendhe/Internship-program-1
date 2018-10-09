/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_7;

/**
 *
 * @author abhil
 */
public class BigSmall {
    
    int a[], x;
    
    void setData(int b)
    {
        x = b;
        a = new int[b];
    }
    
    void setArray(int aa[])
    {
        for(int i=0; i<aa.length; i++)
            a[i] = aa[i];
    }
    
    Data getBigSmall()
    {
        int big = a[0];
        int small = a[0];
        for(int i=0; i<a.length; i++)
        {
            if(big < a[i])
                big = a[i];
            if(small > a[i])
                small = a[i];
        }
        
        Data d = new Data();
        d.big = big;
        d.small = small;
        
        //System.out.println("Biggest is "+big);
        //System.out.println("Smalles is "+small);
        return d;
    }
        
}
