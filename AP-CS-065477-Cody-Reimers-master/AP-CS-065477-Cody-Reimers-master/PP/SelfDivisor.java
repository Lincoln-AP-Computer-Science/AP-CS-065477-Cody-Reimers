public class SelfDivisor
{
   public static void main(String[] args)
   {
      int[] array = firstNumSelfDivisors(10, 3);
      System.out.print(array[0] + " " + array[1] + " " + array[2]);
   }
   
   public static boolean isSelfDivisor(int number)
   {
      String num = "" + number;
      
      for(int i = 0; i < num.length(); i++)
      {
         String s = num.substring(i, (i + 1));
         
         if((double)number % Integer.parseInt(s) != 0)
            return false;
            
      }
      
      return true;
   }
   
   public static int[] firstNumSelfDivisors(int start, int num)
   {
      int[] selfDivisors = new int[num];
      
      for(int i = 0; i < num; i++)
      {
         int x = start - 1;
         
         if(i > 0)
            x = selfDivisors[i - 1];
         
         while(true)
         {
            x++;
            
            if(isSelfDivisor(x) == true)
            {
               selfDivisors[i] = x;
               break;
            }
         }
      }
      
      return selfDivisors;
   }
   
}