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
public class Four extends Three{

    private int a4;
    
    private void getA4(int a4)
    {
        this.a4 = a4;
    }
    
    public void callA4(int a4)
    {
        getA4(a4);
    }
    
    public int retA4()
    {
        return a4;
    }
}
