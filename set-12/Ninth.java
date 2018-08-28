/**
 * @(#)Ninth.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
public class Ninth {

    public static void main(String args[])
    {
    	int count=0;
    	int num=10;
    	int i=1;
    	while(count<=num)
    	{
    		boolean f=true;
    		for(int j=2; j<i; j++ )
    		{
    			if(i%j==0)
    			{
    				f=false;
    				break;
    			}
    		}
    		if(f){
    			count++;
    			System.out.print(" "+i);
    		}
    		i++;
    	}
    }
}