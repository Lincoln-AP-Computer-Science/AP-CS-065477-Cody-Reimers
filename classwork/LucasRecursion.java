public class LucasRecursion
{
   
   public static void main(String[] args)
   {
      System.out.print("Lucas Numbers are like Fibonacci Numbers,\nbut with a difference:");
      System.out.println("the Lucas Numbers\nstart with 2, 1, and 3 instead of 0, 1, and 1.");
      System.out.println("The 2nd Lucas Number is: " + lucas(2));
      System.out.println("The 6th Lucas Number is: " + lucas(6));
      System.out.println("The 9th Lucas Number is: " + lucas(9));
      System.out.println("The 15th Lucas Number is: " + lucas(15));
      System.out.println("The 23rd Lucas Number is: " + lucas(23));
   }
   
   public static int lucas(int n)
   {
      if (n == 0)
         return 2;
      else if (n == 1)
         return 1;
      else if (n == 2)
         return 3;
      else
         return lucas(n - 1) + lucas(n - 2);
   }
   
}