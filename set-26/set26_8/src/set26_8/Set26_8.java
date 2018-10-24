/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_8;

/**
 *
 * @author abhil
 */
public class Set26_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matrix1 m1 = new Matrix1();
        m1.CallGetRA1(1, 2, 3);
        m1.CallGetRB1(4, 5, 6);
        int mat1[][] = m1.formMat1();
        
        Matrix2 m2 = new Matrix2();
        m2.CallGetRA2(1, 2);
        m2.CallGetRB2(3, 4);
        int mat2[][] = m2.formMat2();
        
        Average a = new Average();
        a.getAverage(mat1, mat2);
        
    }
    
}
