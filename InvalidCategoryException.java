/**
* Class for InvalidCategoryException.
* 
* Project 11
* @author Neil Correia - Comp 1210 - Module 11
* @version 4/29/2023
*/
public class InvalidCategoryException extends Exception {
  /**
   * Constructor of class.
   * @param category String
   */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}