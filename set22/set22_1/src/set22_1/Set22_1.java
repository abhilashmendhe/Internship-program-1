

package set22_1;

/**
 *
 * @author abhil
 */
public class Set22_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {    
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Addition add = new Addition();
        
        c1.getData(5, 3);
        c2.getData(3, 1);
        
        Complex c = add.getSum(c1, c2);
       
        System.out.println("Sum is "+c.x+"+i"+c.y);
    }
    
}
