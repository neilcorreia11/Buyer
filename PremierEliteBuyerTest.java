import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
 * PremierEliteBuyer class test.
 * 
 * Project 9
 * @author Neil Correia
 * Version 4/26/2023
 */
public class PremierEliteBuyerTest {
    /**
     * Tests getAcctNumber.
     */
   @Test public void getAcctNumberTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("12345", "Name");
      Assert.assertEquals("12345", peb.getAcctNumber());
   }
   /**
    * Tests setAcctNumber.
    */
   @Test public void setAcctNumberTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("12345", "Name");
      peb.setAcctNumber("3");
      Assert.assertEquals("3", peb.getAcctNumber());
   }
   /**
    * Tests getName.
    */
   @Test public void getNameTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("12345", "Name");
      Assert.assertEquals("Name", peb.getName());
   }
   /**
    * Tests setName.
    */
   @Test public void setNameTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("12345", "Name");
      peb.setName("John");
      Assert.assertEquals("John", peb.getName());
   }
   /**
    * Tests getCategory.
    */
   @Test public void getCategoryTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("12345", "Name");
      Assert.assertEquals("Premier Elite Buyer", peb.getCategory());
   }
   /**
    * Tests getPurchases.
    */
   @Test public void getPurchasesTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("12345", "Name");
      double[] purchases = {1, 2, 3, 4};
      peb.addPurchases(purchases);
      Assert.assertArrayEquals(purchases, peb.getPurchases(), 0.01);
   }
   /**
    * Tests setPurchases.
    */
   @Test public void setPurchasesTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("12345", "Name");
      double[] purchases;
      purchases = new double[1];
      peb.setPurchases(purchases);
      Assert.assertEquals(purchases, peb.getPurchases());
   }
   /**
    * Tests addPurchases.
    */
   @Test public void addPurchasesTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("12345", "Name");
      double[] purchases = {1, 2, 3, 4};
      peb.addPurchases(purchases);
      Assert.assertArrayEquals(purchases, peb.getPurchases(), 0.01);
   }
   /**
    * Tests deletePurchases.
    */
   @Test public void deletePurchasesTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("12345", "Name");
      double[] purchases = {1, 2, 3, 4};
      double[] purchasesIn = {1, 2};
      peb.addPurchases(purchases);
      peb.deletePurchases(purchasesIn);
      double[] result = {3, 4};
      Assert.assertArrayEquals(result, peb.getPurchases(), 0.01);
   }
   /**
    * Tests calcTotal.
    */
   @Test public void calcTotal() {
      PremierEliteBuyer peb = new PremierEliteBuyer("10003", "King, Kelly");
      peb.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(457.164, peb.calcTotal(), 0.01);
   
   }
   /**
    * Tests calcTotal2.
    */
   @Test public void calcTotal2() {
      PremierEliteBuyer peb2 = new 
            PremierEliteBuyer("10004", "Jenkins, Jordan");
      peb2.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      Assert.assertEquals(548.964, peb2.calcTotal(), 0.01);
   
   }
   /**
    * Tests calcSubtotal.
    */
   @Test public void calcSubtotal() {
      PremierEliteBuyer peb = new PremierEliteBuyer("10003", "King, Kelly");
      peb.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(423.3, peb.calcSubtotal(), 0.01);
   }

   /**
    * Tests calcSubtotal2.
    */
   @Test public void calcSubtotal2() {
      PremierEliteBuyer peb2 = new 
            PremierEliteBuyer("10004", "Jenkins, Jordan");
      peb2.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      Assert.assertEquals(508.3, peb2.calcSubtotal(), 0.01);
   }

   /**
    * Tests calcAwardPoints.
    */
   @Test public void calcAwardPoints() {
      PremierEliteBuyer peb = new PremierEliteBuyer("10003", "King, Kelly");
      peb.addPurchases(34.5, 100.0, 63.50, 300.0);
      int awardpts = peb.calcAwardPoints();
      Assert.assertEquals(8460, awardpts); 
   }
   /**
    * Tests calcAwardPoints2.
    */
   @Test public void calcAwardPoints2() {
      PremierEliteBuyer peb2 = new 
            PremierEliteBuyer("10004", "Jenkins, Jordan");
      peb2.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      int awardpts2 = peb2.calcAwardPoints();
      Assert.assertEquals(11160, awardpts2); 
   }
   /**   
    * Tests bonusAwardPoints.
    */
   @Test public void bonusAwardPointsTest() {
      PremierEliteBuyer peb = new PremierEliteBuyer("10004", "Jenkins, Jordan");
      Assert.assertEquals("bonus test", 1000, peb.getBonusAwardPoints());
   }
   
   




   
}
