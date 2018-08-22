/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/8/22
 */

package set11;
public class Assign1 {

    public static void main(String args[])
    {
    	int n = 11;
    	int top = (n/2) + 1;
    	int bottom = n - top;
		int a = 0;
    	for(int i = 1; i<=n; i++)
    	{
    		if(i<=top)
    		{
    			for(int j=1; j<=top-i; j++)
    				System.out.print(" ");
				for(int k=1; k<=i; k++)
					System.out.print("*");
				for(int l=2; l<=i; l++)
					System.out.print("*");
    		}
    		else
    		{
    			for(int m=1; m<i-bottom; m++)
    				System.out.print(" ");
    			for(int o=1; o<=bottom-a; o++)
    				System.out.print("*");
    			for(int p=1; p<=bottom-a-1; p++)
    				System.out.print("*");
    			a = a + 1;
    		}

    		System.out.println();
    	}
    }


}