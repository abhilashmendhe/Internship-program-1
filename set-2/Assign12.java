/**
 * @(#)Assign12.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set2;
public class Assign12 {

    public static void main(String args[]){

    	double a=10,b=12;
    	double x=4,y=5;
    	double compute1 = Math.sin(a) + Math.cos(b);
    	double d = 1/5;
    	double compute2 = Math.pow((x+y),d);

    	double ans = compute1 / compute2;

    	System.out.println("Anwer is "+ans);
    }


}