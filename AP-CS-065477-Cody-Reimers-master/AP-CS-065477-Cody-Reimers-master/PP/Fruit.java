public class Fruit extends Food
{
   
   private String foodType;
   private int ripeWhen;
   
  /* public Fruit()
   {
      
   }*/
   
   public Fruit(String s, int a, int r, int f, int w)
   {
      super(s, a, r, w); //Calls Food constructor
      if(r <= f)
         throw new IllegalArgumentException();
      foodType = "fruit";
      ripeWhen = f;
   }
   
   public void ripen()
   {
      super.setAge(ripeWhen);
   }
   
}