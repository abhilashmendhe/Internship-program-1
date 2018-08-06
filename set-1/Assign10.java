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
    		int millimeter = 20;
    		/*double meter = (double) millimeter / 1000;
    		double feets = (double) millimeter / 300;
    		double inches = (double) millimeter / 25;
    		double centimeter = (double) millimeter / 100;

    		System.out.println("millimeter to meter is "+ meter);
    		System.out.println("millimeter to feets is "+ feets);
    		System.out.println("millimeter to inches is "+ inches);
    		System.out.println("millimeter to centimeter is "+ centimeter);

    		System.out.println("Meter --- Feets --- Inches --- Centimeter");
    		System.out.println((int)meter+" --- "+(int)(millimeter % 1000)/300+" --- "+(int)((millimeter % 1000)%300)/25+" --- "+(int)((((millimeter % 1000)%300)%25)/10));
    	*/
    int	meter = millimeter / 1000;
    int	r1 = millimeter % 1000;
     int 	feets =  r1 / 300;
      int	r2 = r1 % 300;
  		int inches = r2 / 25;
  		int r3 = r2 %  25;
    	int centimeter = r3 / 10;
    	  		System.out.println("Meter is "+ meter);
    		System.out.println("Feets is "+ feets);
    		System.out.println("Inches is "+ inches);
    		System.out.println("Centimeter is "+ centimeter);
    	}

}