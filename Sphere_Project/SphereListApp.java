import java.util.Scanner;
import java.util.ArrayList;

/**
* Driver class for sphere list.
*/
public class SphereListApp {
   /**
   * Main method of driver class.
   * @param args not used  
   */   
   public static void main(String[] args) {
   
      String another;
      ArrayList<Sphere> list = new ArrayList<Sphere>();
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter name of sphere list: ");
      String sphereListName = userInput.nextLine();
      
      do {
         System.out.println("\nEnter label and radius for a Sphere.");
         System.out.print("\tlabel: ");
         String label = userInput.nextLine();
         System.out.print("\tradius: ");
         double radius = Double.parseDouble(userInput.nextLine());
      
         while (radius <= 0) {
            System.out.println("Error: height must be greater than 0.");
            System.out.print("Enter a radius for a Sphere: ");
            radius = Double.parseDouble(userInput.nextLine());
         }
         
         Sphere s = new Sphere(label, radius);
         list.add(s);
         
         System.out.println();
         System.out.print("Enter another sphere (y/n)? ");
         another = userInput.nextLine();
         
      } while ((another.equalsIgnoreCase("y")));
      
      SphereList sList = new SphereList(sphereListName, list);
      
      System.out.println("\n" + sList);
      
      System.out.println("\n" + sList.summaryInfo());
   
   }
}