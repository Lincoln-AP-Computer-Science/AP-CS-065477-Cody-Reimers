public class Dessert
{
   
////////Class Fields

   private double price;
   private double weight; //in ounces
   private int calories;
   
////////Class Constructors

   public Dessert()
   {
      this.price = 3.00;
      this.weight = 3;
      this.calories = 500;
   }
   
   public Dessert(double price, double weight, int calories)
   {
      this.price = price;
      this.weight = weight;
      this.calories = calories;
   }
   
////////Instance Accessor Methods
   
   public double getPrice()
   {
      return this.price;
   }
   
   public double getWeight()
   {
      return this.weight;
   }
   
   public int getCalories()
   {
      return this.calories;
   }
   
////////Instance Mutator Methods
   
   public void setPrice(double newPrice)
   {
      this.price = newPrice;
   }
   
}  //End of class Dessert