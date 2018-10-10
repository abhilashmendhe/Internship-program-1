/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_5;

/**
 *
 * @author abhil
 */
public class BiggestGcd {
    
    void getBiggest(int g1, int g2, int g3)
    {
        if(g1>g2 && g1>g3)
            System.out.println(g1+" is the biggest GCD");
        else if(g2>g1 && g2> g3)
            System.out.println(g2+" is the biggest GCD");
        else
            System.out.println(g3+" is the biggest GCD");
    }
}
