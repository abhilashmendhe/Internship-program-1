/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import jxl.read.biff.BiffException;

/**
 *
 * @author abhilash
 */
public class Mooc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, BiffException {
        // TODO code application logic here
     
        ArrayList all = new ReadDataSet().readcsv();
        for(int i=0; i<all.size(); i++)
            System.out.println(all.get(i));
        
    }
    
}
