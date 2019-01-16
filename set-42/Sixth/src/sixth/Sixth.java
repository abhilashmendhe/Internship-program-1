/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixth;

import java.net.MalformedURLException;
import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class Sixth {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<String> allurl;
    public static void main(String[] args) {
        // TODO code application logic here
         
        String url="http://www.puneritraveller.com/";
       LinkGenerator n=new LinkGenerator(); //creating object for new link
        try {
            n.getData(url); // calling method of newlink
            
            
        }
        catch (MalformedURLException ex) 
        {
            System.out.println("ex "+ex);
        }
    }
    
}
