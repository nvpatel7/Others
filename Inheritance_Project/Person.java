/**
* Creates a person.
* @author Nikhil Patel
* @version 5/9/21
*/
public abstract class Person {
   protected String firstName;
   protected String lastName;
   protected String name;
   protected static int count = 0;  
   
   /**
   * Constructs a person.
   * @param firstNameIn first name
   * @param lastNameIn last name
   */
   public Person(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      count++;
   }
   
   /**
   * Gets the first name of person.
   * @return first name of person
   */
   public String getFirstName() {
      return firstName;
   }
   
   /**
   * Gets the last name of person.
   * @return last name of person
   */
   public String getLastName() {
      return lastName;
   }
   
   /**
   * Sets the first name of the person.
   * @param firstNameIn name
   */
   public void setFirstName(String firstNameIn) {
      firstName = firstNameIn;
   }
   
   /**
   * Sets the last name of the person.
   * @param lastNameIn name
   */
   public void setLastName(String lastNameIn) {
      lastName = lastNameIn;
   }
   
   /**
   * Gets the count of objects created.
   * @return count
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * Resets the count.
   */
   public static void resetCount() {
      count = 0;
   }
   
   
   /**
   * Abstract method to get ID.
   * @return ID
   */
   public abstract String getID();
   
   /**
   * toString method.
   * @return String output
   */
   public String toString() {
      String output = "";
      output = getFirstName() + " " + getLastName();
      output += " (" + this.getClass() + ")";
      output += "\n\t" + "ID: " + getID();
      return output;
   }
}