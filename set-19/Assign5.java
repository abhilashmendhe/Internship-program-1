/**
 * @(#)Assign5.java
 *
 *
 * @author
 * @version 1.00 2018/9/20
 */

package set19;
import java.util.*;
public class Assign5 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row: ");int r = sc.nextInt();
    	System.out.print("\nEnter col: ");int c = sc.nextInt();
    	int mat[][] = new int[r][c];
    	System.out.println("\nEnter elements in matrix");
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			mat[i][j] = sc.nextInt();
    	}

    	System.out.println("Elements in matrix");
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			System.out.print(" "+mat[i][j]);

    		System.out.println();
    	}

    	int sum = getSum(mat);
    	System.out.println("Sum of all elements of matrix is: "+sum);
    }

    static int getSum(int mat[][])
    {
    	int sum = 0;
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			sum += mat[i][j];
    	}

    	return sum;
    }

}