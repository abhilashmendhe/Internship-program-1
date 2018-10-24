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
public class Three extends Two{
    
    public int x,y;
    
    public void getXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void getDistance()
    {
        double dist = Math.sqrt(Math.pow((retX()-x), 2)+Math.pow((retY()-y), 2));
        
        System.out.println("Distance between two points is "+dist);
    }
}
