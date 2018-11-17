/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set34_7;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author abhilash
 */
public class Set34_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        FileInputStream fis = new FileInputStream("/home/abhilash/file1.txt");
        DataInputStream dis = new DataInputStream(fis);
        
        BufferedReader buf = new BufferedReader(new InputStreamReader(dis));
        
        String line;
        
        while((line=buf.readLine())!=null)
        {
            System.out.println(line);
        }
    }
    
}
