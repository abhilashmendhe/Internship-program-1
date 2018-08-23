/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/8/23
 */

package set11;
public class Assign6 {

    public static void main(String args[])
    {
		int space=1;
    	for(int i=1; i<=5; i++)
    	{
    		int j;
    		for(j=5; j>=i; j--)
    		{
    			System.out.print(j);
    		}

			int x=j;
    		if(i==1)
    			x=x+2;
    		else
    			x=x+1;

			if(i!=1){
				for(int t=1; t<=space; t++)
					System.out.print(" ");
				space+=2;
			}


    		for(int m=x; m<=5; m++)
    			System.out.print(m);

    		System.out.println();
    	}
    }

}