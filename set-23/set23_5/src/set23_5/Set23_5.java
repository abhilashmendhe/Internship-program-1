/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set23_5;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cod
        Scanner sc = new Scanner(System.in);
        
        Customer a[] = new Customer[10];
        
        for(int i=0; i<a.length; i++)
        {
            System.out.print("Enter name: ");String n = sc.next();
            System.out.print("Enter acc no.: ");int acc = sc.nextInt();
            System.out.print("Enter amt: ");double amt = sc.nextDouble();
            
            a[i] = new Customer();
            a[i].getData(n, acc, amt);          
        }
        
        Find f = new Find();
        f.getCustomer(a);
    }
    
}
