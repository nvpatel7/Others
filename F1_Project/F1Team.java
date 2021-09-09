public class F1Team implements Comparable <F1Team> {
   private String teamName;
   private F1Driver driver;
   private F1Driver driver2;
   private F1Constructor constructor;
   private static int count = 0;
   
   public F1Team(String nameIn, F1Driver driverIn, F1Driver driver2In,
      F1Constructor constructorIn) {
      teamName = nameIn;
      driver = driverIn;
      driver2 = driver2In;
      constructor = constructorIn;
      count++;
   }
   
   public F1Driver getDriver1() {
      return driver;
   }
   
   public F1Driver getDriver2() {
      return driver2;
   }
   
   public void setDrivers(F1Driver driverIn, F1Driver driver2In) {
      driver = driverIn;
      driver2 = driver2In;
   }
   
   public String getTeamName() {
      return teamName;
   }
   
   public void setTeamName(String nameIn) {
      teamName = nameIn;
   }
   
   public F1Constructor getConstructor() {
      return constructor;
   }
   
   public void setConstructor(F1Constructor constructorIn) {
      constructor = constructorIn;
   }
   
   public int getcount() {
      return count;
   }
   
   public void resetCount() {
      count = 0;
   }
   
   public String toString() {
      String output = "";
      output = "Team name: " + getTeamName() + "\n";
      output += driver.toString() + "\n" + driver2.toString();
      output += "\n" + constructor.toString();
      return output;
   }
   
   public int compareTo(F1Team team) {
      int result = this.getTeamName().compareToIgnoreCase(team.getTeamName());
      return result;
   }
}