/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_1;

/**
 *
 * @author abhil
 */

import java.util.*;
public class Set28_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");int a = sc.nextInt();
        System.out.print("Enter b number: ");int b = sc.nextInt();
        
        int c = a / b;
        
            System.out.println("Div is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: "+e);
        }
    }
    
}
