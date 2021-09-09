/**
* Creates an employee.
* @author Nikhil Patel
* @version 5/9/21
*/
public class Employee extends Person {

   /**
   * Constructs an employee.
   * @param firstNameIn first name
   * @param lastNameIn last name
   */
   public Employee(String firstNameIn, String lastNameIn) {
      super(firstNameIn, lastNameIn);
   }   
   
   /**
   * Gets the id of the employee.
   * ID is the first letter of the class followed by
   * last name followed by a random 3 digit number.
   * @return the ID of the employee
   */
   public String getID() {
      String id = "E" + getLastName();
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