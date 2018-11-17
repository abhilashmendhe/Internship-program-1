/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set34_4;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author abhilash
 */
public class Set34_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        DataInputStream dis = new DataInputStream(System.in);
        int a[] = new int[5];
        
        System.out.println("Enter elements in array");
                
        for(int i=0; i<a.length; i++)
        {
            String s1 = dis.readLine();
            a[i] = Integer.parseInt(s1);
        }
            
        double mean = 0;
        for(int i=0; i<a.length; i++)
            mean += a[i];
        
        mean = mean / a.length;
        
        double sd = 0;
        double var = 0;
        
        for(int i=0; i<a.length; i++)
            var += Math.pow((mean-a[i]), 2);
        
        sd = Math.sqrt(var/a.length);
        
        
        
        System.out.println("Mean is "+mean);
        System.out.println("SD is "+sd);
    }
    
}
