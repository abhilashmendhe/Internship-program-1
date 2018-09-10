/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2018/9/10
 */

package set17;
import java.util.*;
public class Assign2 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row size of matrix: ");int r = sc.nextInt();
    	System.out.print("Enter col size of matrix: ");int c = sc.nextInt();

    	int mat[][] = new int[r][c];
    	System.out.println("Enter elements in matrix");

    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			mat[i][j] = sc.nextInt();
    	}

    	System.out.println("Elements of matrix");
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			System.out.print(" "+mat[i][j]);

    			System.out.println();
    	}

    	System.out.print("Enter row to find the sum of elements: ");int row = sc.nextInt();
    	if(row <= r)
    	{
    	int sum = 0;
    	for(int i=0; i<mat[0].length; i++)
    	{
    		sum +=mat[row-1][i];
    	}
    	System.out.println("Sum of elements of said row is "+sum);
    	}
    	else
    		System.out.println("Please enter valid row!!!");
    }

}