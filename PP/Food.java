public class Food
{
   
   private String foodName;
   //Measures how old a piece of food is in days.
   private int age;
   //Age when specific food object typically rots.
   private int rotsWhen;
   //isRotten is false by default, but depends on age
   private boolean isRotten;
   //Measures weight of food object in ounces.
   private double weight;
   
   public Food()
   {
      foodName = "foodstuff";
      setAge(0); //A new piece of food
      setRotsWhen(10);
      rottenOrNot(0, 10);
      setWeight(16);
   }
   
   public Food(String s, int a, int r, int w)
   {
      foodName = s;
      setAge(a);
      setRotsWhen(r);
      rottenOrNot(a, r);
      setWeight(w);
   }
   
   
   public boolean rottenOrNot(int a, int r)
   {
      if(a >= r)
         return true;
      else
         return false;
   }
   
   //Accessors to return value for each private variable.
   public String getFoodName()
   {
      return foodName;
   }
   
   public int getAge()
   {
      return this.age;
   }
   
   public int getRotsWhen()
   {
      return rotsWhen;
   }
   
   public boolean getIsRotten()
   {
      return isRotten;
   }
   
   public double getWeight()
   {
      return this.weight;
   }
   
   //Mutators to set each private variable.
   public void setAge(int a)
   {
      this.age = a;
   }
   
   public void setRotsWhen(int r)
   {
      rotsWhen = r;
   }
   
   public void setIsRotten(boolean b)
   {
      isRotten = b;
   }
   
   public void setWeight(double w)
   {
      this.weight = w;
   }
   
}