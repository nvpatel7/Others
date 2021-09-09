/**
* Creates an online customer.
* @author Nikhil Patel
* @version 5/9/21
*/
public class OnlineCustomer extends Customer {
   
   /**
   * Constructs an online customer.
   * @param firstNameIn first name
   * @param lastNameIn last name
   */
   public OnlineCustomer(String firstNameIn, String lastNameIn) {
      super(firstNameIn, lastNameIn);
   }
   
   /**
   * Gets the id of the online customer.
   * ID is the first letter of the class followed by
   * last name followed by a random 3 digit number.
   * @return the ID of the online customer
   */
   public String getID() {
      String id = "OC" + getLastName();
      id += (int) (Math.random() * (999 - 100) + 100);
      return id;
   }
}