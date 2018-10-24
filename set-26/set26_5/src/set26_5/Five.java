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
public class Five extends Four{
    
    private int a5;
    
    private void getA5(int a5)
    {
        this.a5 = a5;
    }
    
    public void callA5(int a5)
    {
        getA5(a5);
    }
    
    public int retA5()
    {
        return a5;
    }
    
    public int[] formArray()
    {
        int a[] = new int[5];
        a[0] = retA1();
        a[1] = retA2();
        a[2] = retA3();
        a[3] = retA4();
        a[4] = retA5();
        
        return a;
    }
}
