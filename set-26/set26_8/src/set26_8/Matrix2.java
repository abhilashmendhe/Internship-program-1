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
public class Matrix2 extends RowB2{
    
    public int[][] formMat2()
    {
        int mat[][] = new int[2][2];
        mat[0][0] = retRA1();
        mat[0][1] = retRA2();
        mat[1][0] = retRB1();
        mat[1][1] = retRB2();
        
        return mat;
    }
}
