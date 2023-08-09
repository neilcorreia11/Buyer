import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
 * EliteBuyer class test.
 * 
 * Project 9
 * @author Neil Correia
 * Version 4/26/2023
 */
public class EliteBuyerTest {
   /**
    * Tests getAcctNumber.
    */
   @Test public void getAcctNumberTest() {
      EliteBuyer elitebuyer = new EliteBuyer("12345", "Name");
      Assert.assertEquals("12345", elitebuyer.getAcctNumber());
   }
   /**
    * Tests setAcctNumber.
    */
   @Test public void setAcctNumberTest() {
      EliteBuyer elitebuyer = new EliteBuyer("12345", "Name");
      elitebuyer.setAcctNumber("3");
      Assert.assertEquals("3", elitebuyer.getAcctNumber());
   }
   /**
    * Tests getName.
    */
   @Test public void getNameTest() {
      EliteBuyer elitebuyer = new EliteBuyer("12345", "Name");
      Assert.assertEquals("Name", elitebuyer.getName());
   }
   /**
    * Tests setName.
    */
   @Test public void setNameTest() {
      EliteBuyer elitebuyer = new EliteBuyer("12345", "Name");
      elitebuyer.setName("John");
      Assert.assertEquals("John", elitebuyer.getName());
   }
   /**
    * Tests getCategory.
    */
   @Test public void getCategoryTest() {
      EliteBuyer elitebuyer = new EliteBuyer("12345", "Name");
      Assert.assertEquals("Elite Buyer", elitebuyer.getCategory());
   }
   /**
    * Tests getPurchases.
    */
   @Test public void getPurchasesTest() {
      EliteBuyer elitebuyer = new EliteBuyer("12345", "Name");
      double[] purchases = {1, 2, 3, 4};
      elitebuyer.addPurchases(purchases);
      Assert.assertArrayEquals(purchases, elitebuyer.getPurchases(), 0.01);
   }
   /**
    * Tests setPurchases.
    */
   @Test public void setPurchasesTest() {
      EliteBuyer elitebuyer = new EliteBuyer("12345", "Name");
      double[] purchases;
      purchases = new double[1];
      elitebuyer.setPurchases(purchases);
      Assert.assertEquals(purchases, elitebuyer.getPurchases());
   }
   /**
    * Tests addPurchases.
    */
   @Test public void addPurchasesTest() {
      EliteBuyer elitebuyer = new EliteBuyer("12345", "Name");
      double[] purchases = {1, 2, 3, 4};
      elitebuyer.addPurchases(purchases);
      Assert.assertArrayEquals(purchases, elitebuyer.getPurchases(), 0.01);
   }
   /**
    * Tests deletePurchases.
    */
   @Test public void deletePurchasesTest() {
      EliteBuyer elitebuyer = new EliteBuyer("12345", "Name");
      double[] purchases = {1, 2, 3, 4};
      double[] purchasesIn = {1, 3};
      elitebuyer.addPurchases(purchases);
      elitebuyer.deletePurchases(purchasesIn);
      double[] result = {2, 4};
      Assert.assertArrayEquals(result, elitebuyer.getPurchases(), 0.01);
   }
   /**
    * Tests calcTotal.
    */
   @Test public void calcTotal() {
      EliteBuyer elitebuyer = new EliteBuyer("10002", "Jones, Pat");
      elitebuyer.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(510.948, elitebuyer.calcTotal(), 0.01);
   
   }
   /**
    * Tests calcSubtotal.
    */
   @Test public void calcSubtotal() {
      EliteBuyer elitebuyer = new EliteBuyer("10002", "Jones, Pat");
      elitebuyer.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(473.10, elitebuyer.calcSubtotal(), 0.01);
   
   }
   /**
    * Tests toString.
    */
   @Test public void toStringTest() {
      EliteBuyer elitebuyer = new EliteBuyer("10002", "Jones, Pat");
      elitebuyer.addPurchases(34.5, 100.0, 63.50, 350.0);
      String output = elitebuyer.toString();
      Assert.assertEquals(true, output.contains("Tax: "));
   
   }
   /**
    * Tests calcAwardPoints.
    */
   @Test public void calcAwardPoints() {
      EliteBuyer elitebuyer = new EliteBuyer("10002", "Jones, Pat");
      elitebuyer.addPurchases(34.5, 100.0, 63.50, 300.0);
      int awardpts = elitebuyer.calcAwardPoints();
      Assert.assertEquals(4730, awardpts); 
   }
   /**
    * Tests discountRate.
    */
   @Test public void discountRateTest() {
      EliteBuyer elitebuyer = new EliteBuyer("10002", "Jones, Jimmy");
      Assert.assertEquals("rate test 1", 0.05,
         elitebuyer.getDiscountRate(), 0.0001);
      elitebuyer.setDiscountRate(0.10);
      Assert.assertEquals("rate test 2", 0.10, 
         elitebuyer.getDiscountRate(), 0.0001);
   
   }



  
}
