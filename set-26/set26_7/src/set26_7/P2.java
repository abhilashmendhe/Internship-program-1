/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_7;

/**
 *
 * @author abhil
 */
public class P2 extends P1{
    
    private int x2,y2;
    
    public void getXY(int a, int b)
    {
        x2 = a;
        y2 = b;
    }
    
    public void getParallelYaxis()
    {
        if(y2==retY())
            System.out.println("The line is parallel to X-axis");
        else
            System.out.println("The line is not parallel to X-axix");
    }
}
