/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_6;

/**
 *
 * @author abhil
 */
public class Five extends Four{
    
    int a5;
    
    void getData(int a1, int a2, int a3, int a4, int a5)
    {
        super.getData(a1, a2, a3,a4);
        this.a5 = a5;
    }
    
    int[] getArray()
    {
        int arr[] = new int[5];
        arr[0] = a1;
        arr[1] = a2;
        arr[2] = a3;
        arr[3] = a4;
        arr[4] = a5;
        
        
        return arr;
    }
            
}
