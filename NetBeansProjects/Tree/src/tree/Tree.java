/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.Arrays;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


 /*
 * @author binsina
 */
public class Tree {

  
    public static void main(String[] args) {
   JFrame frame = new JFrame("Per Scholas  E.Hernandez:Programming Class");
   int codeoutput = Integer.parseInt(JOptionPane.showInputDialog(
	            frame, 
	            "Please enter the Length of the Tree you want:", 
	            "Per Scholas E.Hernandez:Programming Class", 
	            JOptionPane.QUESTION_MESSAGE));
   
    {
         int n = codeoutput; 
         int spaces = n-1;
         int ast;                 
         
         
         for(int i = 0; i < n; i++)
         {  
            ast = 2*i+1;
            for(int j = 1; j <= spaces+ast; j++)
            {
                if(j <= spaces)
                    System.out.print(' ');
                else
                    
                System.out.print('*');
            }
             
            System.out.println();
            
            spaces--;
         }
    }
   System.exit(0); }
}
    