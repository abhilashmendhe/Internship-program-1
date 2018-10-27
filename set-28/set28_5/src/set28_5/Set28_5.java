/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_5;

/**
 *
 * @author abhil
 */
public class Set28_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try 
        {
           fun();
        }
        catch (NullPointerException e) {
            System.out.println("Throw at main function"+e);
        }
    }
    
    static void fun()
    {
        try
        {   
            throw new NullPointerException();
            //throw  new NoSuchMethodException();
        }
        catch(NullPointerException ex)
        {
            
            System.out.println("Throw at function fun: ");
            throw ex;
        }
    }
}
