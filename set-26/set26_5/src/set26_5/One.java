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
public class One {
    
    private int a1;
    
    private void getA1(int a1)
    {
        this.a1 = a1;
    }
    
    public void callA1(int a1)
    {
        getA1(a1);
    }
    
    public int retA1()
    {
        return a1;
    }
    
}
