/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set34_1;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author abhilash
 */
public class Set34_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.print("Enter number: ");String s = dis.readLine();
        int n = Integer.parseInt(s);
        
        int rev = 0;
        while(n>0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        
        System.out.println("\nReverse is "+rev);
    }
    
}
