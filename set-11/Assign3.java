/**
 * @(#)Assign3.java
 *
 *
 * @author
 * @version 1.00 2018/8/22
 */

package set11;
public class Assign3 {

    public static void main(String args[])
    {
    	int a=0;
    	int n = 10;
		for(int i=1; i<=n; i++)
		{
			for(int k=n; k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i+a; j++)
			{	if(j==1 || j==i+a)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			a +=1;
		}
    }
}