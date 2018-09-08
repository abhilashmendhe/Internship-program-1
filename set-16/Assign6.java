/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/9/7
 */

package set16;
import java.util.*;
public class Assign6 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row size of matrix: ");int r = sc.nextInt();
    	System.out.print("Enter col size of matrix: ");int c = sc.nextInt();

		int mat[][] = new int[r][c];
		boolean f = true;
    	if(r==c)
    	{

			System.out.println("Insert Elements in matrix");
    		for(int i=0; i<mat.length; i++)
    		{
    			for(int j=0; j<mat[0].length; j++)
    				mat[i][j] = sc.nextInt();
    		}

    		for(int i=0; i<mat.length; i++)
    		{
    			for(int j=0; j<mat[0].length; j++)
    			if((i!=j) && mat[i][j]!=mat[j][i])
    			{
    				f=false;
    				break;
    			}
    		}
    	}
    	if(f)

    		System.out.println("Is Symmetric");
    	else
    		System.out.println("Cannot form symmetric!!!!");

    	for(int i=0; i<mat.length; i++)
    		{
    			for(int j=0; j<mat[0].length; j++)
    				System.out.print(" "+mat[i][j]);

    				System.out.println();
    		}
    }

}