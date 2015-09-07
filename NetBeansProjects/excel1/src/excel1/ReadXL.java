package excel1;

import java.io.File;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
/**
 * This is a sample to Read an  Excel Sheet using 
 * Jakarta POI API
 * @author  Elango Sundaram
 * @version 1.0
 */
public class ReadXL {
    /** Location where the Excel has to be read from. Note the forward Slash */
    public static String fileToBeRead="/Users/binsina/Desktop/Read.xls";
    public static void main(String argv[]) throws Exception{       
        
	// Create a work book reference
	HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(fileToBeRead));
	// Refer to the sheet. Put the Name of the sheet to be referred from
	// Alternative you can also refer the sheet by index using getSheetAt(int index)
     HSSFSheet sheet = workbook.getSheet("Perscholas");
	HSSFRow row = sheet.getRow(1);
	// Create a cell ate index zero ( Top Left)
	HSSFCell cell = row.getCell((short)0);
	// Type the content
				            
            
       JFrame frame = new JFrame("Per Scholas  E.Hernandez:Programming Class");
	    //Jframe controls the banner of the out screen
	    int codeinput = Integer.parseInt(JOptionPane.showInputDialog(
	            frame, 
	            "Enter the Password to Change the Prices (Hint: its 1234)", 
	            "Per Scholas E.Hernandez:Programming Class", 
	            JOptionPane.QUESTION_MESSAGE));
	    //if access is granted, then following code takes over
            if (codeinput==1234) {
                
        int boltprice =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Amount you want to add to the price of the Bolts : "));
        int nutprice =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Amount you want to add to the price of the Nuts : "));
        int washerprice =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Amount you want to add to the price of the Washers : "));
//Read the spreadsheet that needs to be updated
        
        
        FileInputStream input_document = new FileInputStream(new File("/Users/binsina/Desktop/Read.xls"));
        //Access the workbook
        HSSFWorkbook my_xls_workbook = new HSSFWorkbook(input_document);
        //Access the worksheet, so that we can update / modify it.
        HSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);
        // declare a Cell object
        //org.apache.poi.ss.usermodel.Cell cell = null;
        // Access the cell first to update the value
        cell = my_worksheet.getRow(1).getCell(0);
        // Get current value and then add 5 to it
        cell.setCellValue(cell.getNumericCellValue() + boltprice);
        //Close the InputStream
        cell = my_worksheet.getRow(1).getCell(1);
        // Get current value and then add 5 to it
        cell.setCellValue(cell.getNumericCellValue() + nutprice);
        cell = my_worksheet.getRow(1).getCell(2);
        // Get current value and then add 5 to it
        cell.setCellValue(cell.getNumericCellValue() + washerprice);
        
        input_document.close();
        //Open FileOutputStream to write updates
        FileOutputStream output_file =new FileOutputStream(new File("/Users/binsina/Desktop/Read.xls"));
        //write changes
        my_xls_workbook.write(output_file);
        //close the stream
        output_file.close();
    
    
           JOptionPane.showInputDialog(null,"Price Update Checker: the boltprice was changed to:" +"$ " + cell.getNumericCellValue());  
    
    int bolts = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the AMOUNT of "
                   + "bolts you want: "));  
      
           int nuts = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the AMOUNT of "
                   + "nuts you want: "));
       if (nuts != bolts) {
        JOptionPane.showMessageDialog(frame,"Check the Order!! Not enough bolts were purchased","CHECK THE ORDER",JOptionPane.ERROR_MESSAGE);}
                 
           int washer = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the AMOUNT of "
                   + "washer you want: "));
        if ((2*washer)!=bolts) {
        JOptionPane.showMessageDialog(frame,"WARNING: Not enough Washers was purchased","CHECK THE ORDER",JOptionPane.ERROR_MESSAGE);}
    
           
            
int Totalbolts=(bolts*boltprice);
     
      int Totalnuts=(nuts*nutprice);
        
      int Totalwasher=(washer*washerprice);
      
      int TotalPrice=(Totalbolts+Totalnuts+Totalwasher);
    
         
           
      JOptionPane.showMessageDialog(null,"The total Price: "+" $" +TotalPrice);}
            
            
           
                int boltsprice = 0,nutsprice = 0,washerprice = 0;
        int bolts = 0,washer = 0,nuts = 0;
            
        

        //if codeinput is not entered correctly, then the following code asks for qty and calculates the total price
        
        if (codeinput !=1234) {
                
                bolts = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Amount of "
                        + "bolts you want: "));  
      
                nuts = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Amount of "
                        + "nuts you want: "));
       if (nuts != bolts) {
                JOptionPane.showMessageDialog(frame,"Check the Order!! Not enough bolts purchased","CHECK THE ORDER",JOptionPane.ERROR_MESSAGE);}

                 
       washer = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Amount of "
                        + "washer you want: "));
        if ((2*washer)!=bolts) {
        JOptionPane.showMessageDialog(frame,"Not enough Washers purchased","CHECK THE ORDER",JOptionPane.ERROR_MESSAGE);}
           
        int boltcp=3,nutscp=2,washercp=5;
            
int Totalbolts=(bolts*boltcp);
       
      int Totalnuts=(nuts*nutscp);
        
      int Totalwasher=(washer*washercp);
      
      int TotalPrice=(Totalbolts+Totalnuts+Totalwasher);
    
         
           
      JOptionPane.showMessageDialog(null,"The total Price: "+" $" +TotalPrice);}
}
    
}
   
    
    
    
    
    
    

        
        
        
     