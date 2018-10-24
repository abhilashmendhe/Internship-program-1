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
public class RowA2 {
    
    private int ra1,ra2;
    
    private void getRA2(int a, int b)
    {
        ra1 = a;
        ra2 = b;
    }
    
    public void CallGetRA2(int a, int b)
    {
        getRA2(a, b);
    }
    
    public int retRA1()
    {
        return ra1;
    }
    
    
    public int retRA2()
    {
        return ra2;
    }
    
}
