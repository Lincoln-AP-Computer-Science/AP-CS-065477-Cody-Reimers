public class HourGlass2_4
{
   
   public static final int CONE_HEIGHT = 5;
   
   public static void main(String[] args)
   {
      
      horizontal();
      for (int line = 1; line <= CONE_HEIGHT - 1; line++)
      {
         
         for (int i = 1; i <= line; i++)
         {
            System.out.print(" ");
         }  // prints left spaces
         
         System.out.print("\\");
         for (int q = 1; q <= CONE_HEIGHT * 2 - line * 2; q++)
         {
            System.out.print(":");
         }  // prints colons inside hourglass
         
         System.out.println("/");
         
      }  /* end of outer loop, prints
            top half of hourglass,
            excluding line 1 */
      
      for (int i = 1; i <= CONE_HEIGHT; i++)
      {
         System.out.print(" ");
      }  // prints spaces before hourglass
      
      System.out.println("||");
      
      for (int line = 1; line <= CONE_HEIGHT - 1; line++)
      {
      
         for (int i = 1; i <= CONE_HEIGHT - line; i++)
         {
            System.out.print(" ");
         }
         
         System.out.print("/");
         for (int q = 1; q <= line * 2; q++)
         {
            System.out.print(":");
         }
         
         System.out.println("\\");
         
      }  /* end of outer loop, prints
            bottom half of hourglass,
            excluding the final line. */
            
      horizontal();
   
   }  // end of method main
   
   public static void horizontal()
   {
   
      System.out.print("|");
      for (int x = 1; x <= CONE_HEIGHT * 2; x++)
      {
         System.out.print("\"");
      }  // prints top and bottom of hourglass
      
      System.out.println("|");
      
   }  // end of method horizontal
   
} // end of class HourGlass
