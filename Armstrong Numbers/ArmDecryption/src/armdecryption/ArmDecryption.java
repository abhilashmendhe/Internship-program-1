

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author abhil
 */
public class ArmDecryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String ciphertext = "728.0,1137.0,1677.0,1062.0,3138.0,4625.0,7225.0,4102.0,14768.0,20529.0,33429.0,17862.0,477.0,891.0,1664.0,504.0,1673.0,3817.0,7086.0,1818.0,6741.0,17955.0,32552.0,7800.0,528.0,891.0,1606.0,959.0,2298.0,3817.0,6904.0,3677.0,10728.0,17955.0,31678.0,15911.0,528.0,891.0,1291.0,975.0,2298.0,3817.0,5247.0,3861.0,10728.0,17955.0,23395.0,17079.0,802.0,870.0,1743.0,973.0,3392.0,3656.0,7435.0,3785.0,15922.0,17094.0,34191.0,16621.0,620.0,1048.0,1428.0,329.0,2026.0,4160.0,6308.0,1299.0,7724.0,18376.0,29988.0,5729.0";
        //String ciphertext = "902.0,1089.0,1438.0,952.0,3604.0,4385.0,6372.0,3664.0,15830.0,19593.0,30334.0,15880.0";
        //String ciphertext = "902.0,1089.0,1438.0,952.0,3604.0,4385.0,6372.0,3664.0,15830.0,19593.0,30334.0,15880.0,688.0,1105.0,1340.0,827.0,2708.0,4421.0,5368.0,3477.0,11608.0,19729.0,23732.0,16307.0";
        //String ciphertext = "902.0,1089.0,1438.0,952.0,3604.0,4385.0,6372.0,3664.0,15830.0,19593.0,30334.0,15880.0,688.0,1105.0,1340.0,827.0,2708.0,4421.0,5368.0,3477.0,11608.0,19729.0,23732.0,16307.0,952.0,1111.0,1666.0,959.0,3664.0,4667.0,7032.0,3677.0,15880.0,20935.0,32170.0,15911.0";
       // String ciphertext = "779.0,890.0,1383.0,742.0,3071.0,3598.0,6075.0,2834.0,13427.0,16082.0,28431.0,12190.0";
       String ciphertext = "779.0,890.0,1383.0,742.0,3071.0,3598.0,6075.0,2834.0,13427.0,16082.0,28431.0,12190.0,848.0,1105.0,1674.0,323.0,3508.0,4421.0,7386.0,1273.0,15608.0,19729.0,34242.0,5603.0"; 
       String plaintext = new DecrytionHelper().getDecrytionString(ciphertext);
        System.out.println(plaintext);
    }
    
}
