public class Triangle implements Shape
{
   
   private double height;
   private double base;
   private double leg1;
   private double leg2;
   
   public Triangle(double h, double b, double l1, double l2)
   {
      this.height = h;
      this.base = b;
      this.leg1 = l1;
      this.leg2 = l2;
   }
   
   public double getArea()
   {
      return 0.5 * height * base;
   }
   
   public double getPerimeter()
   {
      return base + leg1 + leg2;
   }
   
}