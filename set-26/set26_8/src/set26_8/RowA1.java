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
public class RowA1 {
    
    private int ra1,ra2,ra3;
    
    private void getRA1(int a, int b, int c)
    {
        ra1 = a;
        ra2 = b;
        ra3 = c;
    }
    
    public void CallGetRA1(int a, int b, int c)
    {
        getRA1(a, b, c);
    }
    
    public int retRA1()
    {
        return ra1;
    }
    
    
    public int retRA2()
    {
        return ra2;
    }
    
    
    public int retRA3()
    {
        return ra3;
    }
}
