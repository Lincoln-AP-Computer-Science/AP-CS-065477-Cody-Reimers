public class Cube implements Shape3D
{
   
   private double side; //length of one side
   
   public Cube(double s)
   {
      this.side = s;
   }
   
   public double getSurfaceArea()
   {
      return Math.pow(side, 2) * 6;
   }
   
   public double getVolume()
   {
      return Math.pow(side, 3);
   }
   
}