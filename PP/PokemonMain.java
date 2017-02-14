public class PokemonMain
{
   
   public static void main(String[] ars)
   {
      Pokemon Charmander = new Pokemon("Charmander", false, false, 39);
      Pokemon Raichu = new Pokemon("Raichu", false, false, 60);
      printHitPointsDifference(Charmander, Raichu);
   }
   
   //Takes two Pokemon objects and compares the hitPoints of the first
   //versus the second, printing the result to the console
   public static void printHitPointsDifference(Pokemon pkmn1, Pokemon pkmn2)
   {
      System.out.println("The difference between " + pkmn1 + "'s and " + pkmn2 +
            "'s hit points is " + (pkmn1.getHitPoints() - pkmn2.getHitPoints()));
   }
   
}
