/**
* Creates a cashier.
* @author Nikhil Patel
* @version 5/9/21
*/
public class Cashier extends Employee {
   
   /**
   * Constructs a cashier.
   * @param firstNameIn first name
   * @param lastNameIn last name
   */
   public Cashier(String firstNameIn, String lastNameIn) {
      super(firstNameIn, lastNameIn);
   } 
   
   /**
   * Gets the id of the cashier.
   * ID is the first letter of the class followed by
   * last name followed by a random 3 digit number.
   * @return the ID of the cashier
   */
   public String getID() {
      String id = "C" + getLastName();
      id += (int) (Math.random() * (999 - 100) + 100);
      return id;
   }
}