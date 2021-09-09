/**
* Creates a grocery store with main method.
* @author Nikhil Patel
* @version 5/9/21
*/
public class GroceryStore {
   
   /**
   * main method of class.
   * @param args not used
   */
   public static void main(String[] args) {
      PersonList pList = new PersonList();
      
      pList.addPerson(new Employee("Justin", "David"));
      pList.addPerson(new Cashier("Micah", "Boone"));
      pList.addPerson(new Stocker("Collin", "Rodgers"));
      pList.addPerson(new Customer("Cedrick", "Bopda-Waffo"));
      pList.addPerson(new OnlineCustomer("Nikhil", "Patel"));
      
      System.out.println(pList);
   }
}