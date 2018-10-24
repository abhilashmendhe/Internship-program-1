/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_3;

/**
 *
 * @author abhil
 */
public class One {
    
    private int x;
    
    private void getX(int x)
    {
        this.x = x;
    }
    
    public void callGetX(int x)
    {
        getX(x);
    }
    
    public int retX()
    {
        return x;
    }
}
