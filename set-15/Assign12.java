/**
 * @(#)Assign12.java
 *
 *
 * @author
 * @version 1.00 2018/9/11
 */

package set15;
import java.util.*;
public class Assign12 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter size of an array: ");int n = sc.nextInt();

    	int arr[] = new int[n];
    	System.out.println("Enter elements in array");
    	for(int i=0; i<arr.length; i++)
    		arr[i] = sc.nextInt();

    	int c=1;
    	do{
    		System.out.println("Menu:");
    		System.out.println("1) Rotation of elements from end");
    		System.out.println("2) Display");
    		System.out.print("\nEnter choice: ");
    		int ch = sc.nextInt();
    		switch(ch){
    			case 1:
    			{
    				System.out.print("Enter number of elements to rotate: ");
    				int num = sc.nextInt();

    				for(int i=0; i<num; i++)
    				{
    					int temp = arr[arr.length-1];

    					for(int j=arr.length-1; j>0; j--)
    					{
    						arr[j] = arr[j-1];
    					}
    					arr[0] = temp;
    				}
    				break;
    			}
    			case 2:
    			{
    				for(int i=0; i<arr.length; i++)
    					System.out.print(" "+arr[i]);
    				break;
    			}
    			default:
    			{
    				System.out.println("Invalid choice");
    				break;
    			}
    		}

    		System.out.println("\nIf want to continue : 1 or stop : 0");
    		c = sc.nextInt();
    	}while(c==1);
    }

}