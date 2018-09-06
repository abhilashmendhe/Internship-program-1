/**
 * @(#)Assign5.java
 *
 *
 * @author
 * @version 1.00 2018/9/4
 */

package set15;
import java.util.*;
public class Assign5 {

    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array n: ");int n = sc.nextInt();
		int a[] = new int[n];

		int rear = n-1, front = n;
		int cont=1;
		do
		{
		System.out.println("Menu: ");
		System.out.println("1) Insert");
		System.out.println("2) Remove");
		System.out.println("3) Display");
		System.out.print("Enter choice: ");int ch = sc.nextInt();
		switch(ch){

			case 1:
			{
				if(rear<0)
					System.out.println("\nQueue is full");
				else
				{
					System.out.print("\nInsert Element: "); int element = sc.nextInt();
					a[rear--] = element;
				}
				break;
			}

			case 2:
			{
				if(rear==n)
					System.out.println("Queue is empy");
				else
				{
				rear++;
				System.out.println("\nElement removed is "+a[front-1]);
					for(int i=front-1; i>rear; i--)
					{
						a[i] = a[i-1];
					}
				}
				break;
			}
			case 3:
			{
				for(int i=rear+1; i<front; i++)
				{
					System.out.print(" "+a[i]);
				}
				break;
			}
		}
		System.out.println("\nEnter 0 to stop or 1 to continue");
		cont = sc.nextInt();
		}while(cont==1);
    }

}