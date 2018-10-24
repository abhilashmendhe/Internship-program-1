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
public class Three extends Two{

    private int a3;
    
    private void getA3(int a3)
    {
        this.a3 = a3;
    }
    
    public void callA3(int a3)
    {
        getA3(a3);
    }
    
    public int retA3()
    {
        return a3;
    }
}
