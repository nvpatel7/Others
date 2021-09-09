/**
* Creates a customer.
* @author Nikhil Patel
* @version 5/9/21
*/
public class Customer extends Person {
   
   /**
   * Constructs a customer.
   * @param firstNameIn first name
   * @param lastNameIn last name
   */
   public Customer(String firstNameIn, String lastNameIn) {
      super(firstNameIn, lastNameIn);
   }
   
   /**
   * Gets the id of the customer.
   * ID is the first letter of the class followed by
   * last name followed by a random 3 digit number.
   * @return the ID of the customer
   */
   public String getID() {
      String id = "Cu" + getLastName();
      id += (int) (Math.random() * (999 - 100) + 100);
      return id;
   }
   
   /**
   * to String method.
   * @return a String output
   */
   public String toString() {
      return super.toString();
   }
}