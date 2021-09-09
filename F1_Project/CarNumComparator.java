import java.util.Comparator;

/**
* Compares campaign costs . 
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-5-21
*/
public class CarNumComparator implements Comparator <F1Driver> {

   /**
   * Compares two marketing campaigns.
   * @param d1 first marketing campaign
   * @param d2 second marketing campaign
   * @return an integer
   */
   public int compare(F1Driver d1, F1Driver d2) {
      if (d1.getCarNumber() > d2.getCarNumber()) {
         return -1;
      } 
      else if (d1.getCarNumber() < d2.getCarNumber()) {
         return 1;
      } 
      else {
         return 0;
      }
   }
}