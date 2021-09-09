/**
* Creates a F1 constructor.
* @author Nikhil Patel
* @version 5/9/21
*/
public class F1Constructor implements Comparable <F1Constructor> {
   private String principal;
   private int numMembers;
   private static int count = 0;
   
   /**
   * Constructs a constructor.
   * @param principalIn prinicpal
   * @param membersIn members
   */
   public F1Constructor(String principalIn, int membersIn) {
      principal = principalIn;
      numMembers = membersIn;
      count++;
   }
   
   /**
   * Gets the name of principal.
   * @return principal
   */
   public String getName() {
      return principal;
   }
   
   public void setName(String principalIn) {
      principal = principalIn;
   }
   
   public int getNumMembers() {
      return numMembers;
   }
   
   public void setNumMembers(int membersIn) {
      numMembers = membersIn;
   }
   
   public static int getCount() {
      return count;
   }
   
   public void resetCount() {
      count = 0;
   }
   
   public String toString() {
      String output = "";
      output = "Principal: " + getName();
      output += "\nNumber of members: " + getNumMembers() + " members on team";
      return output;
   }
   
   public int compareTo(F1Constructor constructor) {
      int result = this.getName().compareToIgnoreCase(constructor.getName());
      return result;
   }
}