import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F1DriversList {
   private F1Driver[] drivers;
   
   public F1DriversList() {
      drivers = new F1Driver[0];
   }
   
   public F1Driver[] getF1DriverArray() {
      return drivers;
   }
   
   public void addDriver(F1Driver driver) {
      drivers = Arrays.copyOf(drivers, drivers.length + 1);
      drivers[drivers.length - 1] = driver;
   }
   
   public void readFile(String fileName) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      while (scanFile.hasNext()) {
         Scanner scanF1 = new Scanner(scanFile.nextLine());
         scanF1.useDelimiter(",");
         String firstName;
         String lastName;
         int car;
         
         firstName = scanF1.next();
         lastName = scanF1.next();
         car = Integer.parseInt(scanF1.next());
         
         addDriver(new F1Driver(firstName, lastName, car));
      }
   }
   
   public String generateRoster() {
      String output = "";
      output += "-------------------------------------------\n";
      output += "Every driver in the F1 2020-2021 Season\n";
      output += "-------------------------------------------\n\n";
      
      for (F1Driver d : drivers) {
         output += d.toString() + "\n\n";
      }
      return output;
   }
   
   public String generateRosterByName() {
      Arrays.sort(getF1DriverArray());
      String output = "";
      output += "-----------------------------------------------\n";
      output += "Every driver in the F1 2020-2021 Season Sorted by First Name";
      output += "\n-----------------------------------------------\n\n";
      
      for (F1Driver d : drivers) {
         output += d.toString() + "\n\n";
      }
      return output;
   }
   
   public String generateRosterByCarNumber() {
      Arrays.sort(getF1DriverArray(), new CarNumComparator());
      String output = "";
      output += "--------------------------------------------------\n";
      output += "Every driver in the F1 2020-2021 Season Sorted by Number\n";
      output += "--------------------------------------------------\n\n";
      
      for (F1Driver d : drivers) {
         output += d.toString() + "\n\n";
      }
      return output;
   }   
   
   public String generateRosterByLastName() {
      Arrays.sort(getF1DriverArray(), new LastNameComparator());
      String output = "";
      output += "--------------------------------------------------\n";
      output += "Every driver in the F1 2020-2021 Season Sorted by Last Name\n";
      output += "--------------------------------------------------\n\n";
      
      for (F1Driver d : drivers) {
         output += d.toString() + "\n\n";
      }
      return output;
   }
}