/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_7;

/**
 *
 * @author abhil
 */
public class Set26_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        P2 p = new P2();
        
        p.callGetXY(1, 2);
        p.getXY(3, 2);
        p.getParallelYaxis();
        
        P4 p1 = new P4();
        p1.CallGetXY2(1, 2);
        p1.callGetXY(3, 2);
        p1.getXY3(1, 4);
        
        p1.formTriangle();
    }
    
}
