/**
 * Reads and adds to files and reports.
 * 
 * Project 10
 * @author Neil Correia
 * Version 4/21/2023
 */
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.File;
/**
 * BuyerProcessor class.
 */
public class BuyerProcessor {
   private Buyer[] elem;
   private String[] invalidElem;
   /**
    * Constructor of method.
    */
   public BuyerProcessor() {
      elem = new Buyer[0];
      invalidElem = new String[0];
   }
   /** 
    * Gets buyer array.
    * @return buyer array.
    */
   public Buyer[] getBuyerArray() {
      return elem;
   }
   /**
    * Gets invalid records array.
    * @return invalid records array.
    */
   public String[] getInvalidRecordsArray() {
      return invalidElem;
   }
   /**
    * Adds buyer.
    * @param addBuy str
    */
   public void addBuyer(Buyer addBuy) {
      elem = Arrays.copyOf(elem, elem.length + 1);
      elem[elem.length - 1] = addBuy;
   }
   /**
    * Adds invalid record.
    * @param addInvalid str
    */
   public void addInvalidRecord(String addInvalid) {
      invalidElem = Arrays.copyOf(invalidElem, invalidElem.length + 1);
      invalidElem[invalidElem.length - 1] = addInvalid;
   }
   /**
    * Reads Buyer file.
    * @param buyerFile str
    * @throws FileNotFoundException not found
    */
   public void readBuyerFile(String buyerFile) throws FileNotFoundException {
      Scanner scan = new Scanner(new File(buyerFile));
      Buyer addBuy;
   
   
      while (scan.hasNextLine()) {
         String l = scan.nextLine(); 
         Scanner result = new Scanner(l);
         result.useDelimiter(" ");
         int category = Integer.parseInt(result.next());
         String accountNumber = result.next();
         String lastName = result.next();
         String firstName = result.next();
         String fullName = lastName + ", " + firstName;
         double[] purchases = new double[0];
         try {
            while (result.hasNext()) {
               purchases = Arrays.copyOf(purchases, purchases.length + 1);
               double resultt = Double.parseDouble(result.next());
               
               purchases[purchases.length - 1] = resultt;
            }
            if (category == 1) {
               addBuy = new PreferredBuyer(accountNumber, fullName);
            }
            else if (category == 2) {
               addBuy = new EliteBuyer(accountNumber, fullName);
            } 
            else if (category == 3) {
               addBuy = new PremierEliteBuyer(accountNumber, fullName);
            }
            else {
               throw new InvalidCategoryException(Integer.toString(category));
            }
            
         }
         catch (InvalidCategoryException e) {
            String e2 = "*** " + e + " in:\n" + l;
            addInvalidRecord(e2);
            continue;
         }
         catch (NumberFormatException e) {
            String e2 = "*** " + e + " in:\n" + l;
            addInvalidRecord(e2);
            continue;
         }
         addBuy.addPurchases(purchases);
         addBuyer(addBuy);
         result.close();
      }
      scan.close();
      
   }
   /**
    * Generates report.
    * @return report
    */
   public String generateReport() {
      String report = "----------------------------\n"
         + "Buyer Report\n"
         + "----------------------------\n";
      for (Buyer b: elem) {
         report = report + b.toString() + "\n\n";
      }
      return report;
   }
   /**
    * Generates report by name.
    * @return report
    */
   public String generateReportByName() {
      Arrays.sort(elem);
      String report = "----------------------------\n"
         + "Buyer Report by Name"
         + "----------------------------\n";
      for (Buyer b: elem) {
         report = report + b.toString() + "\n\n";
      }
      return report;
   }
   /**
    * Generates report by total purchases.
    * @return report
    */
   public String generateReportByTotalPurchases() {
      String report = "----------------------------\n"
         + "Buyer Report by Name\n"
         + "----------------------------\n";
      Arrays.sort(elem, new TotalPurchasesCompare());
      for (Buyer b: elem) {
         report = report + b.toString() + "\n\n";
      }
      return report;
   }
   /**
    * Generates invalid records report.
    * @return invalid records report
    */
   public String generateInvalidRecordsReport() {
      String report = "----------------------------\n"
         + "Buyer Report by Name\n"
         + "----------------------------\n";
      for (String stringg: invalidElem) {
         report = report + stringg.toString() + "\n\n";
      }
      return report;
   }

   
   
   
}