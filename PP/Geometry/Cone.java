public class Cone extends Radial
{
   
   private double height;
   
   public Cone(double r, double h)
   {
      super(r);
      this.height = h;
   }
   
   public double getVolume()
   {
      return Math.PI * Math.pow(super.getRadius(), 2) * (height / 3);
   }
   
   public double getSurfaceArea()
   {
      return Math.PI * super.getRadius() * (super.getRadius() *
            Math.sqrt(Math.pow(height, 2) + Math.pow(super.getRadius(), 2)));
   }
   
}