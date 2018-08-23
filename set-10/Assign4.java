/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/8/20
 */

package set10;
public class Assign4 {

  public static void main(String args[])
{
	int n=7;
	for (int i = 1; i<=n; i++)
	{
		for (int j = 1; j<=n; j++){

		if(j==i || j==(n-i))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}

	}
	System.out.println();
	}
  }


}