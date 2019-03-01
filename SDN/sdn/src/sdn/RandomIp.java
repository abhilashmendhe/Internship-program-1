/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdn;

import java.util.Random;

/**
 *
 * @author abhilash
 */
public class RandomIp {
    
    public String genrateIp()
    {
        Random r = new Random();
        int a1 = r.nextInt(255);
        int a2 = r.nextInt(255);
        int a3 = r.nextInt(255);
        int a4 = r.nextInt(255);
        String s = a1+"."+a2+"."+a3+"."+a4;
        return s;
    }
}
