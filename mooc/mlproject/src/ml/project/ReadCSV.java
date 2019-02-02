/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import sun.awt.OSInfo;

/**
 *
 * @author abhilash
 */
public class ReadCSV {
    
    public ArrayList readD() throws FileNotFoundException, IOException
    {
        BufferedReader readcsv;
        if(OSInfo.getOSType().toString().equals("WINDOWS"))
            readcsv = new BufferedReader(new FileReader("D:\\Internship-program-1\\mooc\\mlproject\\gameplay.csv"));
        else
        {
            readcsv = new BufferedReader(new FileReader("/home/abhilash/Internship-program-1/mooc/mlproject/gameplay.csv"));
        }
        ArrayList alldata = new ArrayList();
        
        String line = null;
        Scanner sc = null;
        
        while((line=readcsv.readLine())!=null)
        {
            sc = new Scanner(line);
            
            while(sc.hasNext())
            {
                ArrayList temp = new ArrayList();
                String data[] = sc.nextLine().split(",");
                for(int i=0; i<data.length; i++)
                {
                    temp.add(data[i]);   
                }
                alldata.add(temp);
            }
        }
        
        return alldata;
    }
}
