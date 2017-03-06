public class Cone implements Figure
{
   
   private double radius;
   private double height;
   
   public Cone(double r, double h)
   {
      this.radius = r;
      this.height = h;
   }
   
   public double getVolume()
   {
      return Math.PI * Math.pow(radius, 2) * (height / 3);
   }
   
   public double getSurfaceArea()
   {
      return Math.PI * radius * (radius * Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
   }
   
}