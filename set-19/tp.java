/**
 * @(#)tp.java
 *
 *
 * @author
 * @version 1.00 2018/9/20
 */


public class tp {

 public static void main(String args[])
    {


    	int n = 7;
    	int rev = 0;
    	int i=0;
    	while(n>0)
    	{
    		int r = n % 2;
    		rev = (int)Math.pow(10,i++) * r;
    		n = n / 2;
    	}

    	System.out.println(rev);
    }

}