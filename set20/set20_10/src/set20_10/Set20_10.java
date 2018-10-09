/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set20_10;

/**
 *
 * @author abhi
 */
public class Set20_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "India is great".toLowerCase();
        String sub = "great";
        if(str.contains(sub))
            System.out.println("True");
        else
            System.out.println("False");
    }
    
}
