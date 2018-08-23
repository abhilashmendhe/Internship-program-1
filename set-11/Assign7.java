/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/8/23
 */

package set11;
public class Assign7 {

    public static void main(String args[])
    {

    	for(int i=5; i>=1; i--)
    	{
    		int j;
    		int z=i;
    		for(j=5; j>=i; j--)
    		{
    			System.out.print(j);
    		}
    		for(int k=1; k<=i-1; k++)
    		{
    			System.out.print(" ");
    		}
    		for(int l=1; l<=i-2; l++)
    		{
    			System.out.print(" ");
    		}

    		int x=j;
			if(i==1){
				x+=2;
				for(int o=x; o<=5; o++)
					System.out.print(o);
			}

			else{
    		for(int m=5; m>=i; m--)
    		{
    			System.out.print(z++);
    		}
			}
    		System.out.println();


//	/		int x=j;
	//		if(i==1)
	//			x=x+2
    	}
    }


}