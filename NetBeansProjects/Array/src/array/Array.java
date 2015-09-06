package array;

import java.util.stream.IntStream;
import javax.swing.JOptionPane;

/**
 *
 * @author binsina
 */
public class Array {

     
    public static void main(String[] args) {
      
       
        int[] val = {0,1,2,3};
        int sum = IntStream.of(val).sum();
        
      //  The Arrays class provides a Stream Method: "IntStream.of(name).sum()" 
       // which returns a sequential IntStream with the specified int array.
        
JOptionPane.showMessageDialog(null,"The sum of all numbers= " + sum);
System.exit(0);    
    }
  
    }
    

