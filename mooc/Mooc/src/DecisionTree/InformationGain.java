/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionTree;

/**
 *
 * @author abhilash
 */
public class InformationGain {
    
    public double infoG(double pt, double pf)
    {
        
        double ptrue = (pt/(pt+pf)) * (Math.log(pt/(pt+pf))/Math.log(2.0));
        double pfalse = (pf/(pt+pf)) * (Math.log(pf/(pt+pf))/Math.log(2.0));
        double ig = - ptrue - pfalse;
        return ig;
    }
}
