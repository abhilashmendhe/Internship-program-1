/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixth.pkg1_1;

import java.util.Scanner;

/**
 *
 * @author abhilash
 */
public class Sixth1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DataSender d = new DataSender();
        //String msg = "Hello";
        String ip = "192.168.1.65";
        while(true)
        {
            String msg = sc.next();
        d.SendData(msg, ip);
        }
    }
    
}
