public class RectPrism extends Prism
{
   
   private double width;
   private double height;
   
   public RectPrism(double l, double w, double h)
   {
      super(l);
      this.width = w;
      this.height = h;
   }
   
   public double getVolume()
   {
      return super.getLength() * width * height;
   }
   
   public double getSurfaceArea()
   {
      return 2 * (super.getLength() * width) + 2 *
             (super.getLength() * height) + 2 * (width * height);
   }
   
}