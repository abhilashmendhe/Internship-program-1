/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/9/10
 */

package set16;
import java.util.*;
public class Assign10 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);

    	System.out.print("Enter row size of matrix: "); int r = sc.nextInt();
    	System.out.print("Enter col size of matrix: "); int c = sc.nextInt();

    	int mat[][] = new int[r][c];
		System.out.println("Enter elements in matrix");
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			mat[i][j] = sc.nextInt();
    	}

    	System.out.println("Matrix before Interchanging the selected rows");

    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			System.out.print(" "+mat[i][j]);

    		System.out.println();
    	}

    	System.out.println("Select a row to interchange with another row: ");int r1 = sc.nextInt();
    	System.out.println("Select another row to interchange with previous selected row: ");int r2 = sc.nextInt();

		if(r1<=r && r2<=r)
		{
    		for(int j=0; j<mat[0].length; j++)
    		{
    			int tmp = mat[r1-1][j];
    			mat[r1-1][j] = mat[r2-1][j];
    			mat[r2-1][j] = tmp;
    		}


    	System.out.println("Matrix after Interchanging the selected rows");

    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			System.out.print(" "+mat[i][j]);

    		System.out.println();
    	}
		}
		else
			System.out.println("Please select valid rows to interchange, Entered row exeeds the row size of matrix");

    }

}