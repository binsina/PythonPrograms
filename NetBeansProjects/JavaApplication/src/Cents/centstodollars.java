
package Cents;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.*;
 
public class centstodollars {


       int dollars;
       int cents;
       String inputNumberString;
       int inputNumber;
       int calculatedAnswer;

       private static final Component Frame = null;

	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   
	   
	   
	    JFrame frame = new JFrame("Per Scholas  E.Hernandez:Programming Class");
	    //Jframe controls the banner of the out screen
	    int codeinput = Integer.parseInt(JOptionPane.showInputDialog(
	            frame, 
	            "Enter the Password to continue (Hint: its 1234)", 
	            "Per Scholas E.Hernandez:Programming Class", 
	            JOptionPane.WARNING_MESSAGE));
            
            JOptionPane.showMessageDialog(null,"Welcome to the Cents to Dollar Converter");
	    String name = JOptionPane.showInputDialog(frame, "What is your name?");
       
       int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the cents Amount: "));
      

       
        int dollars = (userInput / 100);
       int cents = (userInput % 100);
      
        
       JOptionPane.showMessageDialog(null,name + " " + "that Equals:"+ " $"+" " + dollars
               + " " +"Dollars "+ " " + "and" +" " + cents +" "+"Cents");
}
} 
       
       
       
      