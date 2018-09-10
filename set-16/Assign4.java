/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/9/7
 */

package set16;
import java.util.*;
public class Assign4 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row size of first matrix: ");int r1 = sc.nextInt();
    	System.out.print("Enter col size of first matrix: ");int c1 = sc.nextInt();
    	int mat1[][] = new int[r1][c1];

    	System.out.print("Enter row size of second matrix: "); int r2 = sc.nextInt();
    	System.out.print("Enter col size of second matrix: "); int c2 = sc.nextInt();
    	int mat2[][] = new int[r2][c2];

    	if(c1==r2)
    	{
    		System.out.println("Enter elements in first matrix");
    		for(int i=0; i<mat1.length; i++)
    		{
    			for(int j=0; j<mat1[0].length; j++)
    				mat1[i][j] = sc.nextInt();
    		}
    		System.out.println("Enter elements in second matrix");
    		for(int i=0; i<mat2.length; i++)
    		{
    			for(int j=0; j<mat2[0].length; j++)
    				mat2[i][j] = sc.nextInt();
    		}


			int mat3[][] = new int[r1][c2];
    		for(int i=0; i<mat3.length; i++)
    		{
    			for(int j=0; j<mat3[0].length; j++)
    			{
    				int sum = 0;

    				for(int k=0; k<c1; k++)
    				sum += mat1[i][k] * mat2[k][j];

    				mat3[i][j] = sum;
    			}

    		}
			System.out.println("\nMultiplication of two matrices is\n");
    		for(int i=0; i<mat3.length; i++)
    		{
    			for(int j=0; j<mat3[0].length; j++)
    				System.out.print(" "+mat3[i][j]);
    			System.out.println();
    		}

    	}
    	else
    		System.out.println("Cannot do multiplication of two matrix");
    }

}