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
		int i=2;
		int num = 10;
		int n = 30;
		int s = 0;
		while(num>=1){
		boolean f=true;
		while(i<n)
		{
			if(n%i==0){
				f=false;
				break;
			}
		}
		if(f)
		{
			System.out.println(i);
		}
		num--;
		}
    }
}