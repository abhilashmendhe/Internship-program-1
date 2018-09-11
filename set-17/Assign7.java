/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/9/10
 */

package set17;
import java.util.*;
public class Assign7 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row size of matrix: ");int r = sc.nextInt();
    	System.out.print("Enter col size of matrix: ");int c = sc.nextInt();

    	int mat[][] = new int[r][c];

    	System.out.println("Enter elements of matrix");
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			mat[i][j] = sc.nextInt();
    	}
    	System.out.println("Matrix is");
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			System.out.print(" "+mat[i][j]);
    		System.out.println();
    	}
    	System.out.println("Boudary elements of matrix are");
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    		{
    			if(i==0 || i==mat.length-1 || j==0 || j==mat[0].length-1)
    				System.out.print(" "+mat[i][j]);
    			else
    				System.out.print("  ");
    		}
    		System.out.println();
    	}

    }

}