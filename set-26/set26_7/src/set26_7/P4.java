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
public class P4 extends P3{
    
    private int x3, y3;
    
    public void getXY3(int a, int b)
    {
        x3 = a;
        y3 = b;
    }
    
    public void formTriangle()
    {
        double dist1 = Math.sqrt((Math.pow((retX()-retX2()), 2))+Math.pow((retY()-retY2()), 2));
        double dist2 = Math.sqrt((Math.pow((retX()-x3), 2))+Math.pow((retY()-y3), 2));
        double dist3 = Math.sqrt((Math.pow((x3-retX2()), 2))+Math.pow((y3-retY2()), 2));
        
        double p = (dist1+dist2+dist3)/2;
        double A = Math.sqrt(p*(p-dist1)*(p-dist2)*(p-dist3));
 System.out.println(A);
        if(A==0)
            System.out.println("Does not form a trianlge");
        else
            System.out.println("Forms a triangle");
    }
}
