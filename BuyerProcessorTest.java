import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

public class BuyerProcessorTest {
   @Test public void constructorTest() {
      BuyerProcessor buyerprocessor = new BuyerProcessor();
   }
   
   @Test public void arrayTest() {
      BuyerProcessor buyerprocessor = new BuyerProcessor();
      Buyer pb = new PreferredBuyer("10002", "Matt");
      buyerprocessor.addBuyer(pb);
      buyerprocessor.addInvalidBuyerRecord("Sammy");
      buyerprocessor.getBuyerArray();
      buyerprocessor.getInvalidRecordsArray();
      
   }

   @Test public void fileTest() {
      BuyerProcessor inFile = new BuyerProcessor();
      String[] argsInMethod = {"Buyer_data_1.txt"};
      String[] argsInMethod2 = {};
      try {
         inFile.readBuyerFile("Buyer_data_1.txt");
         BuyerPart2App.main(argsInMethod);
         BuyerPart2App.main(argsInMethod2);
      } catch (FileNotFoundException fnfe) {
      
      }
      Assert.assertTrue(inFile.generateReport().contains(
         "Buyer Report\n"));
      Assert.assertTrue(inFile.generateReportByName().contains(
         "(by Name)\n"));
      Assert.assertTrue(inFile.generateReportByTotalPurchases().contains(
         "(byTotalPurchases)\n"));
   }
   
}
