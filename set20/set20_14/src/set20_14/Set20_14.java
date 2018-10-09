/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set20_14;

/**
 *
 * @author abhi
 */
public class Set20_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    String str = "mahabharat";
    String st = str.substring(str.length()-4,str.length());
    String s1 = str.replace(st, "");
        System.out.println(st+s1);
    }
    
}
