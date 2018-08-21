/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/8/21
 */


public class Assign7 {

	public static void main(String args[])
	{
		int t = 0;
		int a = 4;
		int b = 4;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==5 && j==5)
					break;
				else
				System.out.print(j);
			}
			for(int k=1;k<=8-i-t;k++)
			{
				System.out.print(' ');
			}
			t += 1;
			for(int l=5;l>=i+a;l--)
			{
				System.out.print(l-b);
			}
			a -= 2;
			b -= 1;
			System.out.println();
		}
	}

}