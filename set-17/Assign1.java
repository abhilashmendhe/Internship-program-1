/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/9/10
 */

package set17;
import java.util.*;
public class Assign1 {

    public static void main(String args[])
    {

    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row size of matrix: ");int r = sc.nextInt();
    	System.out.print("Enter col size of matrix: ");int c = sc.nextInt();

    	int mat[][] = new int[r][c];

    	System.out.println("Enter elements in matrix: ");

    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			mat[i][j] = sc.nextInt();
    	}

		System.out.println("Elements before interchangement of column");
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			System.out.print(" "+mat[i][j]);

    			System.out.println();
    	}

    	System.out.println("Enter column to interchage with another column: "); int c1 = sc.nextInt();
    	System.out.println("Enter another column to interchage with previous column: "); int c2 = sc.nextInt();

		if(c1<=c && c2<=c)
		{
			for(int i=0; i<mat.length; i++)
			{
				int tmp = mat[i][c1-1];
				mat[i][c1-1] = mat[i][c2-1];
				mat[i][c2-1] = tmp;
			}

			System.out.println("Matrix after interchage of column");
			for(int i=0; i<mat.length; i++)
			{
				for(int j=0; j<mat[0].length; j++)
					System.out.print(" "+mat[i][j]);

					System.out.println();
			}
		}
		else
			System.out.println("Enter valid column to interchange!!!");

    }

}