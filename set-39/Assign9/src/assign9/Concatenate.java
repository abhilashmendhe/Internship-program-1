/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign9;

/**
 *
 * @author abhilash
 */
public class Concatenate extends Thread{
    
    public void run()
    {
        //System.out.println(con);
       
        while(true)
        {
            
            {   
                try {
                    if(!Frame.jTextField1.getText().isEmpty())
                    {
                    Thread.sleep(3000);
                    String a = Frame.jTextField1.getText();
                    String b = Frame.jTextArea1.getText();
                    String con = b+a+"\n";
                    Frame.jTextArea1.setText(con);
                    Frame.jTextField1.setText(null);
                    }
                    
            } catch (Exception e) {
                
                    System.out.println("Error in class Concatenate.java");
            }
                
                    
                 
            }
       
        }
        
        
    }
}
