/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_6;

/**
 *
 * @author abhil
 */
public class Set28_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            fun();
        }
        catch(NoSuchMethodException s)
        {
            System.out.println("In main: "+s);
        }
    }
    
    static void fun() throws NoSuchMethodException
    {
        System.out.println("Inside fun()");
        throw  new NoSuchMethodException();
    }
    
}
