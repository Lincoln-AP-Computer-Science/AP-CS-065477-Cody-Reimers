public class AbstractFigures2_1
{

   public static void main(String[] args)
   {
   
      for (int height = 1; height <= 7; height++)
      {
      
         for (int a = 1; a <= (7 - height); a++)
         {
            System.out.print("*");
         }  // prints left border stars
         
         for (int b = 1; b <= height; b++)
         {
            System.out.print(" ");
         }  // prints left spaces
         
         for (int c = 1; c <= (14 - height * 2); c++)
         {
            System.out.print("/");
         }  // prints main body slashes
         
         for (int d = 1; d <= (height * 2 - 2); d++)
         {
            System.out.print("\\");
         }  // prints main body backslashes
         
         for (int e = 1; e <= height; e ++)
         {
            System.out.print(" ");
         }  // prints right spaces
         
         for (int f = 1; f <= (7 - height); f++)
         {
            System.out.print("*");
         }  // prints right border stars
         
         System.out.println();
         
      }  // end of outer for loop
      
   }  // end of method main
   
}  // end of class AbstractFigures2_1