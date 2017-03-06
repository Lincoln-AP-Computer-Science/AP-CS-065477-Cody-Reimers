public class Rectangle implements Shape
{
   
   private double length;
   private double width;
   
   public Rectangle(double l, double w)
   {
      this.length = l;
      this.width = w;
   }
   
   public double getArea()
   {
      return width * length;
   }
   
   public double getPerimeter()
   {
      return (width + length) * 2;
   }
   
}