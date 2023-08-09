/**
 * PremierEliteBuyer clas.
 * 
 * Project 9
 * @author Neil Correia
 * Version 4/26/2023
 */
public class PremierEliteBuyer extends EliteBuyer {
   private int bonusAwardPoints = 1000;
   /**
    * Constructor of class.
    * @param acctNumberIn str
    * @param nameIn str
    */
   public PremierEliteBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Premier Elite Buyer";
      discountrate = 0.15;
   }
   /**
    * Sets bonusAwardPoints.
    * @param pointsIn int
    */
   protected void setBonusAwardPoints(int pointsIn) {
      bonusAwardPoints = pointsIn;
   }
    /**
     * Gets bonus award points.
     * @return bonus award points
     */
   protected int getBonusAwardPoints() {
      return bonusAwardPoints;
   }
   /**
    * Calculates award points.
    * @return award points.
    */
   public int calcAwardPoints() {
      int points = (int) calcSubtotal();
      points = points * 20;
      if (calcSubtotal() > 500) {
         points += bonusAwardPoints;
         return points;
      }
      else {
         return points;
      }      
   }
   /**
    * toString of class.
    * @return toString
    */
   public String toString() {
      String output = "\n(includes " + bonusAwardPoints 
         + " bonus points added to Award Points)";
      if (calcSubtotal() > 500) {
         return super.toString() + output;
      }
      else {
         return super.toString();
      }
   }



}