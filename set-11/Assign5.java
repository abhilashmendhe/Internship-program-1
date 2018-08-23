/**
 * @(#)Assign5.java
 *
 *
 * @author
 * @version 1.00 2018/8/23
 */

package set11;
public class Assign5 {

    public static void main(String args[])
    {
    	//int n = 5;
    	int space = 1;
    	for(int i=5; i>=1; i--)
    	{
    		int j;
    		for(j=1; j<=i; j++)
    		{
    			System.out.print(j);
    		}
    		int x=j;
    		if(i==5)
   				x=x-2;
    		else
    			x=x-1;

			if(i!=5)
			{
	    		for(int k=1; k<=space; k++)
        			System.out.print(" ");
    			space += 2;
			}
			for(int l=x; l>=1; l--)
				System.out.print(l);

    		System.out.println();
    	}
    }


}