/**
 * @(#)Eight.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
public class Eight {

    public static void main(String args[])
    {
		int p=100;
		int r=5;
		int y=10;

		int count=0;

		while(count<=y)
		{
			int i = (p*r)/100;
			p = p + i;
			System.out.println(p);
			count++;
		}
    }


}