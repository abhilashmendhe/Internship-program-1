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
public class Attendance extends Student{

    private char attendenceGrade;
    
    public void getAttendenceGrade(char a)
    {
        attendenceGrade = a;
    }
    
    public void getSData()
    {
        System.out.println("Student name is "+retName());
        System.out.println("Roll no. is "+retRoll());
        System.out.println("Percentage is "+retPercentage());
        System.out.println("Attendence grade is "+attendenceGrade);
        System.out.println("-------------------------------------------");
    }
}
