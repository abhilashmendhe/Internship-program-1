/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set20_5;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

/**
 *
 * @author abhi
 */
public class Set20_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Abhilash".toLowerCase();
        
        int vowel = 0;
        int consonants = 0;
        
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel++;
            else
                consonants++;
        }
        
        System.out.println("Number of vowels in given string: "+vowel);
        System.out.println("Number of consonats in given string: "+consonants);
    }
    
}
