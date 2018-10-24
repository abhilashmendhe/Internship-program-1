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
public class Matrix extends Row2{
    
    public int[][] formMatrix()
    {
        int mat[][] = new int[2][2];
        
        mat[0][0] = retRow00();
        mat[0][1] = retRow01();
        mat[1][0] = retRow11();
        mat[1][1] = retRow11();
        return mat;
    }
}
