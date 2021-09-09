import java.util.Scanner;
/**
* Driver class for circle class.
*/
public class CircleApp {
   /**
   * Main method for class.
   * @param args not used
   */
   public static void main(String[] args) {
      String circleLabel;
      double circleRadius;
      String another;
      Scanner userInput = new Scanner(System.in);
      
      do {
         System.out.print("Enter label and radius for a circle.");
         System.out.print("\n\tLabel: ");
         circleLabel = userInput.nextLine();
      
         System.out.print("\tRadius: ");
         circleRadius = Double.parseDouble(userInput.nextLine());
      
         while (circleRadius <= 0) {
            System.out.println("Error: Radius must be greater than 0.");
            System.out.print("\tRadius: ");
            circleRadius = Double.parseDouble(userInput.nextLine());      
         }
      
         Circle circle = new Circle(circleLabel, circleRadius);
         System.out.println(circle);
      
         System.out.println();
         System.out.print("Enter another circle (y/n)? ");
         another = userInput.nextLine();
      } while ((another.equalsIgnoreCase("y")));
   }
}