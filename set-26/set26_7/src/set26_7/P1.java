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
public class P1 {
    
    private int x1,y1;
    
    private void getXY(int a, int b)
    {
        x1 = a;
        y1 = b;
    }
    
    public void callGetXY(int a, int b)
    {
        getXY(a, b);
    }
    
    public int retX()
    {
        return x1;
    }
    
    public int retY()
    {
        return y1;
    }
            
}
