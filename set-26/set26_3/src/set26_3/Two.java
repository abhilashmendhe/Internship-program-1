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
public class Two extends One {
    
    private int y;
    
    private void getY(int y)
    {
        this.y = y;
    }
    
    public void callGetY(int y)
    {
        this.y = y;
    }
    
    public int retY()
    {
        return y;
    }
}
