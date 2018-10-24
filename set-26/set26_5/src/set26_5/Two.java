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
public class Two extends One{
    
    private int a2;
    
    private void getA2(int a2)
    {
        this.a2 = a2;
    }
    
    public void callA2(int a2)
    {
        getA2(a2);
    }
            
    public int retA2()
    {
        return a2;
    }
}
