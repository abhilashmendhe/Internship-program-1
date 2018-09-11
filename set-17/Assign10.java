/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/9/11
 */

package set17;
import java.util.*;
public class Assign10 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row size of matrix: ");int r = sc.nextInt();
    	System.out.print("Enter col size of matrix: ");int c = sc.nextInt();

    	int mat[][] = new int[r][c];

    	System.out.println("Enter Elements in matrix");
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

		if(r==c){

    	int trace = 0;
		double normal = 0;
		double nor_sum = 0;
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    		{
    			if(i==j)
    				trace += mat[i][j];
    		}

    		for(int k=0; k<mat[0].length; k++)
    		{
    			nor_sum += (double)(mat[i][k] * mat[i][k]);
    		}

    	}

    	System.out.println("Trace is: "+trace);
    	System.out.println("Normal is: "+Math.sqrt(nor_sum));
		}
		else
			System.out.println("Please enter a valid row size and column size to make a square matrix");
    }

}