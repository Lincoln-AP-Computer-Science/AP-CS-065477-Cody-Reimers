import java.util.*;

public class FracCalc
{
   
   public static void main(String[] args)
   {
      
      // Introduce user to program and intialize program
      System.out.println("This program is a calculator designed to " +
         "take\nintegers, fractions, and mixed fractions, and " +
         "perform\ncalculations with them.");
      System.out.println("Mixed fraction should be written like " +
         "\"0_3/4\",\nand please use only two operands.\n" +
         "Type \"quit\" when asked for an equation to end the program.\n");
      String line = "";
      Scanner kbd = new Scanner(System.in);
      
      /* While loop gets equation, then sends it to be evaluated
         and prints the resulting fraction. */
      while (true)
      {
         
         System.out.print("Type an equation here:   ");
         line = kbd.nextLine();
         
         if (line.equalsIgnoreCase("quit"))
            break;
         
         System.out.println(line + " = " + computeFractions(line));
         
      }  // end of while loop
      
   }  // end of method main
   
   // Evaluates equation and returns results to be printed.
   public static String computeFractions(String line)
   {
      
      // Isolates the integers comprising mixed fraction 1
      int b1 = line.indexOf(' ');
      int s1 = line.indexOf('_');
      int f1 = line.indexOf('/');
      String strInt1 = line.substring(0, s1);
      int int1 = Integer.parseInt(strInt1);
      String strNum1 = line.substring(s1+1, f1);
      int numerator1 = Integer.parseInt(strNum1);
      String strDen1 = line.substring(f1+1, b1);
      int denomenator1 = Integer.parseInt(strDen1);
      
      // Isolates the first operator
      char operator1 = line.charAt(b1+1);
      
      // Isolates the integers in the second mixed fractions
      String operand2 = line.substring(b1+3);
      int s2 = operand2.indexOf('_');
      int f2 = operand2.indexOf('/');
      String strInt2 = operand2.substring(0, s2);
      int int2 = Integer.parseInt(strInt2);
      String strNum2 = operand2.substring(s2+1, f2);
      int numerator2 = Integer.parseInt(strNum2);
      String strDen2 = operand2.substring(f2+1);
      int denomenator2 = Integer.parseInt(strDen2);
      String solution = "null";
      
      if(operator1 == '+')
      {
         int intf = int1 + int2;
         int numeratorf = numerator1 * denomenator2 +
            numerator2 * denomenator1;
         int denomenatorf = denomenator1 * denomenator2;
         intf += numeratorf / denomenatorf;
         numeratorf %= denomenatorf; 
         solution = intf + "_" + numeratorf + "/" + denomenatorf;
      }
      else if(operator1 == '-')
      {
         int intf = int1 - int2;
         int numeratorf = numerator1 * denomenator2 -
            numerator2 * denomenator1;
         int denomenatorf = denomenator1 * denomenator2;
         solution = intf + "_" + numeratorf + "/" + denomenatorf;
      }
      else if(operator1 == '*')
      {
         int intf = int1 * int2;
         int numeratorf = numerator1 * numerator2;
         int denomenatorf = denomenator1 * denomenator2;
         solution = intf + "_" + numeratorf + "/" + denomenatorf;
      }
      else if(operator1 == '/')
      {
         int intf = int1 / int2;
         int numeratorf = numerator1 / numerator2;
         int denomenatorf = denomenator1 / denomenator2;
         solution = intf + "_" + numeratorf + "/" + denomenatorf;
      }
      
      return solution;
      
   }  // end of method computeFractions
   
}  // end of class FracCalc
