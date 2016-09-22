public class DrawRocket2_6
{
   public static final int SIZE = 3;
   
   public static final int DOUBLE = SIZE * 2;
   
   public static void main(String[] args)
   {
   
      cone();
      horizontal();
      up();
      down();
      horizontal();
      down();
      up();
      horizontal();
      cone();
      
   }  // end of method main

   public static void cone()
   {
   
      for (int line = 1; line <= DOUBLE; line++)
      {
      
         for (int s = 1; s <= DOUBLE - line; s++)
         {
            System.out.print(" ");
         }  // prints spaces left of cone
         
         for (int l = 1; l <= line; l++)
         {
            System.out.print("/");
         }  // prints left half of cone
         
         System.out.print("**");
         for (int b = 1; b <= line; b++)
         {
            System.out.print("\\");
         }  // prints right half of cone
         
         System.out.println();
         
      }  // end of outer for loop, prints a single cone
      
   }  // end of method cone
   
   public static void horizontal()
   {
   
      System.out.print("+");
      for (int q = 1; q <= DOUBLE; q++)
      {
         System.out.print("=*");
      }  // prints single segment of horizontal
      
      System.out.println("+");
      
   }  // end of method horizontal
   
   public static void up()
   {
   
      for (int line = 1; line <= SIZE; line++)
      {
         System.out.print("|");
         for (int l = 1; l <= SIZE - line; l++)
         {
            System.out.print(".");
         }  // prints left dots
         
         for (int s = 1; s <= line; s++)
         {
            System.out.print("/\\");
         }  // prints left slash sets
         
         for (int m = 1; m <= SIZE - line; m++)
         {
            System.out.print("..");
         }  // prints middle dots
         
         for (int s = 1; s <= line; s++)
         {
            System.out.print("/\\");
         }  // prints right slash sets
         
         for (int r = 1; r <= SIZE - line; r++)
         {
            System.out.print(".");
         }  // prints right dots
         
         System.out.println("|");
         
      }  // end of outer loop
      
   }  // end of method up
   
   public static void down()
   {
   
      for (int line = 1; line <= SIZE; line++)
      {
         System.out.print("|");
         for (int l = 1; l <= line - 1; l++)
         {
            System.out.print(".");
         }  // prints left dots
         
         for (int s = 1; s <= SIZE + 1 - line; s++)
         {
            System.out.print("\\/");
         }  // prints left slash sets
         
         for (int m = 1; m <= line - 1; m++)
         {
            System.out.print("..");
         }  // prints middle dots
         
         for (int s = 1; s <= SIZE + 1 - line; s++)
         {
            System.out.print("\\/");
         }  // prints right slash sets
         
         for (int r = 1; r <= line - 1; r++)
         {
            System.out.print(".");
         }  // prints right dots
         
         System.out.println("|");
         
      }  // end of outer for loop
      
   }  // end of method down
   
}  // end of class DrawRocket2_6