/**
 * @(#)Fifth.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class Fifth {

    public static void main(String args[])
    {
    	int n1 = 1;
    	int n2 = 2;
    	int n3 = 3;
    	int n4 = 4;

    	double mean = getMean(n1,n2,n3,n4);
    	getSD(n1,n2,n3,n4, mean);
    }

    static double getMean(double num1, double num2, double num3, double num4)
    {
    	double sum = num1 + num2 + num3 + num4;

    	double m = (double)(sum / 4);

//    	System.out.println("Mean is "+m);

    	return m;
    }

	static void getSD(int num1, int num2, int num3, int num4,double m)
	{
		double var = (double)(Math.pow(m-num1,2) + Math.pow(m-num2,2) + Math.pow(m-num3,2) + Math.pow(m-num4,2));
		double sd = Math.sqrt(var/4);
		System.out.println("SD is "+sd);
	}
}