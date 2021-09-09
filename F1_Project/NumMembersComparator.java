import java.util.Comparator;

/**
* Compares campaign costs . 
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-5-21
*/
public class NumMembersComparator implements Comparator <F1Constructor> {

   /**
   * Compares two marketing campaigns.
   * @param c1 first marketing campaign
   * @param c2 second marketing campaign
   * @return an integer
   */
   public int compare(F1Constructor c1, F1Constructor c2) {
      if (c1.getNumMembers() > c2.getNumMembers()) {
         return -1;
      } 
      else if (c1.getNumMembers() < c2.getNumMembers()) {
         return 1;
      } 
      else {
         return 0;
      }
   }
   
}