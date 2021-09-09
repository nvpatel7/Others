import java.io.FileNotFoundException;

public class F1ConstructorRoster {
   
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         F1ConstructorsList f1 = new F1ConstructorsList();
         f1.readFile(args[0]);
         System.out.println(f1.generateRoster());
         System.out.println(f1.generateRosterByName());
         System.out.println(f1.generateRosterByNumberOfMembers());
      }  
   }
}