public abstract class Radial implements Figure
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
   
   public abstract double getVolume();
   
   public abstract double getSurfaceArea();
      
}