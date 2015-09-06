package payroll;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class Payroll
{
		

public static void main(String args[])
		{
                    Scanner input = new Scanner(System.in);

				String cleanInputBuffer;
				String employeeName;
				double hourlyRate;
				double hoursWorked;
				double sum=0;
				double tax;
				boolean end = false;

				
			
System.out.println("Welcome to the Payroll Program!\n");
			
 JFrame frame = new JFrame("Per Scholas E.Hernandez:Programming Class");
JOptionPane.showMessageDialog(
 frame,"Welcome to the Payroll Program!","Per Scholas E.Hernandez:Programming Class", 
        JOptionPane.WARNING_MESSAGE);			 
                         {	
				hourlyRate = -1;
				hoursWorked = -1;
                                tax = -1;
                               
       System.out.println("Enter Name of Employee(enter 'stop' to exit program): ");
		employeeName = input.nextLine();
                
					    
         cleanInputBuffer = input.nextLine();
                     
       if ("stop".equals(employeeName)) 
	end = true;
                    	 
	System.out.println("Enter a positive hourly rate:");
	hourlyRate = input.nextDouble();
                    
System.out.println("Enter a positive hours worked:");
   hoursWorked = input.nextDouble();
			
   while (hoursWorked < 0)
				{
					
				}
				
sum =(hourlyRate * hoursWorked);
tax = 0.10 * sum;
				
System.out.println("The Employee:" +" " +employeeName.toUpperCase() 
        + " " +"was Paid" +" " + sum + " " + "and was Taxed" + " " +tax);
				//final print of taxs paid and total wages
			

			}

		}
}
	

