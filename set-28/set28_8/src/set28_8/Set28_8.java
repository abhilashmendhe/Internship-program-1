/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_8;

/**
 *
 * @author abhil
 */
public class Set28_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            throw new NullPointerException();
        }
        finally
        {
            System.out.println("It free's the memory dude!!! but does'nt checks any error");
        }
    }
    
}
