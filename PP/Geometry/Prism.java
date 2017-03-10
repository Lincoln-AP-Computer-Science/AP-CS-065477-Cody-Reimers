public abstract class Prism implements Figure
{
   
   private double length;
   
   public Prism(double l)
   {
      this.length = l;
   }
   
   public double getLength()
   {
      return length;
   }
   
   public abstract double getVolume();
   
   public abstract double getSurfaceArea();
   
}