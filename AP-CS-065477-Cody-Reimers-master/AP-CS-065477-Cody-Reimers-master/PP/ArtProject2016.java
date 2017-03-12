public class ArtProject2016
{
   
   public static final int MAX = 20;
   
   public static void main(String[] args)
   {
   
      for(int line = 1; line <= MAX / 2 - 1; line++)
      {
         chars(' ', line * 2 - 1);
         chars('\\', 2);
         chars(' ', MAX - line * 2 - 2);
         chars('^', 2);
         chars(' ', MAX - line * 2 - 2);
         chars('/', 2);
         System.out.println();
      }
      
      for(int i = 1; i <= 2; i++)
      {
         chars('<', MAX - 1);
         System.out.print("..");
         chars('>', MAX - 1);
         System.out.println();
      }
      
      for(int line = 1; line <= MAX / 2 - 1; line++)
      {
         chars(' ', MAX - line * 2 - 1);
         chars('/', 2);
         chars(' ', line * 2 - 2);
         chars('v', 2);
         chars(' ', line * 2 - 2);
         chars('\\', 2);
         System.out.println();
      }
      
   }  // end of method main, prints a star
   
   public static void chars(char ch, int number)
   {
   
      for(int i = 1; i <= number; i++)
      {
         System.out.print(ch);
      }
      
   }  // end of method chars, prints character ch a number of times
   
}  // end of class ArtProject2016