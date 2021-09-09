import java.util.ArrayList;
import java.text.DecimalFormat;

/**
* Class to print a Sphere List.
*/
public class SphereList {
   
   private String listName;
   private ArrayList<Sphere> sList;
   
   /** 
    * Create SphereList object.
    * @param listNameIn for name
    * @param sListIn for sList
    */
   public SphereList(String listNameIn, ArrayList<Sphere> sListIn) {
      listName = listNameIn;
      sList = sListIn;
   }
   
   /**
   * Gets name of list.
   * @return name of list.
   */
   public String getName() {
      return listName;
   }
   
   /**
   * gets number of spheres.
   * @return number of spheres.
   */
   public int numberOfSpheres() {
      if (sList.size() == 0)
      {
         return 0;
      }
      else
      {
         return sList.size();
      }
   }
   
   /**
   * Returns total surface area of spheres in the array.
   * @return total surface area of spheres in the array
   * returns zero if there are no objects in the array
   */
   public double totalSurfaceArea()
   {
      double total = 0;
      int index = 0;
      while (index < sList.size()) 
      {
         total += sList.get(index).surfaceArea();
         index++;  
      }   
      return total;
   }
   
   /**
   * Returns total volume of spheres in the array.
   * @return total volume of spheres in the array
   * returns zero if there are no objects in the array
   */
   public double totalVolume()
   {
      double total = 0;
      int index = 0;
      while (index < sList.size()) 
      {
         total += sList.get(index).volume();
         index++;  
      }   
      return total;
   }
   
   /**
   * Returns average surface area of spheres in the array.
   * @return average surface area of spheres in the array
   * returns zero if there are no objects in the array
   */
   public double averageSurfaceArea()
   {
      double total = 0;
      int index = 0;
      if (sList.size() == 0)
      {
         return 0;
      }
      else
      {
         while (index < sList.size()) 
         {
            total += sList.get(index).surfaceArea();
            index++;  
         }
      }   
      return (total / sList.size());
   }
   
   /**
   * Returns average volume of spheres in the array.
   * @return average volume of spheres in the array
   * returns zero if there are no objects in the array
   */
   public double averageVolume()
   {
      double total = 0;
      int index = 0;
      if (sList.size() == 0)
      {
         return 0;
      }
      else
      {
         while (index < sList.size()) 
         {
            total += sList.get(index).volume();
            index++;  
         }
      }   
      return (total / sList.size());
   }
   
   /** 
    * Returns String for the list of spheres.
    * @return String for list 
    * (includes name of list and the spheres)
    */
   public String toString()
   {
      String result = listName + "\n";
      int index = 0;
      while (index < sList.size()) 
      {
         result += "\n" + sList.get(index); 
         index++;  
      }   
      return result;
   }
   
    /** 
    * Returns Summary of the list of spheres.
    * @return String for summary of the list 
    * (includes name of list and results for various method calls)
    */
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Spheres: " + numberOfSpheres();
      result += "\nTotal Surface Area: "  + df.format(totalSurfaceArea());
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nAverage Surface Area: "  + df.format(averageSurfaceArea());
      result += "\nAverage Volume: "  + df.format(averageVolume());
      return result;
   }
}