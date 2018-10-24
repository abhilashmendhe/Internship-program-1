/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_4;

/**
 *
 * @author abhil
 */
public class Grade extends Student {
    
    private char grade;
    
    public void getGrade(char g)
    {
        grade = g;
    }
    
    public void printStudentData()
    {
        
        System.out.println("Name is "+retName());
        System.out.println("Roll no. is "+retRoll());
        System.out.println("Percentage is "+retPercentage());
        System.out.println("Grade is "+grade);
        System.out.println("-------------------------------------------");
    }
}
