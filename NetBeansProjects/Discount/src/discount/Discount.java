package discount;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Discount {
	 public static void main (String[] arg) {
		 
		int DiscountPrice;
                int Discount;
		 
		 
		 
		 		 Scanner input = new Scanner (System.in);
         
        JOptionPane.showMessageDialog(null,"Welcome" + " " +"This is the Discount 10% Program");
	
         int userInput = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Purchase Price in Cents: "));
        
	DiscountPrice=(int) ((userInput)-(userInput*0.1));
		Discount=(int) (userInput*0.1);
        
         
         if (userInput >= 1000){
		
                JOptionPane.showMessageDialog(null,"Your Discount is:" + "$"+Discount+ " " + " "+"and"+
                        " " +"Your Total Discounted Purchase Price is:" + "$ " +DiscountPrice );}
              
	
         if
		(userInput <= 999){
		
		JOptionPane.showMessageDialog(null,"Sorry, Your Total Purchase Price has to be more then $10.00 to use the Discount");
        }
}
}  