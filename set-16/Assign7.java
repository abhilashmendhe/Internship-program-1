/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/9/7
 */

package set16;
import java.util.*;
public class Assign7 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter row size of array: ");int r = sc.nextInt();
    	System.out.print("Enter col size of array: ");int c = sc.nextInt();

    	int mat[][] = new int[r][c];

    	if(r==c)
    	{

    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			mat[i][j] = sc.nextInt();
    	}

    	boolean f1 = true;
		boolean f2 = false;
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int k=0; k<mat[0].length; k++)
    		{
    			i f((i==k) && (mat[i][k]==1))
    			{
					f2 = true;
					break;
    			}
    		for(int j=0; j<mat[0].length; j++)
    		{
    			if((i!=j)&&(mat[i][j]!=0))
    			{
    				f1=false;
    				break;
    			}
    		}

    		}
    	}

    	if(f1 && f2)
    		System.out.println("Matrix is unit");
		else
			System.out.println("Matrix is not unit");

    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    			System.out.print(mat[i][j]);

    			System.out.println();
    	}
    	}
    	else
    		System.out.print("Rows and colums are not equal!!!");
    }
}