package quadradicvariablex;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.*;



public class QuadradicNoVariable {
	
	private static final Component Frame = null;

	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   
	    double x = 0;
	    double answer = 0;
	   
	    JFrame frame = new JFrame("Per Scholas  E.Hernandez:Programming Class");
	    //Jframe controls the banner of the out screen
	    int codeinput = Integer.parseInt(JOptionPane.showInputDialog(
	            frame, 
	            "Enter the Password to continue", 
	            "Per Scholas E.Hernandez:Programming Class", 
	            JOptionPane.WARNING_MESSAGE));
	    //Password is 1234,
            
            
            if (codeinput==1234) {
	    	
	    JOptionPane.showMessageDialog(null," Welcome !!! " + "Lets Calculate the Value Quadradic Equation");
	    JOptionPane.showMessageDialog(null," The Quadradic Equation: 3x2 -8x + 4");
	    String name = JOptionPane.showInputDialog(frame, "What is your name?");
		   //the string name will connect the input of the user to name
		   
		    int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the Value of X: "));
		    
		    //formula for quad equation
	          answer = (3 * (userInput * userInput) - (8 * userInput) + 4);
		
	          JOptionPane.showMessageDialog(frame,name.toUpperCase() + ": " +"Please Note that"
                 + " " +"At the Value of" + " "+ userInput +", " + "The Resulting Value is" + " " + answer );
	    }
	     
            //if the password is not entered correctly-the following code takes over
            if (codeinput!=1234){
	       
     JOptionPane.showMessageDialog(null," You Entered the Wrong Password" +  "  "
             +"Review the Hint before using again ");
	        	  System.exit(0);}
	
	
}

}
	

	      
	


	
