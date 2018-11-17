/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set34_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author abhilash
 */
public class Set34_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        
        char ch = 0;
        
        do
        {
            ch = (char)buf.read();
            System.out.print(ch);
        }while(ch!='#');
    }
    
}
