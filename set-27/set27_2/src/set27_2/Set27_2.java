/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set27_2;

/**
 *
 * @author abhil
 */
public class Set27_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        One o = new One();
        o.getData(10, 20);
        o.findProcess();
        
        o = new Two();
        o.getData(10, 20);
        o.findProcess();
        
        o = new Three();
        o.getData(10, 20);
        o.findProcess();
    }
    
}
