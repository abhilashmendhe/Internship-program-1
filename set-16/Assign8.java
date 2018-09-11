/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/9/10
 */

package set16;
import java.util.*;
public class Assign8 {

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

		int count_zero=0;
		int count_non_zero=0;

		System.out.println("Elements of matrix are");
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
				System.out.print(" "+mat[i][j]);
			System.out.println();
		}

		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
				if(mat[i][j]==0)
					count_zero++;
				else
					count_non_zero++;
			}
		}

		if(count_zero > count_non_zero)
			System.out.println("It's a sparse matrix");
		else
			System.out.println("It's not a sparse matrix");
    }

}