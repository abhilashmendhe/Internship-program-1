/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/9/20
 */

package set19;
import java.util.*;
public class Assign7 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row: ");int r = sc.nextInt();
    	System.out.print("\nEnter col: ");int c = sc.nextInt();
    	System.out.println("\nEnter elements in matrix");
    	int mat[][] = new int[r][c];
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			mat[i][j] = sc.nextInt();
    	}
    	System.out.println("\nElements of matix are");
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			System.out.print(" "+mat[i][j]);

    		System.out.println();
    	}

    	int transpose[][] = getTranspose(mat);

    	System.out.println("Transpose is");
    	for(int i=0; i<transpose.length; i++)
    	{
    		for(int j=0; j<transpose[0].length; j++)
    			System.out.print(" "+transpose[i][j]);

    		System.out.println();
    	}
    }

	static int[][] getTranspose(int mat[][])
	{
		int tran[][] = new int[mat[0].length][mat.length];
		System.out.println(tran.length+" "+tran[0].length);
		for(int i=0; i<tran.length; i++)
    	{
    		for(int j=0; j<tran[0].length; j++)
    			tran[i][j] = mat[j][i];
    	}

    	return tran;
	}

}