public class Cylinder extends Radial
{
   
   private double height;
   
   public Cylinder(double r, double h)
   {
      super(r);
      this.height = h;
   }
   
   public double getVolume()
   {
      return Math.PI * Math.pow(super.getRadius(), 2) * height;
   }
   
   public double getSurfaceArea()
   {
      return 2 * (Math.PI * Math.pow(super.getRadius(), 2)) + 2 * Math.PI * super.getRadius() * height;
   }
   
}