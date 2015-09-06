/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderchecker;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author binsina
 */
public class Orderchecker {

    
    public static void main(String[] args) {
       
       

       
       JFrame frame = new JFrame("Per Scholas  E.Hernandez:Programming Class");
	    //Jframe controls the banner of the out screen
	    int codeinput = Integer.parseInt(JOptionPane.showInputDialog(
	            frame, 
	            "Enter the Password to Change the Prices (Hint: its 1234)", 
	            "Per Scholas E.Hernandez:Programming Class", 
	            JOptionPane.QUESTION_MESSAGE));
	    
            if (codeinput==1234) {
                   int boltcp=3,nutscp=2,washercp=5;
                JOptionPane.showMessageDialog(frame,"The Current Prices for the products are:"+"Bolts:"+"$" +
                        boltcp+" "+ "Nuts is:"+" "+"$"+nutscp +" " + "Washers is:"+"$"+washercp ,"Current Prices",JOptionPane.ERROR_MESSAGE);
                
                int boltprice =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the New Price of the bolts : "));
    int nutprice =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the New Price of the Nuts : "));
    int washerprice =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the New Price of the Washers : "));
        
    
           int bolts = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the AMOUNT of "
                   + "bolts you want: "));  
      
           int nuts = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the AMOUNT of "
                   + "nuts you want: "));
       if (nuts != bolts) {
        JOptionPane.showMessageDialog(frame,"Check the Order!! Not enough bolts were purchased","CHECK THE ORDER",JOptionPane.ERROR_MESSAGE);}
                 
           int washer = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the AMOUNT of "
                   + "washer you want: "));
        if ((2*washer)!=bolts) {
        JOptionPane.showMessageDialog(frame,"WARNING: Not enough Washers was purchased","CHECK THE ORDER",JOptionPane.ERROR_MESSAGE);}
    
           
            
int Totalbolts=(bolts*boltprice);
     
      int Totalnuts=(nuts*nutprice);
        
      int Totalwasher=(washer*washerprice);
      
      int TotalPrice=(Totalbolts+Totalnuts+Totalwasher);
    
         
           
      JOptionPane.showMessageDialog(null,"The total Price: "+" $" +TotalPrice);}
            
            
           
                int boltsprice = 0,nutsprice = 0,washerprice = 0;
        int bolts = 0,washer = 0,nuts = 0;
            
        

        //JFrame frame = new JFrame("Per Scholas  E.Hernandez:Programming Class");
        
        if (codeinput !=1234) {
                
                bolts = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Amount of "
                        + "bolts you want: "));  
      
                nuts = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Amount of "
                        + "nuts you want: "));
       if (nuts != bolts) {
                JOptionPane.showMessageDialog(frame,"Check the Order!! Not enough bolts purchased","CHECK THE ORDER",JOptionPane.ERROR_MESSAGE);}

                 
       washer = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Amount of "
                        + "washer you want: "));
        if ((2*washer)!=bolts) {
        JOptionPane.showMessageDialog(frame,"Not enough Washers purchased","CHECK THE ORDER",JOptionPane.ERROR_MESSAGE);}
           
        int boltcp=3,nutscp=2,washercp=5;
            
int Totalbolts=(bolts*boltcp);
       
      int Totalnuts=(nuts*nutscp);
        
      int Totalwasher=(washer*washercp);
      
      int TotalPrice=(Totalbolts+Totalnuts+Totalwasher);
    
         
           
      JOptionPane.showMessageDialog(null,"The total Price: "+" $" +TotalPrice);}
}
    
}  
   
    
    
    
            
            
    


     
      

      
    
    
    
    
    
    
    

