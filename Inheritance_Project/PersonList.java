/**
* Creates a list of people.
* @author Nikhil Patel
* @version 5/9/21
*/
public class PersonList {
   private Person[] person;
   private int count;
   
   /**
   * Creates a person list.
   */
   public PersonList() {
      person = new Person[50];
      count = 0;
   }
   
   /**
   * Adds an element to the list.
   * @param personIn person to be added
   */
   public void addPerson(Person personIn) {
      person[count] = personIn;
      count++;
   }
   
   /**
   * To string method.
   * @return a string output
   */
   public String toString() {
      String output = "All people in grocery store: \n\n";
      
      for (int i = 0; i < count; i++) {
         output += person[i] + "\n\n";
      }
      
      output += "Count: " + count;
      return output;
   }
}