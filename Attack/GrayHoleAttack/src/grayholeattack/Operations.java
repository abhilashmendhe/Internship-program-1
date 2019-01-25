/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grayholeattack;

/**
 *
 * @author abhilash
 */
public class Operations {
    String allmsg = "";
    public void doOps(String msg)
    {
        if(msg.contains("0")||msg.contains("1")||msg.contains("2")||msg.contains("3")||msg.contains("4")||msg.contains("5")||msg.contains("6")||msg.contains("7")||msg.contains("8")||msg.contains("9"))
        {
            String msg_split[] = msg.split("#");
            int hop_cnt = Integer.parseInt(msg_split[3]);
            hop_cnt++;
            System.out.println(hop_cnt);
        }
    }
    
}
