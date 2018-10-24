/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_5;

/**
 *
 * @author abhil
 */
public class Reverse {
    
    public void getReverse(int a[])
    {
        for(int i=0; i<a.length/2; i++)
        {
            int tmp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = tmp;
        }
        
        for(int i=0; i<a.length; i++)
            System.out.print(" "+a[i]);
    }
}
