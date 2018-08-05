/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/8/3
 */

package set1;
public class Assign10 {

    public static void main(String args[]){
    		int millimeter = 1000;
    		double meter = (double) millimeter / 1000;
    		double feets = (double) millimeter / 300;
    		double inches = (double) millimeter / 25;
    		double centimeter = (double) millimeter / 100;

    		System.out.println("millimeter to meter is "+ meter);
    		System.out.println("millimeter to feets is "+ feets);
    		System.out.println("millimeter to inches is "+ inches);
    		System.out.println("millimeter to centimeter is "+ centimeter);

    	//	System.out.println("Meter --- Feets --- Inches --- Centimeter");
    	//	System.out.println((int)meter+" --- "+(int)(millimeter % 1000)/300+" --- "+(int)((millimeter % 1000)%300)/25+" --- "+centimeter);
    	}

}