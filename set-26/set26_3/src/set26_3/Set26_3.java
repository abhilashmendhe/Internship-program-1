/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_3;

/**
 *
 * @author abhil
 */
public class Set26_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Four t1 = new Four();
        t1.callGetX(-1);
        t1.callGetY(0);
        t1.getPosition();
        
        Three t2 = new Three();
        t2.callGetX(6);
        t2.callGetY(2);
        t2.getXY(3, 2);
        t2.getDistance();
    }
    
}
