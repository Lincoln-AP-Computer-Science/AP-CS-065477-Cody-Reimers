public class Sphere implements Shape3D
{
   
   private double radius;
   
   public Sphere(double r)
   {
      this.radius = r;
   }
   
   public double getVolume()
   {
      return Math.pow(radius, 3) * Math.PI * (4.0/3);
   }
   
   public double getSurfaceArea()
   {
      return Math.pow(radius, 2) * Math.PI * 4;
   }
   
}