/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_6;

/**
 *
 * @author abhil
 */
public class IntArray {

    int a[];

    public IntArray() {
        a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
    }

    public IntArray(int[] arr) {
        this.a = arr;
    }
    
    void getMerge(IntArray q)
    {
     int qqqqq[] = new int[a.length+q.a.length];
        System.out.println(qqqqq.length);
    int pos = 0; 
    
    for(int i=0; i<qqqqq.length; i++)
    {
         if(this.a.length > i)
             qqqqq[i] = this.a[i];
         else
             qqqqq[i] = q.a[pos++];
    }
    
        System.out.println("Merged array is");
        for(int i=0; i<qqqqq.length; i++)
            System.out.print(" "+qqqqq[i]);
        System.out.println();
    }

    
    
    
}
