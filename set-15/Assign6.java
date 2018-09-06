/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/9/5
 */

package set15;
import java.util.*;
public class Assign6 {

    public static void main(String args[])
    {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array n: ");int n = sc.nextInt();
		int a[] = new int[n];

		int cont=1;
		int pos=0;
		do
		{
		System.out.println("Menu: ");
		System.out.println("1) PUSH");
		System.out.println("2) POP");
		System.out.println("3) DISPLAY");
		System.out.print("\nEnter choice to perform stack operations: ");int ch = sc.nextInt();
		switch(ch){

			case 1:
			{
				if(pos==n)
					System.out.println("Stack full");

				else
				{
					System.out.println("Enter elements to push");
					int val = sc.nextInt();
					a[pos++] = val;
					System.out.println("Now position after push is "+pos);
				}
				break;
			}

			case 2:
			{
				if(pos==0)
					System.out.println("Stack is Empty!!!!");
				else
				{
					int elem = a[--pos];
					System.out.println("Elements popped is "+elem);
					System.out.println("Now position after pop is "+pos);
				}

				break;
			}

			case 3:
			{
				for(int i=0; i<pos; i++)
				{
					System.out.print(" "+a[i]);
				}
			}
		}
		System.out.println("\nIf you want to still continue enter 1 or 0");
		cont = sc.nextInt();
		}while(cont==1);
    }


}