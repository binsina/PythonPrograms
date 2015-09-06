package quadradic;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.math.*;
public class Quadradic {
	

	
	  public static void main(String[] args)
	  {
	    Scanner input = new Scanner(System.in);
	    JOptionPane.showMessageDialog(null,"Welcome To the Quadradic Formula");
	    String name = JOptionPane.showInputDialog(null, "What is your name?");
	    JFrame frame = new JFrame("Per Scholas       E.Hernandez:Programming Class");
	      JOptionPane.showMessageDialog(
	            frame, 
	            " Welcome !!! " + "Lets Calculate the Value Quadradic Equation", 
	            "Per Scholas E.Hernandez:Programming Class", 
	            JOptionPane.WARNING_MESSAGE);
	 
	    JOptionPane.showMessageDialog(null," The Quadradic Equation we are using is: 3a2 -8b + C");
	    double a = 0;
	    double b = 0;
	    double c = 0;
	    double answer = 0;
       
	    int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the Value of a: "));
	    int userInput1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the Value of b: "));
	    int userInput2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the Value of c: "));
	    
	    

	    answer = (3 * (Math.pow(userInput,2)) - (8 * userInput1) + userInput2);
	   JOptionPane.showMessageDialog(frame,name.toUpperCase() + ": " + " " +"The Resulting "
                   + "Value to the Equation is"
                   + " " + answer );
	    
	   
	   
	    }
	  }
