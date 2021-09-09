import java.text.DecimalFormat;

/**
* Class to make a sphere.
*/
public class Sphere {

   private double radius;
   private String label;
   
   /** 
   * Constructs a sphere.
   * @param labelIn label of sphere.
   * @param radiusIn radius of sphere.
   */
   public Sphere(String labelIn, double radiusIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
   }
   
   /**
   * Gets the label of the sphere.
   * @return label of sphere.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * Sets label of sphere.
   * @param labelIn label of cone.
   * @return t or f if there was a label already.
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn;
         return true;
      }
      return false;
   }
   
   /**
   * Gets the radius of the sphere.
   * @return radius of sphere.
   */
   public double getRadius() {
      return radius;
   }
   
   /**
   * Sets radius of sphere.
   * @param radiusIn label of cone.
   * @return t or f if there was a radius already.
   */
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      }
      return false;
   }
   
   /** 
   * Calculates surface area.
   * @return surface area.
   */
   public double surfaceArea() {
      return ((4) * (Math.PI) * Math.pow(radius, 2));
   }
   
   /** 
   * Calculates volume.
   * @return volume
   */
   public double volume() {
      return (((double) 4 / (double) 3) * (Math.PI) * Math.pow(radius, 3));
   }
   
   /**
   * To string method.
   * @return string output.
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      return "\n\"" + getLabel() + "\" is a sphere with radius of " + radius
         + " units,\n which has " + "surface area = " 
         + fmt.format(surfaceArea()) + " square inches,\n and volume = " 
         + fmt.format(volume()) + " cubic inches.";      
   }
   
}