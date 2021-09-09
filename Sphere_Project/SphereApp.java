import java.util.Scanner;

/**
* Driver class for Sphere.
*/
public class SphereApp {
   /**
   * Main method for class.
   * @param args not used.
   */   
   public static void main(String[] args) {
      
      double sphereRadius;
      String sphereLabel, another;
      Sphere sphere;
      Scanner input = new Scanner(System.in);
      
      do {
         System.out.println("\nEnter label and radius for a Sphere.");
         System.out.print("\tlabel: ");
         sphereLabel = input.nextLine();
         System.out.print("\tradius: ");
         sphereRadius = Double.parseDouble(input.nextLine());
      
         while (sphereRadius <= 0) {
            System.out.println("Error: height must be greater than 0.");
            System.out.print("Enter a radius for a Sphere: ");
            sphereRadius = Double.parseDouble(input.nextLine());
         }
      
         sphere = new Sphere(sphereLabel, sphereRadius);
         System.out.println(sphere);
      
         System.out.println();
         System.out.print("Enter another sphere (y/n)? ");
         another = input.nextLine();
      } while ((another.equalsIgnoreCase("y")));
   }
}