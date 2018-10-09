/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_5;

/**
 *
 * @author abhil
 */
public class ReverseArray {
    
    int a;
    
    public void getData(int x)
    {
        a = x;
    }
    
    ReverseArray[] getReverse(ReverseArray r[])
    {
        
        for(int i=0; i<r.length/2; i++)
        {
            int tmp = r[i].a;
            r[i].a = r[r.length-1-i].a;
            r[r.length-1-i].a = tmp;
        }
        return r;
    }
}
