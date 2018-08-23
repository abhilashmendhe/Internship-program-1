/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/8/22
 */

package set11;
public class Assign9 {

    public static void main(String args[])
    {
    	int n = 7;
    	int top = (n/2) + 1;
    	int bottom = n - top;
		int a = 0;
		int z = 2;

    	for(int i = 1; i<=n; i++)
    	{
    		int h=i-1;
    		if(i<=top)
    		{
    			for(int j=1; j<=top-i; j++)
    				System.out.print(" ");
				for(int k=1; k<=i; k++)
					System.out.print(k);
				for(int l=1; l<=i-1; l++)
					System.out.print(h--);
    		}
    		else
    		{
    			for(int m=1; m<i-bottom; m++)
    				System.out.print(" ");
    			for(int o=1; o<=bottom-a; o++)
    				System.out.print(o);
    			for(int p=2; p>=bottom-z; p--)
    			{
    				int g=p;
    				System.out.print((g--)-a);
    			}
    			a = a + 1;
    			z=z-1;
    		}

    		System.out.println();
    	}
    }

}