
import java.io.FileNotFoundException;
/**
* App for Buyer class.
* 
* Project 11
* @author Neil Correia - Comp 1210 - Module 11
* @version 4/29/2023
*/
public class BuyerPart3App {
   /**
    * Buyer App.
    * @param args - not used.
    */
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("File name expected as command line arguement.\n" 	
             + "Program ending.");
         System.exit(0);
      }
      String strFile = args[0];
      BuyerProcessor buyerProcessor = new BuyerProcessor();
      try {
         buyerProcessor.readBuyerFile(strFile);
      }
      catch (FileNotFoundException e) {
         System.out.println("Attempted to read file: " + strFile
            + " (no such file or directory)\n" + "Program ending."); 
      }
      String r = buyerProcessor.generateReport();
      String r2 = buyerProcessor.generateReportByName();
      String r3 = buyerProcessor.generateReportByTotalPurchases();
      String r4 = buyerProcessor.generateInvalidRecordsReport();
      System.out.println(r);
      System.out.println(r2);
      System.out.println(r3);
      System.out.println(r4);
   }	  	
 
 	  	
}