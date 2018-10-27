/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_3;

/**
 *
 * @author abhil
 */

public class Set28_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try
        {
            int a[] = new int[2];
            a[0] = 2;
            a[1] = 0;
            //a[2] = 5;
            try
            {
                int c = 10 / a[3];
                System.out.println(c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Error / by zero"+e);
            }
                   
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound!!!!"+e);
        }
                
    }
    
}
