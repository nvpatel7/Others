import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

/**
* Driver class for sphere list by reading a file.
*/
public class SphereListAppReadFile {

   /**
   * Main method of driver class.
   * @param args not used  
   * @throws FileNotFoundException if file not found
   */    
   public static void main(String[] args) throws FileNotFoundException {
      String another;  
      String sphereListName;    
      ArrayList<Sphere> list = new ArrayList<Sphere>();
      Scanner userInput = new Scanner(System.in);
      
      do {
         System.out.print("Enter file name: ");
         String fileName = userInput.nextLine();
      
         Scanner scanFile = new Scanner(new File(fileName));
      
         sphereListName = scanFile.nextLine();
      
         while (scanFile.hasNext()) {
            String label = scanFile.nextLine();
            double radius = Double.parseDouble(scanFile.nextLine());   
         
            Sphere s = new Sphere(label, radius);
            list.add(s);
         }
         System.out.println();
         System.out.print("Enter another sphere (y/n)? ");
         another = userInput.nextLine();
         
      } while ((another.equalsIgnoreCase("y")));
      
      SphereList sList = new SphereList(sphereListName, list);
      
      System.out.println("\n" + sList);
      
      System.out.println("\n" + sList.summaryInfo());
   }
}