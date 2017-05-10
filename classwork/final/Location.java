import java.util.*;

public class Location
{
   
   private double x;
   private double y;
   
   public Location()
   {
      this.x = 0;
      this.y = 0;
   }
   
   public Location(double x, double y)
   {
      this.x = x;
      this.y = y;
   }
   
   public double getX()
   {  return x;}
   
   public double getY()
   {  return y;}
   
   public void changeX(double d)
   {  x = d;}
   
   public void changeY(double d)
   {  y = d;}
   
   //returns the slope of the line that connects two Locations
   public double riseOverRun(Location l)
   {  return (this.getY() - l.getY()) / (this.getX() - l.getX());}
   
   //returns a Location with old Location's x and y values
   //rounded to the nearest integer value
   public Location round()
   {
      Location rounded = new Location();
      if (this.getX() % 1 < 0.5)
         rounded.changeX(Math.floor(this.getX()));
      else
         rounded.changeX(Math.ceil(this.getX()));
         
      if (this.getY() % 1 < 0.5)
         rounded.changeY(Math.floor(this.getY()));
      else
         rounded.changeY(Math.ceil(this.getY()));
      
      return rounded;
   }
   
   //gives the difference of the x values of two locations
   public double compareX(Location l)
   {  return this.getX() - l.getX();}
   
   //gives the difference of the y values of two locations
   public double compareY(Location l)
   {  return this.getY() - l.getY();}
   
   //returns a Location whose x value and y value are the
   //differences between the two Locations' x and y values
   public Location compare(Location l)
   { return new Location(compareX(l), compareY(l));}
   
   //tests to see if two Locations have the same x and y values
   public boolean equals(Location l)
   {
      if(compareX(l) == 0 && compareY(l) == 0)
      {  return true;}
      return false;
   }
   
}