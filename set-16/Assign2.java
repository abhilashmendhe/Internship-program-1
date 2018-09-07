/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2018/9/7
 */

package set16;
import java.util.*;
public class Assign2 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);

    	System.out.print("Enter row size: ");int r = sc.nextInt();
    	System.out.print("\nEnter col size: "); int c = sc.nextInt();

    	int mat[][] = new int[r][c];

    	System.out.println("Enter elements in matrix");
    	int sum = 0;
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat[0].length; j++)
    		{
    			mat[i][j] = sc.nextInt();
    			sum += mat[i][j];
    		}
    	}


    	System.out.println("Sum of matrix is "+sum);
    }

}