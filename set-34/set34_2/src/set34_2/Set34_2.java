/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set34_2;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author abhilash
 */
public class Set34_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.print("Enter first number: ");String s1 = dis.readLine();
        int n1 = Integer.parseInt(s1);
        System.out.print("Enter second number: ");String s2 = dis.readLine();
        int n2 = Integer.parseInt(s2);
        int n3 = n1 + n2;
        int count = 1;
        int gcd = 1;
        while(n3>0)
        {
            if(n1%count==0 && n2%count==0)
                gcd = count;
            count++;
            n3--;
        }
        
        System.out.println("\nGCD is "+gcd);
    }
    
}
