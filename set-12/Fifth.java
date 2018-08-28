/**
 * @(#)Fifth.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
public class Fifth {

    public static void main(String args[])
    {
    	int n=9;
    	int rev=0;
		int s=0;
    	while(n>0)
    	{
    		int r=n%2;
			if(r==1){
				rev = rev + (int)Math.pow(10,s) * r;
			}
			s=s+1;
    		n=n/2;
    	}

    	System.out.println(rev);
    }


}