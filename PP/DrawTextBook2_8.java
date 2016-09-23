public class DrawTextBook2_8
{
   
   public static final int SIZE = 20;
   
   public static void main(String[] args)
   {
   
      for (int i = 1; i <= SIZE + 1; i++)
      {
         System.out.print(" ");
      }  // prints spaces left of line 1
      
      horizontal();
      System.out.println();
      for (int line = SIZE; line > 0; line--)
      {
      
         for (int s = 1; s <= line; s++)
         {
            System.out.print(" ");
         }  // prints spaces to the left of the textbook top
         
         System.out.print("/");
         for (int q = 1; q <= line * 3 - 3; q++)
         {
            System.out.print(" ");
         }  // prints spaces in top of textbook
         
         System.out.print("___/");
         for (int l = 1; l < SIZE - line + 1; l++)
         {
            System.out.print("__/");
         }  // prints scoring in textbook top
         
         for (int l = 1; l <= SIZE - line; l++)
         {
            System.out.print("/");
         }  // prints pages
         
         System.out.println();
      }  // end of outer for loop, prints top of textbook
      
      horizontal();
      for (int s = 1; s <= SIZE; s++)
      {
         System.out.print("/");
      }  // prints slashes right of second horizontal
      
      System.out.println();
      for (int line = 1; line <= SIZE / 2; line++)
      {
         System.out.print("|");
         for (int s = 1; s <= SIZE; s++)
         {
            System.out.print(" ");
            for (int x = SIZE / 2 - 1; x == s; x++)
            {
               System.out.print("Building");
            }
            
            for (int y = SIZE / 2; y == s; y++)
            {
               System.out.print("Java");
            }
            
            for (int z = SIZE / 2 + 1; z == s; z++)
            {
               System.out.print("Programs");
            }
            
         }  // prints interior left spaces on front
         
        /* System.out.print("Building Java Programs");
         for (int s = 1; s < (SIZE - 8) * 2; s++)
         {
            System.out.print(" ");
         }  // prints interior right spaces on front*/
         
         System.out.print("|");
         for (int l = 1; l <= SIZE / 2 + 1 - line; l++)
         {
            System.out.print("//");
         }  // prints slashes right of book front
         
         System.out.println();
      }  // end of outer for loop, prints front of book
      
      horizontal();
      
   }  // end of method main
   
   public static void horizontal()
   {
   
      System.out.print("+");
      for (int d = 1; d <= SIZE * 3; d++)
      {
         System.out.print("-");
      }  // prints dashes in horizontal
      
      System.out.print("+");
      
   }  // end of method horizontal
   
}  // end of class DrawTextBook2_8