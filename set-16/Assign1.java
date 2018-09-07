/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/9/7
 */

package set16;
import java.util.*;
public class Assign1 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size of matrix: ");int r = sc.nextInt();
		System.out.print("\nEnter col size of matrix: "); int c = sc.nextInt();
		int mat[][] = new int[r][c];

		System.out.println("Enter elements in matrix");

		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
				mat[i][j] = sc.nextInt();
		}

		System.out.println();
    	for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
			 	System.out.print(" "+mat[i][j]);
			}
		System.out.println();
		}

    }

}