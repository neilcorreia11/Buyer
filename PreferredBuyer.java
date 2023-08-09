/**
 * Preferred buyer class.
 * 
 * Project 9
 * @author Neil Correia
 * Version 4/26/2023
 */


public class PreferredBuyer extends Buyer {
    /**
     * Constructor of class.
     * @param acctNumberIn str
     * @param nameIn str
     */
   public PreferredBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Preferred Buyer";
   }
    /**
     * Calculates award points.
     * @return award points
     */
   public int calcAwardPoints() {
      double awardpts1 = super.calcSubtotal();
      int awardpts2 = (int) awardpts1;
      return awardpts2;
   
   }
   



}