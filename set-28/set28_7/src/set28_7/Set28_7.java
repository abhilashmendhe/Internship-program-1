/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_7;

/**
 *
 * @author abhil
 */
public class Set28_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            throw  new NullPointerException();
        }
        catch(NullPointerException ex)
                {
                    System.out.println("Catch");
                }
        finally
        {
            System.out.println("It do's the undone things like freeing memory");
        }
                    
                    
                
    }
    
}
