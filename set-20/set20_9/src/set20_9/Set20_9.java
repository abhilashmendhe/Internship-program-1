/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set20_9;

/**
 *
 * @author abhi
 */
public class Set20_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String st = "I love my India".toLowerCase();
        
        String str[] = st.split(" ");
        int count = 0;
        for(int i=0; i<str.length; i++)
        {
            /*char ch = str[i].charAt(0);
            if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u')
                count++;
                    */
            if(str[i].startsWith("a") || str[i].startsWith("e") || str[i].startsWith("i") || str[i].startsWith("o") || str[i].startsWith("u"))
                count++;
        }
        System.out.println("Number of words starting with vowel are "+count);
    }
    
}
