import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F1ConstructorsList {
   private F1Constructor[] constructors;
   
   public F1ConstructorsList() {
      constructors = new F1Constructor[0];
   }
   
   public F1Constructor[] getF1ConstructorArray() {
      return constructors;
   }
   
   public void addConstructor(F1Constructor constructor) {
      constructors = Arrays.copyOf(constructors, constructors.length + 1);
      constructors[constructors.length - 1] = constructor;
   }
   
   public void readFile(String fileName) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      while (scanFile.hasNext()) {
         Scanner scanF1 = new Scanner(scanFile.nextLine());
         scanF1.useDelimiter(",");
         String name;
         int members;
         
         name = scanF1.next();
         members = Integer.parseInt(scanF1.next());
         
         addConstructor(new F1Constructor(name, members));
      }
   }
   
   public String generateRoster() {
      String output = "";
      output += "-------------------------------------------\n";
      output += "Every constructor in the F1 2020-2021 Season\n";
      output += "-------------------------------------------\n\n";
      
      for (F1Constructor c : constructors) {
         output += c.toString() + "\n\n";
      }
      return output;
   }
   
   public String generateRosterByName() {
      Arrays.sort(getF1ConstructorArray());
      String output = "";
      output += "-----------------------------------------------\n";
      output += "Every constructor in the F1 2020-2021 Season Sorted by Name";
      output += "\n-----------------------------------------------\n\n";
      
      for (F1Constructor c : constructors) {
         output += c.toString() + "\n\n";
      }
      return output;
   }
   
   public String generateRosterByNumberOfMembers() {
      Arrays.sort(getF1ConstructorArray(), new NumMembersComparator());
      String output = "";
      output += "--------------------------------------------------\n";
      output += "Every constructor in the F1 2020-2021 Season Sorted by Number";
      output += " of Members (Descending Order)";
      output += "\n--------------------------------------------------\n\n";
      
      for (F1Constructor c : constructors) {
         output += c.toString() + "\n\n";
      }
      return output;
   }   
}