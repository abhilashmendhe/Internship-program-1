/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_6;

/**
 *
 * @author abhil
 */
public class Row1 {
 
    private int r1,r2;
    
    private void getRows1(int a, int b)
    {
        r1 = a;
        r2 = b;
    }
    
    public void callGetRows1(int a, int b)
    {
        getRows1(a, b);
    }
    
    public int retRow00()
    {
        return r1;
    }
    
    public int retRow01()
    {
        return r2;
    }
}
