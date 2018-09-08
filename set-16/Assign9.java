/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/9/8
 */

package set16;
import java.util.*;
public class Assign9 {

    public static void main(String args[])
    {

    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row size of matrix: ");int r = sc.nextInt();
    	System.out.print("Enter col size of matrix: ");int c = sc.nextInt();

    	int mat[][] = new int[r][c];

    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			mat[i][j] = sc.nextInt();
    	}

    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    		{
    			if(i==j)
    			{
    				int tmp = mat[i][j];
    				mat[i][j] = mat[i][mat[0].length-1-i];
    				mat[i][mat[0].length-1-i] = tmp;
    				break;
    			}
    		}
    	}

		System.out.println();
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			System.out.print(" "+mat[i][j]);

    			System.out.println();
    	}
    }
}