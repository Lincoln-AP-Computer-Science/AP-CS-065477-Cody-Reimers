public class EquestrianTourGuide
{

   public static void main(String[] args)
   {
      
      System.out.println("The distance from Baltimare to Manehatten is " + distance(29, 16, 34, 8));
      System.out.println("The distance from Los Pegasus to Neighagra is " + distance(6, 19, 22, 7));
      System.out.println("The distance from the Badlands to Ponyville is " + distance(25, 24, 16, 14));
      System.out.println("The distance traveled on the roadtrip is " + roadTrip(22));
      System.out.println("Starting in Canterlot, turn " + angleFinder(distance(30, 13, 23, 19), distance(23, 19, 18, 10), distance(18, 10, 30, 13)) + " degrees to the right from North, then walk for " +  distance(18, 10, 30, 13) + " miles until you reach Fillydelphia.");
      System.out.println("In Fillydelphia, turn " + angleFinder(distance(23, 19, 18, 10), distance(18, 10, 30, 13), distance(30, 13, 23, 19)) + " degrees to the left from North, then walk for " + distance(30, 13, 23, 19) + " miles until you reach Dodge City.");
      System.out.println("In Dodge City, turn " + angleFinder(distance(18, 10, 30, 13), distance(30, 13, 23, 19), distance(23, 19, 18, 10)) + " degrees to the left from North, then walk for " + distance(23, 19, 18, 10) + " miles until you get back to Canterlot.");

   }  // end of method main
   
   public static double distance(double x1, double y1, double x2, double y2)
   {
   
      double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      return d;
      
   }  // end of method distance
   
   public static double roadTrip(double diameter)
   {
   
      double circumference = Math.PI * diameter;
      return circumference;
      
   }  // end of method roadTrip
   
   public static double angleFinder(double a, double b, double c)
   {
   
      double a2 = Math.pow(a, 2);
      double b2 = Math.pow(b, 2);
      double c2 = Math.pow(c, 2);
      double y = (b2 + c2 - a2) / (2 * b);
      double angle = Math.acos(y/c) * (180/Math.PI);
      return angle;
   
   }  // end of method angleFinder
   
}  // end of class Project