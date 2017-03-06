public class Radial implements Figure
{
   
   private double radius;
   
   public Radial(double r)
   {
      this.radius = r;
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public double getVolume()
   {
      return 0;
   }
   
   public double getSurfaceArea()
   {
      return 0;
   }
   
}