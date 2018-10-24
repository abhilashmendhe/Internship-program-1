/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_8;

/**
 *
 * @author abhil
 */
public class RowB1 extends RowA1 {
    
    private int rb1, rb2, rb3;
    
    private void getRB1(int a, int b, int c)
    {
        rb1 = a;
        rb2 = b;
        rb3 = c;
    }
    
    public void CallGetRB1(int a, int b, int c)
    {
        getRB1(a, b, c);
    }
    
    public int retRB1()
    {
        return rb1;
    }
    
    public int retRB2()
    {
        return rb2;
    }
    
    public int retRB3()
    {
        return rb3;
    }
    
}
