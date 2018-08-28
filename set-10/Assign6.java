/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/8/20
 */

package set10;
public class Assign6 {

    public static void main(String args[])
    {
    	int b=-1;
		for(int i=1; i<=5; i++)
		{	int a=i;
			int x=i+b;
			for(int j=1; j<=5-i; j++)
			{
				System.out.print(" ");
			}

			for(int k=1; k<=i; k++)
			{
				System.out.print(a++);
			}

			for(int l=2; l<=i; l++)
			{
				System.out.print(x--);
			}
			b=b+1;
			System.out.println();
		}
    }


}