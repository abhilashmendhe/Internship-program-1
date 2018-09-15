/**
 * @(#)Tenth.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class Tenth {

    public static void main(String args[])
    {
    	int population = 1000;
    	int rate = 10;
    	getYear(population, rate);
    }

    static void getYear(int p, double r)
    {
    	double p1 = p;
    	int year = 0;
    	while(p1<2*p)
    	{
    		p1 += (double)((p1*r)/100);
    		year++;
    	}
    	System.out.println("Years: "+year);
    }
}