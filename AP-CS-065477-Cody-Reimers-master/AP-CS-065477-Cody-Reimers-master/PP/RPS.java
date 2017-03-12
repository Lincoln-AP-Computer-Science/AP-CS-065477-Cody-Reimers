import java.util.*;

public class RPS
{

   public static void main(String[] args)
   {
   
      Scanner console = new Scanner(System.in);
      String computer = "null";
      String whom = "null";
      int games1 = 0;
      int games2 = 0;
      int wins1 = 0;
      int wins2 = 0;
      System.out.println("This program allows you to play a simple game\n" +
         "with the computer. You can quit by typing \"quit\" during prompts.");
      System.out.println();
      
      for (int i = 1; i <= 1; i++)
      {  // for loop plays game indefinitely unless the user inputs "quit"
         System.out.println("Rock, paper, or scissors?");
         String player = console.nextLine();
         double n = Math.floor(Math.random() * 4);
         
         if (n == 3)
           // start of if/else logic construct
            computer = "scissors";
         else if (n == 2)
            computer = "paper";
         else if (n == 1)
            computer = "rock";
         else if (!player.equalsIgnoreCase("quit"))
            computer = player;
           // end of if/else logic construct
         
         if (!player.equalsIgnoreCase("quit"))
         {
            System.out.println("Is player 1 or player 2 playing? (answer 1 or 2)");
            whom = console.nextLine();
         }
         
         if (player.equalsIgnoreCase(computer))
         {  // start of if/else logic construct
            System.out.println("You tied!");
            System.out.println();
         }
         
         else if (player.equalsIgnoreCase("rock") && 
            computer.equalsIgnoreCase("scissors") ||
            player.equalsIgnoreCase("paper") &&
            computer.equalsIgnoreCase("rock") ||
            player.equalsIgnoreCase("scissors") &&
            computer.equalsIgnoreCase("paper"))
         {
            System.out.println("You won. You must be pretty lucky.");
            System.out.println();
         }
         
         else if (!player.equalsIgnoreCase("quit"))
         {
            System.out.println("You lost. Unfortunate.");
            System.out.println();
         }  // end of if/else logic construct
           
         if (player.equalsIgnoreCase("quit"))
         {  // start of if/else logic construct
            System.out.println("Terminating program.");
         }
         else
            i--;
           // end of if/else logic construct
         
         if (whom.equalsIgnoreCase("1") && !player.equalsIgnoreCase("quit"))
         {  // beginning of if/else logic construct
            games1++;
            
            if (player.equalsIgnoreCase("rock") && 
               computer.equalsIgnoreCase("scissors") ||
               player.equalsIgnoreCase("paper") &&
               computer.equalsIgnoreCase("rock") ||
               player.equalsIgnoreCase("scissors") &&
               computer.equalsIgnoreCase("paper"))
            {
               wins1++;
            }
            
         }
         
         else if (!player.equalsIgnoreCase("quit"))
         {
            games2++;
            
            if (player.equalsIgnoreCase("rock") && 
               computer.equalsIgnoreCase("scissors") ||
               player.equalsIgnoreCase("paper") &&
               computer.equalsIgnoreCase("rock") ||
               player.equalsIgnoreCase("scissors") &&
               computer.equalsIgnoreCase("paper"))
            {
               wins2++;
            }
            
         }  // end of if/else logic construct
         
      }  // end of for loop
      
      System.out.println();
      System.out.println("Player 1 played " + games1 + " games.");
      System.out.println("Player 1 won " + wins1 + " games.");
      System.out.println("Player 2 played " + games2 + " games.");
      System.out.println("Player 2 won " + wins2 + " games.");
      
      if (((double)wins1/games1) > ((double)wins2/games2))
      {  // start of if/else logic construct
         System.out.println("Player 1 had a better win ratio.");
      }
      
      else
      {
         System.out.println("Player 2 had a better win ratio.");
      }  // end of if/else logic construct
      
   }  // end of method main
   
}  // end of class RPS