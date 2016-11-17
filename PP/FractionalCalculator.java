import java.util.*;

public class FractionalCalculator
{

   public static void main(String[] args)
   {
   
      System.out.println("This program is a basic calculator, " +
         "able to compute integers, decimals, and fractions." +
         "Type \"quit\" when asked for an equation to end program.");
      Scanner kbd = new Scanner(System.in);
      System.out.println();
      String line = "";
      
      while (true)
      {
      
         System.out.print("Give me an equation:   ");
         line = kbd.nextLine();
         
         if (line.equalsIgnoreCase("quit"))
            break;
         
         int result = doMath(line);
         
      }  // end of while loop
      
      System.out.println("Thank you for using this program." +
         "\nEnding operations.");
      
   }  // end of method main
   
   public static int doMath(String line)
   {
      
      int b1 = line.indexOf(' ');
      System.out.println("First blank space is at index " + b1);
      String strNum1 = line.substring(0, b1);
      int num1 = Integer.parseInt(strNum1);
      char operator1 = line.charAt(b1+1);
      int b2 = b1 + 2;
      String strNum2 = line.substring(b2+1);
      int num2 = Integer.parseInt(strNum2);
      int result = 0;
      
      if (operator1 == '+')
         result = num1 + num2;
      else if (operator1 == '-')
         result = num1 - num2;
      else if (operator1 == '*')
         result = num1 * num2;
      else if (operator1 == '/')
         result = num1 / num2;
      
      return result;
      
   }
   
}  // end of class FractionalCalculator