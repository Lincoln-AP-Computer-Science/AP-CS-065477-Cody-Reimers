public class Cylinder implements Figure
{
   
   private double radius;
   private double height;
   
   public Cylinder(double r, double h)
   {
      this.radius = r;
      this.height = h;
   }
   
   public double getVolume()
   {
      return Math.PI * Math.pow(radius, 2) * height;
   }
   
   public double getSurfaceArea()
   {
      return 2 * (Math.PI * Math.pow(radius, 2)) + 2 * Math.PI * radius * height;
   }
   
}