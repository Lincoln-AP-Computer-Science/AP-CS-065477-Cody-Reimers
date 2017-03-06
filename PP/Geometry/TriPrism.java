public class TriPrism implements Figure
{
   
   private double length;
   private double height;
   private double base1; //length of side of triangle perpendicular to height
   private double base2; //side clockwise of base1
   private double base3; //side counter-clockwise of base1
   
   public TriPrism(double l, double h, double b1, double b2, double b3)
   {
      this.length = l;
      this.height = h;
      this.base1 = b1;
      this.base2 = b2;
      this.base3 = b3;
   }
   
   public double getVolume()
   {
      return length * (0.5 * base1 * height);
   }
   
   public double getSurfaceArea()
   {
      return 2 * (0.5 * base1 * height) + length * (base1 + base2 + base3);
   }
   
}