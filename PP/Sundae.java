import java.util.*;

public class Sundae extends Dessert
{
   
////////Class Fields
   
   private ArrayList<String> toppings = new ArrayList<String>();
   
////////Class Constructors
   
   public Sundae()
   {
      super();
      toppings.add("Whipped Cream");
   }
   
   public Sundae(double price, double weight, int calories, ArrayList<String> toppings)
   {
      super(price, weight, calories);
      this.toppings = toppings;
   }
   
////////Instance Accessor Methods
   
   public ArrayList<String> getToppings()
   {
      return this.toppings;
   }
   
   public String toString()
   {
      return this.toppings + " Sundae: costs $" + super.getPrice() +
            ", has " + super.getCalories() + " calories";
   }
////////Instance Mutator Methods
   
   
}