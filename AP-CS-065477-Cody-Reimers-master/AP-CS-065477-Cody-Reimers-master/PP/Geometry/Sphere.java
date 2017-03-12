public class Sphere extends Radial
{
   
   public Sphere(double r)
   {
      super(r);
   }
   
   public double getVolume()
   {
      return Math.pow(super.getRadius(), 3) * Math.PI * (4.0/3);
   }
   
   public double getSurfaceArea()
   {
      return Math.pow(super.getRadius(), 2) * Math.PI * 4;
   }
   
}