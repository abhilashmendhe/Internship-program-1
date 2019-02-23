/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuzzy;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class Fuzzyinit {
    
    
    public void initialize(ArrayList cluster)
    {
        new Classification().getClassify(cluster);
    }
}
