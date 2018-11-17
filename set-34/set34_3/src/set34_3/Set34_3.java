/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set34_3;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author abhilash
 */
public class Set34_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.print("Enter first number: ");String s1 = dis.readLine();
        System.out.print("Enter second number: ");String s2 = dis.readLine();
        System.out.print("Enter third number: ");String s3 = dis.readLine();
        
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);
        
        if(n1>n2 && n1>n3)
            System.out.println("\nFirst number is the greatest");
        else if(n2>n1 && n2>n3)
            System.out.println("\nSecond number is the greatest");
        else
            System.out.println("\nThird number is the greatest");
        
    }
    
}
