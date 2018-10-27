/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_4;

/**
 *
 * @author abhil
 */
public class Set28_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            throw new NullPointerException();
        }
        catch(NullPointerException ex)
        {
            System.out.println("Error: No object found"+ex);
        }
    }
    
}
