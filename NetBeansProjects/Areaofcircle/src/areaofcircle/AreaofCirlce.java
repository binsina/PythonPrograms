package areaofcircle;



	import java.math.*;
	import java.text.DecimalFormat;
	import java.util.Scanner;
	import javax.swing.JOptionPane;


	public class AreaofCirlce {
		// int number;
		  public static void main (String[] arg) {
		
		 //Scanner scan = new Scanner (System.in);
	   
	         
		  
		    {
		         Scanner input = new Scanner (System.in);
		         
		         JOptionPane.showMessageDialog(null," Welcome !!!" + "Lets Calculate the Area of Circle");
		       
		   double radius = 0,area;
		   int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the Radius: "));
		   //JOptionPane.showInputDialog(null,"Enter Radius:");
		   // radius = input.nextDouble();
		        		    	  	   
		 	   
		 	   
		 	   //System.out.print("Enter the Radius : "); 
		 	    //radius = input.nextDouble();
		 	    
		         
		 	    
		 DecimalFormat format = new DecimalFormat ("0.00");
		     area = (Math.PI *(Math.pow(userInput,2)));
		    
		     JOptionPane.showMessageDialog(null,"The area of a Circle is ==>" + " " + (area));
		    }
		 
	}
}
