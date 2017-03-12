public class Printer
{
   
   public static void main(String[] args)
   {
      
      printShortWords("I love AP Computer Science ", 4);
      printShortWords("this problem is hard ", 3);
      
   }  // end of method main
   
   public static void printShortWords(String str, int maxLength)
   {
      
      for(int a = str.length(); a > 0; a--)
      {
         
         String substring = str.substring(str.length() - a,
            str.length() - a + maxLength + 1);
         int b = substring.indexOf(' ');
         
         if(b != -1 && (str.charAt(str.length() - a - 1) == ' ' ||
            str.indexOf(str.length() - a) == 0))
         {
            System.out.println(substring.substring(0, b));
         }
            
      }  // end of for loop
      
   }  // end of method printShortWords
   
}  // end of class Printer