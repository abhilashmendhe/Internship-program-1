/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/9/20
 */

package set19;
import java.util.*;
public class Assign8 {

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

		if(r==c)
		{

    	int arr[] = getPrincipal(mat);

    	System.out.println("Elements are");
    	for(int i=0; i<arr.length; i++)
    		System.out.print(" "+arr[i]);
		}
		else
			System.out.println("Please make col and row equal");
    }

    static int[] getPrincipal(int mat[][])
    {
    	int a[] = new int[mat.length];

    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    		{
    			if(i==j)
    				a[i] = mat[i][j];
    		}
    	}

    	return a;
    }

}