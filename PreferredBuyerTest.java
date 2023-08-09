import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
 * Tests PreferredBuyer class.
 * 
 * Project 9
 * @author Neil Correia
 * Version 4/26/2023
 */
public class PreferredBuyerTest {
   /**
    * calcAwardPoints test.
    */
   @Test public void calcAwardPoints() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      double[] final1 = {12.0, 67.0};
      pb.setPurchases(final1);
      int final2 = pb.calcAwardPoints();
      Assert.assertEquals(79, final2);
   }


   
}
