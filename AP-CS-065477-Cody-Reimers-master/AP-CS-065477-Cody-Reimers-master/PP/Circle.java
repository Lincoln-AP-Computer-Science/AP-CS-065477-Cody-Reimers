public class Circle implements Shape
{
   
   private double radius;
   
   public Circle(double r)
   {
      this.radius = r;
   }
   
   public double getArea()
   {
      return Math.PI * Math.pow(radius, 2);
   }
   
   public double getPerimeter()
   {
      return Math.PI * 2 * radius;
   }
   
}