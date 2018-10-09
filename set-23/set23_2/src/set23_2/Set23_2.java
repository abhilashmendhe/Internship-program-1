/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set23_2;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set23_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Student a[] = new Student[3];
        
        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter name of "+(i+1)+" student");
            String n = sc.next();
            System.out.println("Enter Marks");
            double m = sc.nextDouble();
            System.out.println("Enter roll no.");
            int r = sc.nextInt();
            a[i] = new Student();
            a[i].getData(n, m, r);
        }
        
        Sorter s = new Sorter();
        s.getSort(a);
        Display d = new Display();
        d.Print(a);
    }
    
}
