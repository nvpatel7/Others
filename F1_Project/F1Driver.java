/**
* Creates a F1 driver.
* @author Nikhil Patel
* @version 5/9/21
*/
public class F1Driver implements Comparable
   <F1Driver> {
   private String firstName;
   private String lastName;
   private int carNumber;
   private static int count = 0;
   
   /**
   * Constructs an F1 driver.
   * @param firstNameIn first name
   * @param lastNameIn last name
   * @param numIn car number
   */
   public F1Driver(String firstNameIn, String lastNameIn, int numIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      carNumber = numIn;
      count++;
   }
   
   /**
   * Gets first name of Driver.
   * @return first name
   */
   public String getFirstName() {
      return firstName;
   }
   
   /**
   * Gets last name of Driver.
   * @return last name
   */
   public String getLastName() {
      return lastName;
   }
   
   /**
   * Sets first name of Driver.
   * @param firstNameIn first name
   */
   public void setFirstName(String firstNameIn) {
      firstName = firstNameIn;
   }
   
   /**
   * Sets last name of Driver.
   * @param lastNameIn first name
   */
   public void setLastName(String lastNameIn) {
      lastName = lastNameIn;
   }
   
   /**
   * Gets the car number of driver.
   * @return car number
   */
   public int getCarNumber() {
      return carNumber;
   }
   
   /**
   * Sets car number.
   * @param numIn num of car
   */
   public void setCarNumber(int numIn) {
      carNumber = numIn;
   }
   
   /**
   * gets count of drivers.
   * @return count
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * Resets count.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * Gets driver code.
   * @return 3 letter driver code
   */
   public String getCode() {
      String code = getLastName().toUpperCase();
      code = code.substring(0, 3);
      return code;
   }
   
   /**
   * To String method.
   * @return a string output
   */
   public String toString() {
      String output = "";
      output = "Driver: ";
      output += getFirstName() + " " + getLastName() + ", ";
      output += getCode() + " " + getCarNumber();
      return output;
   }
   
   public int compareTo(F1Driver d) {
      int result = this.getFirstName().compareToIgnoreCase(d.getFirstName());
      return result;
   }
   
   public int compareTo1(F1Driver driver) {
      int result = this.getLastName().compareToIgnoreCase(driver.getLastName());
      return result;
   }
}