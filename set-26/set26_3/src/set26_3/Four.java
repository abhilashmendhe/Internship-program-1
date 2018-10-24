/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_3;

/**
 *
 * @author abhil
 */
public class Four extends Two{
    
    public void getPosition()
    {
        if(retX()>0 && retY()>0)
            System.out.println("Points on first Quadrant");
        else if(retX()<0 && retY()>0)
            System.out.println("Points on second Quadrant");
        else if(retX()<0 && retY()<0)
            System.out.println("Points on third Quadrant");
        else if(retX()>0 && retY()<0)
            System.out.println("Points on fourth Quadrant");
        else if(retX()>0 && retY()==0)
            System.out.println("X +ve with y equal to zero");
        else if(retX()<0 && retY()==0)
            System.out.println("X -ve with y equal to zero");
        else if(retX()==0 && retY()>0)
            System.out.println("Y +ve with x equal to zero");
        else if(retX()==0 && retY()<0)
            System.out.println("y +ve with x equal to zero");
        else
            System.out.println("On origin");
    }
}
