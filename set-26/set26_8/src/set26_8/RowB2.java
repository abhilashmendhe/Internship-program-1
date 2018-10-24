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
public class RowB2 extends RowA2{

    private int rb1, rb2;
    
    private void getRB2(int a, int b)
    {
        rb1 = a;
        rb2 = b;
    }
    
    public void CallGetRB2(int a, int b)
    {
        getRB2(a, b);
    }
    
    public int retRB1()
    {
        return rb1;
    }
    
    public int retRB2()
    {
        return rb2;
    }
}
