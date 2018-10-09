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
public class Sorter {

    Student[] getSort(Student d[])
    {
        for(int i=0; i<d.length; i++)
        {
            for(int j=0; j<d.length-1; j++)
            {
                if(d[j].marks<d[j+1].marks)
                {
                double tmp = d[j].marks; 
                d[j].marks = d[j+1].marks;
                d[j+1].marks = tmp;
                
                String tmpn = d[j].name;
                d[j].name = d[j+1].name;
                d[j+1].name = tmpn;
                
                int tmpr = d[j].roll_no;
                d[j].roll_no = d[j+1].roll_no;
                d[j+1].roll_no = tmpr;
                }
            }
        }
        
        return d;
    }
}
