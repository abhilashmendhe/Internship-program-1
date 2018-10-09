/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set20_13;

/**
 *
 * @author abhi
 */
public class Set20_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Mahabharat";
        String s = str.substring(0,3);
        String s1 = str.replace(s, "");
        System.out.println(s1+s);
    }
    
}
