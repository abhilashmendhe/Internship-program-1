/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_6;

/**
 *
 * @author abhil
 */
public class Set26_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matrix m = new Matrix();
        m.callGetRows1(2, 2);
        m.callGetRows2(2, 2);
        
        int mat[][] = m.formMatrix();
        
        TraceNormal c = new TraceNormal();
        Datakeeper d = c.getTraceNormal(mat);
        
        System.out.println("Trace is "+d.trace);
        System.out.println("Noraml is "+d.normal);
    }
    
}
