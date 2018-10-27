/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_2;

/**
 *
 * @author abhil
 */
public class Set28_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            int a[] = {5,0};
            int c = 10 / a[1];
               System.out.println("Ans "+c);
            
               
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmatic exception "+e);
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index error: "+e);
        }
              
    }
    
}
