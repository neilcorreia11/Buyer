/**
 * Program with methods for Buyer class.
 * 
 * Project 9
 * @author Neil Correia
 * Version 4/26/2023
 */
import java.util.Arrays;
import java.text.DecimalFormat;
/**
 * Implements Comparable Buyer.
 */
public abstract class Buyer implements Comparable<Buyer> {
   protected String category;
   protected String acctNumber;
   protected String name;
   protected double[] purchases;
   /**
    * Sales tax rate.
    * @return sales tax rate
    */
   public static final double SALES_TAX_RATE = 0.08;
   /**
    * Constructor of class.
    * @param acctNumberIn str
    * @param nameIn str
    */
   public Buyer(String acctNumberIn, String nameIn) {
      acctNumber = acctNumberIn;
      name = nameIn;
      purchases = new double[0];
   }
   /**
    * Gets AcctNumber.
    * @return account number
    */
   public String getAcctNumber() {
      return acctNumber;
   }
   /**
    * Sets AcctNumber.
    * @param acctNumberIn str
    */
   public void setAcctNumber(String acctNumberIn) {
      acctNumber = acctNumberIn;
   }
   /**
    * Gets name.
    * @return name
    */
   public String getName() {
      return name;
   }
   /**
    * Sets name.
    * @param nameIn str
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   /**
    * Gets purchases.
    * @return purchases
    */
   public double[] getPurchases() {
      return purchases;
   }
   /**
    * Sets purchases.
    * @param purchasesIn double
    */
   public void setPurchases(double[] purchasesIn) {
      purchases = purchasesIn;
   }
   /**
    * Gets category.
    * @return category
    */
   public String getCategory() {
      return category;
   }
   /**
    * Adds purchases to array.
    * @param purchasesIn double
    */
   public void addPurchases(double... purchasesIn) {
      for (int i = 0; i < purchasesIn.length; i++) {
         purchases = Arrays.copyOf(purchases, purchases.length + 1);
         purchases[purchases.length - 1] = purchasesIn[i];
      } 
   }
   /**
    * Deletes a single purchase.
    * @param deletedPurchases double
    */
   public void deletePurchases(double deletedPurchases) {
      int length1 = purchases.length;
      for (int i = 0; i < 1; i++) {
         if (deletedPurchases == purchases[i]) {
            while (i < length1 - 1) {
               purchases[i] = purchases[i + 1];
               i++;
            }
            purchases[length1 - 1] = 0.0;
            purchases = Arrays.copyOf(purchases, length1 - 1);
         }
      } 
   }
   /**
    * Deleted multiple purchases.
    * @param deletedPurchases double
    */
   public void deletePurchases(double... deletedPurchases) {
      int length1 = purchases.length;
      int length2 = deletedPurchases.length;
      for (int i = 0; i < length1; i++) {
         for (int j = 0; j < length2; j++) {
            deletePurchases(deletedPurchases[j]);
         }
      }
   } 
   
   /**
    * Calculates subtotal.
    * @return subtotal
    */
   public double calcSubtotal() {
      int length1 = purchases.length;
      double subtotal = 0;
      for (int i = 0; i < length1; i++) {
         subtotal += purchases[i];
      }
      return subtotal;
   }
   /**
    * Calculates total.
    * @return total 
    */
   public double calcTotal() {
      return calcSubtotal() + calcSubtotal() * SALES_TAX_RATE;
   }
   /**
    * Calculates tax.
    * @return tax
    */
   /**
    * Returns purchase based on card type.
    * @return calcAwardPoints
    */
   protected abstract int calcAwardPoints();
   /**
    * toString method.
    * @return output of toString
    */
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
      String output = getCategory() + "\n" + "AcctNo/Name: " + acctNumber + " " 
         + name + "\n" + "Subtotal: " + decimalFormat.format(calcSubtotal()) 
         + "\n" + "Tax: " 
         + decimalFormat.format(calcSubtotal() * SALES_TAX_RATE)
         + "\n" + "Total: " 
         + decimalFormat.format(calcTotal()) + "\n" + "Award Points: "
         + calcAwardPoints();
      return output;
   }
   
   public int compareTo(Buyer buyer1) {
      return this.name.compareTo(buyer1.getName());
   }  
   
}