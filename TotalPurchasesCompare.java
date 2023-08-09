/**
 * Uses compareTo method for total purchases.
 * 
 * Project 10
 * @author Neil Correia
 * Version 4/21/2023
 */
import java.util.Comparator;
/**
 * TotalPurchasesCompare class.
 */
public class TotalPurchasesCompare implements Comparator<Buyer> {
  /**
   * Constructor of the class.
   * @param buyer1 int
   * @param buyer2 int
   * @return int based on comparison
   */
   public int compare(Buyer buyer1, Buyer buyer2) {
   
      if (buyer1.calcTotal() > buyer2.calcTotal()) {
         return -1;
      }
      else if (buyer1.calcTotal() < buyer2.calcTotal()) {
         return 1;
      }
      else {
         return 0;
      }
   }



}