/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set34_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author abhilash
 */
public class Set34_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
       FileReader fr = new FileReader("/home/abhilash/file1.txt");
       FileWriter fw = new FileWriter("/home/abhilash/file2.txt");
       int i;
       
       while((i=fr.read())!=-1)
       {
           fw.write((char)i);
       }
       fw.close();
       fr.close();
       
       
    }

        
    }
    

