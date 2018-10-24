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
public class Set26_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grade g = new Grade();
        g.callData(1, 67, "XYZ");
        g.getGrade('A');
        g.printStudentData();
        
        Percentage p = new Percentage();
        p.callData(2, 80, "ABC");
        p.getPercentage(60);
        p.getAvg();
        
        Attendance a = new Attendance();
        a.getAttendenceGrade('B');
        a.callData(3, 50, "wqr");
        a.getSData();
        
    }
    
}
