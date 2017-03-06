public class RectPrism implements Figure
{
   
   private double length;
   private double width;
   private double height;
   
   public RectPrism(double l, double w, double h)
   {
      this.length = l;
      this.width = w;
      this.height = h;
   }
   
   public double getVolume()
   {
      return length * width * height;
   }
   
   public double getSurfaceArea()
   {
      return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
   }
   
}