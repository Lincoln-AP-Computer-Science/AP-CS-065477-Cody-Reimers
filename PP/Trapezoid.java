public class Trapezoid implements Shape
{
   
   private double height;
   private double base1; //this should be the smaller base
   private double base2; //this should be the larger base
   private double leg1;
   private double leg2;
   
   public Trapezoid(double h, double b1, double b2, double l1, double l2)
   {
      this.height = h;
      this.base1 = b1;
      this.base2 = b2;
      this.leg1 = l1;
      this.leg2 = l2;
   }

   public double getArea()
   {
      return base1 * height + (base2 - base1) * height;
   }
   
   public double getPerimeter()
   {
      return base1 + base2 + leg1 + leg2;
   }
   
}