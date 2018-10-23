/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_8;

/**
 *
 * @author abhil
 */
public class Two extends One{
    
    private int y;
    
    public void getY(int a)
    {
        y = a;
    }
    
    public int Sum()
    {
        int c = y + retX();
        return c;
    }
    
}
