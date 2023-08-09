/**
 * Program that creates an EliteBuyer class.
 * 
 * Project 9
 * @author Neil Correia
 * Version 4/26/2023
 */ 
public class EliteBuyer extends Buyer {
   protected double discountrate = 0.05;
    /**
     * Constructor of the class.
     * @param acctNumberIn str
     * @param nameIn str
     */
   public EliteBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Elite Buyer";
   }
    /**
     * Sets discount rate.
     * @param rateIn double
     */
   public void setDiscountRate(double rateIn) {
      discountrate = rateIn;
   }
   /**
    * Gets discount rate.
    * @return discount rate. 
    */
   public double getDiscountRate() {
      return discountrate;
   }
   /**
    * Calculates award points.
    * @return award points
    */
   public int calcAwardPoints() {
      int points = (int) calcSubtotal();
      points = points * 10;
      return points;
   }
   /**
    * Calculates subtotal including discount rate.
    * @return subtotal including discount rate.
    */
   public double calcSubtotal() {
      double total = 0;
      total = super.calcSubtotal() * (1.0 - discountrate);
      return total;
   }
   /**
    * toString including discount rate.
    * @return toString including discount rate
    */
   public String toString() { 
      return super.toString() + "\n(includes " + discountrate 
         + " discount rate applied to Subtotal)";
   }
   
}