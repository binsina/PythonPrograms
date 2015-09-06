package payroll;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class Pay
{
		

		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);

				String cleanInputBuffer;
				String employeeName;
				//double hourlyRate;
				//double hoursWorked;
				double sum;
				double tax;
				boolean end = false;

				
			
			//System.out.println("Welcome to the Payroll Program!\n");
			
			 JFrame frame = new JFrame("Per Scholas E.Hernandez:Programming Class");
			 JOptionPane.showMessageDialog(
			            frame, 
			            "Welcome to the Payroll Program!", 
			            "Per Scholas E.Hernandez:Programming Class", 
			            JOptionPane.WARNING_MESSAGE);		
                
                               //int hourlyRate = -1;
				//int hoursWorked = -1;
                               // tax = -1;
     String name = JOptionPane.showInputDialog(null, "What is the name of the Employee?");
                      double hourlyRate;
                      double hoursWorked;
     
                      hourlyRate = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive hourly rate: "));
    hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive number of hours worked: "));
                
                
                sum =(hourlyRate * hoursWorked);
	        tax = 0.10 * sum;
                
                
    JOptionPane.showMessageDialog(frame,"The Employee:" +" " +name.toUpperCase() + " " +"was Paid" +"$"+ 
    sum + " " + "and was Taxed" + "$ " +tax,name.toUpperCase()+"PAYMENT HISTORY",JOptionPane.WARNING_MESSAGE);
		//cleanInputBuffer = input.nextLine();
                
                
}               
}