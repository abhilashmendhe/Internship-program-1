/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tf.idf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author abhil
 */
public class CalculateTFIDF {
    
    public void cal() throws IOException 
    {
        String concat = "";
        ArrayList<String> datacontent = new ProcessInitiator().intiate();
        
        
        HashSet uniq = new HashSet();
       // TreeSet uniq = new TreeSet();
        uniq.addAll(datacontent);
        datacontent.clear();
        datacontent.addAll(uniq);
        
        File folder = new File(FolderSelectionFrame.path);
        File f[] = folder.listFiles();
        for(int i=0; i<datacontent.size(); i++)
        {
            int count = 0;
            
            for(int j=0; j<f.length; j++)
            {
                String abspath = f[j].getAbsolutePath();
                String cont = new TextFileReader().readfile(abspath);
                String lcont = cont.toLowerCase();
                
                String arr[] = lcont.split(" ");
                for(int k=0; k<arr.length; k++)
                {
                    if(arr[k].equals(datacontent.get(i)))
                    {
                        count++;
                        break;
                    }           
                }
                
            } 
            double div = ((double)f.length/count);
            double idf = Math.log10(div);
            
            System.out.println(datacontent.get(i));
            for(int a=0; a<f.length; a++)
            {
                int tfcount = 0;
                String abspath = f[a].getAbsolutePath();
                String cont = new TextFileReader().readfile(abspath);
                String lcont = cont.toLowerCase();
                
                String arr[] = lcont.split(" ");
                for(int k=0; k<arr.length; k++)
                {
                    if(arr[k].equals(datacontent.get(i)))
                        tfcount++;
                }
                double tfidf = tfcount*idf;
                System.out.println("Doc "+(a+1)+") tf-idf: "+tfidf);
            }
            System.out.println("------------------------------------------------------");
        }   
    }
}
