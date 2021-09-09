import java.text.DecimalFormat;

/** 
* Makes a circle.
*/
public class Circle {
   private String label;
   private double radius;
   
   /**
   * Constructs a circle.
   * @param labelIn label of circle.
   * @param radiusIn radius of circle.
   */
   public Circle(String labelIn, double radiusIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
   }
   
   /**
   * Gets the label of the circle.
   * @return the label of the circle.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * Sets label of circle.
   * @param labelIn label of Circle
   * @return t or f if a label is set
   */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
   }
   
   /**
   * Gets radius of circle.
   * @return radius of circle
   */
   public double getRadius() {
      return radius;
   }
   
   /**
   * Sets radius of circle.
   * @param radiusIn radius of circle.
   * @return t or f if radius is set
   */
   public boolean setRadius(double radiusIn) {
      if (radiusIn <= 0) {
         return false;
      }
      else {
         radius = radiusIn;
         return true;
      }
   }
   
   /**
   * Calculates diameter of circle.
   * @return diameter of circle.
   */
   public double diameter() {
      return (2 * radius);
   }
   
   /**
   * Calculates circumference of a circle.
   * @return circumeference of circle.
   */
   public double circumference() {
      return ((2) * (Math.PI) * (radius));
   }
   
   /**
   * Calculates area of circle.
   * @return area of circle.
   */
   public double area() {
      return (((Math.PI) * (Math.pow(radius, 2))));
   }
   
   /**
   * To string to make everything into string.
   * @return everything into string.
   */
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
      String output = "\"" + getLabel() + "\"" + " is a circle with radius = "
         + getRadius() + " units, \nwhich has diameter = "
         + df1.format(diameter()) + " units, \ncircumference = "
         + df1.format(circumference()) + " units, \nand area = "
         + df1.format(area()) + " square units." + "\n";
      return output;
   }
}