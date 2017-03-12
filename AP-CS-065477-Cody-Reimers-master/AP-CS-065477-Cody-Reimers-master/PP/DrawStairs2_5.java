public class DrawStairs2_5
{

   public static final int FINAL_ITERATION = 5;

   public static void main(String[] args)
   {
   
      for (int iteration = 1; iteration <= FINAL_ITERATION; iteration++)
      {
      
         for (int line = 1; line <= 3; line++)
         {
         
            for (int s = 1; s <= FINAL_ITERATION * 5 - iteration * 5; s++)
            {
               System.out.print(" ");
            }  // prints spaces left of figure
            
            for (int t = 1; t == line; t++)
            {
               System.out.print("  o  ******");
            }  // prints top of person
            
            for (int m = 2; m == line; m++)
            {
               System.out.print(" /|\\ *     ");
            }  // prints middle of person
            
            for (int b = 3; b == line; b++)
            {
               System.out.print(" / \\ *     ");
            }  // prints bottom of person
            
            for (int s = 1; s <= iteration * 5 - FINAL_ITERATION; s++)
            {
               System.out.print(" ");
            }  // prints interior spaces
            
            System.out.println("*");
         }  // end of line loop, prints a single line of output at a time
         
      }  // end of iteration loop, prints 3 lines at a time
      
      for (int r = 1; r <= FINAL_ITERATION * 6 + 2; r++)
      {
         System.out.print("*");
      }  // prints bottome line of star
      
   }  // end of method main
   
}  // end of class DrawStairs2_5