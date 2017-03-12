public class Cube extends Prism
{
   
   public Cube(double l)
   {
      super(l);
   }
   
   public double getSurfaceArea()
   {
      return Math.pow(super.getLength(), 2) * 6;
   }
   
   public double getVolume()
   {
      return Math.pow(super.getLength(), 3);
   }
   
}