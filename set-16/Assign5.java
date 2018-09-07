/**
 * @(#)Assign5.java
 *
 *
 * @author
 * @version 1.00 2018/9/7
 */

package set16;
import java.util.*;
public class Assign5 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);

    	System.out.print("Enter row size of matrix: ");int r = sc.nextInt();
    	System.out.print("Enter col size of matrix: ");int c = sc.nextInt();

    	int mat[][] = new int[r][c];
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			mat[i][j] = sc.nextInt();
    	}

    	int mat1[][] = new int[c][r];
    	for(int i=0; i<mat1.length; i++)
    	{
    		for(int j=0; j<mat1[0].length; j++)
    			mat1[i][j] = mat[j][i];
    	}

    	for(int i=0; i<mat1.length; i++)
    	{
    		for(int j=0; j<mat1[0].length; j++)
    			System.out.print(" "+mat1[i][j]);
    	System.out.println();
    	}
    }

}