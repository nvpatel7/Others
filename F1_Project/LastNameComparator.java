import java.util.Comparator;

/**
* Compares campaign costs . 
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-5-21
*/
public class LastNameComparator implements Comparator <F1Driver> {

   /**
   * Compares two marketing campaigns.
   * @param d1 first marketing campaign
   * @param d2 second marketing campaign
   * @return an integer
   */
   public int compare(F1Driver d1, F1Driver d2) {
      int result = d1.getLastName().compareToIgnoreCase(d2.getLastName());
      return result;
   }
}