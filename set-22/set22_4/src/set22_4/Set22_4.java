/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_4;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set22_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc = new Scanner(System.in);
        SumOfArray a[] = new SumOfArray[5];
        System.out.println("Enter elements");
        for(int i=0; i<5; i++)
        {
            int k=sc.nextInt();
            a[i] = new SumOfArray();
            a[i].getData(k);
        }
        
        int s = a[0].getSum(a);
        
        System.out.println("Sum is "+s);
    }
    
}
