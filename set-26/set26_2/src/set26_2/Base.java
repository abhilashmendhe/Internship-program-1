/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_2;

/**
 *
 * @author abhil
 */
public class Base {
    private int b;
    
    private void getB(int b)
    {
        this.b = b;
    }
    
    public void callGetB(int x)
    {
        getB(x);
    }
    
    public int retB()
    {
        return b;
    }
}
