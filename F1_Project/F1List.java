import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F1List {
   private F1Team[] teams;
   
   public F1List() {
      teams = new F1Team[0];
   }
   
   public F1Team[] getF1TeamArray() {
      return teams;
   }
   
   public void addTeam(F1Team teamIn) {
      teams = Arrays.copyOf(teams, teams.length + 1);
      teams[teams.length - 1] = teamIn;
   }
   
   public void readFile(String fileName) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      while (scanFile.hasNext()) {
         Scanner scanF1 = new Scanner(scanFile.nextLine());
         scanF1.useDelimiter(",");
         String teamName;
         String firstName1;
         String lastName1;
         int car1;
         String firstName2;
         String lastName2;
         int car2;
         String name;
         int members;
         
         teamName = scanF1.next();
         firstName1 = scanF1.next();
         lastName1 = scanF1.next();
         car1 = Integer.parseInt(scanF1.next());
         firstName2 = scanF1.next();
         lastName2 = scanF1.next();
         car2 = Integer.parseInt(scanF1.next());
         name = scanF1.next();
         members = Integer.parseInt(scanF1.next());
         
         addTeam(new F1Team(teamName, 
            new F1Driver(firstName1, lastName1, car1), 
            new F1Driver(firstName2, lastName2, car2),
            new F1Constructor(name, members)));
      }
   }
   
   public String generateRoster() {
      String output = "";
      output += "-------------------------------------------\n";
      output += "Every team in the F1 2020-2021 Season\n";
      output += "-------------------------------------------\n\n";
      
      for (F1Team team : teams) {
         output += team.toString() + "\n\n";
      }
      return output;
   }
   
   public String generateRosterByName() {
      Arrays.sort(getF1TeamArray());
      String output = "";
      output += "-------------------------------------------------\n";
      output += "Every team in the F1 2020-2021 Season Sorted by Team Name\n";
      output += "-------------------------------------------------\n\n";
      
      for (F1Team team : teams) {
         output += team.toString() + "\n\n";
      }
      return output;
   }
}