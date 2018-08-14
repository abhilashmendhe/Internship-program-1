/**
 * @(#)Assign13.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set2;
public class Assign13 {

    public static void main(String args[]){

    	double a=5,b=6,c=1;
    	double sqr = Math.pow(b,2);
    	double compute1 =  Math.sqrt(sqr - (4 * a * c));
    	double compute2 =  (-b) + compute1;
    	double ans =  compute2 / (2 * a);

    	System.out.println("Anwer is "+ans);
     }


}