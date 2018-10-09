/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set20_12;

/**
 *
 * @author abhi
 */
public class Set20_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String str = "My name is Prince Vegeta".toLowerCase();
        String st[] = str.split(" ");
        int count=0;
        for(int i=0; i<st.length; i++)
        {
            /*char ch = st[i].charAt(st[i].length()-1);
            
            if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u')
                count++;
            */
            if(st[i].endsWith("a") || st[i].endsWith("e") || st[i].endsWith("i") || st[i].endsWith("o") || st[i].endsWith("u"))
              count++;
        }
        System.out.println("Number of vowels ending from end are "+count);
    }
    
}
