/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_7;

/**
 *
 * @author abhil
 */
public class P3 extends P1{
    
    private int x2,y2;
    
    private void getXY2(int a, int b)
    {
        x2 = a;
        y2 = b;
    }
    
    public void CallGetXY2(int a, int b)
    {
        getXY2(a, b);
    }
    
    public int retX2()
    {
        return x2;
    }
    
    public int retY2()
    {
        return y2;
    }
}
