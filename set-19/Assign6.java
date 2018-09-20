/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/9/20
 */

package set19;
import java.util.*;
public class Assign6 {

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

    	System.out.print("Enter row: "); int r1 = sc.nextInt();
    	System.out.print("\nEnter col: ");int c1 = sc.nextInt();
		System.out.println("Enter elements in matrix");
    	int mat1[][] = new int[r1][c1];
    	for(int i=0; i<mat1.length; i++)
    	{
    		for(int j=0; j<mat1[0].length; j++)
    			mat1[i][j] = sc.nextInt();
    	}
    	System.out.println("\nElements of matix are");
    	for(int i=0; i<mat1.length; i++)
    	{
    		for(int j=0; j<mat1[0].length; j++)
    			System.out.print(" "+mat1[i][j]);

    		System.out.println();
    	}

    	if(r==r1 && c==c1)
    	{
    		int sum[][] = getTwoSum(mat,mat1);

    	System.out.println("\nElements of matix after sum of two matrix");
    	for(int i=0; i<sum.length; i++)
    	{
    		for(int j=0; j<sum[0].length; j++)
    			System.out.print(" "+sum[i][j]);

    		System.out.println();
    	}
    	}
    	else
    		System.out.println("Cannot perform sum of two matix");

    }
		static int[][] getTwoSum(int m1[][], int m2[][])
		{
		int sum[][] = new int[m1.length][m2.length];
		for(int i=0; i<m1.length; i++)
    	{
    		for(int j=0; j<m2[0].length; j++)
    			sum[i][j] = m1[i][j] + m2[i][j];

    	}

    	return sum;
		}




}