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
public class Display {
    
    void Print(Student s[])
    {
        for(int i=0; i<s.length; i++)
        {
            System.out.println("Roll no. "+s[i].roll_no);
            System.out.println("Name is "+s[i].name);
            System.out.println("Marks is "+s[i].marks);
        }
    }
}
