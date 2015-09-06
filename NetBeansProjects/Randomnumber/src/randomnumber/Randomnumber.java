package randomnumber;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Randomnumber {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			
		
		
		Random rand = new Random();
				
		Scanner input = new Scanner (System.in);
						
		int numbertoGuess=rand.nextInt(10);
		int numberofTries;
		//numberofTries;
		int guess = 0;
		boolean win = false;
		//while (win == false) {
				
		
	JFrame frame = new JFrame("Per Scholas E.Hernandez:Programming Class");
				    
	    //Jframe controls the banner of the out screen
	    int codeinput = Integer.parseInt(JOptionPane.showInputDialog(
	            frame, 
	            "Enter the Password to continue", 
	            "Per Scholas E.Hernandez:Programming Class", 
	            JOptionPane.WARNING_MESSAGE));
	    //Password is 1234
				    
	 if (codeinput==1234)  {
             
              JOptionPane.showMessageDialog(null,"Welcome!! Would you like to Play a Game");
				  String name = JOptionPane.showInputDialog(null, "What is your name?");
				     
	for(int i = 0; i < 3; i++ )
        {			    
       System.out.println(numbertoGuess);
     int userInput = Integer.parseInt(JOptionPane.showInputDialog("I am thinking of a number"
             + " from 1 to 10, you must guess what it is in 3 tries!"));
		
				   
		if (userInput == numbertoGuess) {
		win = true;
		JOptionPane.showMessageDialog(null,"You a Winner!!");
		}
		else if((userInput+4==numbertoGuess)||(userInput-4==numbertoGuess))
		
		{JOptionPane.showMessageDialog(null,"Your getting Colder!!");
		}
		
                else if((userInput+2==numbertoGuess)||(userInput-2==numbertoGuess))
		
		{JOptionPane.showMessageDialog(null,"Your getting Warmer!!");
		}
                
                else if ((userInput+1==numbertoGuess)||(userInput-1==numbertoGuess))
			
		{JOptionPane.showMessageDialog(null,"your getting hotter!!");
		   }
				      
				//if (userInput >i,1++)     
		 
			{JOptionPane.showMessageDialog(null,"Try Again"  );	
                        }   
			
                                      
      
	        	  }
	             
                           {JOptionPane.showMessageDialog(null,name.toUpperCase() + ": "+" "+"YOU GUESSED 3 TIMES, YOU LOSS"  );	      
                                      
                                      }	          
			}
			
                        }   
		
		}
		
		   
		
	
	


	
