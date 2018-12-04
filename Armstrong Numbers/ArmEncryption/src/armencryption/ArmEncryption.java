//package armencryption;


import java.util.ArrayList;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import com.sun.org.apache.xml.internal.security.encryption.EncryptedData;

/**
 *
 * @author abhil
 */
public class ArmEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String plaintext = "Hi Howareyou? Iam fine.. I am Batman I am a member of justice league!!!";
        String plaintext = "CRYPTOGRAPHY batma vs";// Batman you iam superman";
        String ciphertext = "";
        ArrayList<String> blockstr = new BlockMaker().getBlocks(plaintext);
        System.out.println(blockstr.get(0));
        System.out.println(blockstr.get(1));
        for(int i=0; i<blockstr.size(); i++)
        {
            String temp = blockstr.get(i);
            System.out.println(temp);
            String filest = new EncrytionHelper().getEncryptString(temp);
            ciphertext = ciphertext + filest + ",";
        }
        System.out.println(ciphertext.substring(0, ciphertext.length()-1));
        String ccc[] = ciphertext.split(",");
        System.out.println(ccc.length);
        
    }
    
}
