public class Scramble
{
   
   public static void main(String[] args)
   {
      String[] words = {"TAN", "ABRACADABRA", "WHOA", "AARDVARK", "EGGS", "A", ""};
      System.out.println(toStringStringArray(words));
      
      for (int i = 0; i < words.length - 1; i++)
         System.out.print(scrambleWord(words[i]) + ", ");
      System.out.println(scrambleWord(words[words.length - 1]));
      
   //   scrambleArray(words);
   }
   
   public static String scrambleWord(String word)
   {
      char[] letters = new char[word.length()];
      for (int i = 0; i < word.length(); i++)
         letters[i] = word.charAt(i);
      
      String result = "";   
      for (int i = 0; i < letters.length - 1; i++)
      {
         if (letters[i] == 'A')
         {
            letters[i] = word.charAt(i + 1);
            letters[i + 1] = word.charAt(i);
         }
         result = result + letters[i];
      }
      if (word.length() != 0)
         result = result + letters[letters.length - 1];
      return result;
   }
   
   public static String toStringStringArray(String[] words)
   {
      String str = "";
      for (int i = 0; i < words.length - 1; i++)
         str = str + words[i] + ", ";
      
      str = str + words[words.length - 1];
      return str;
   }
   
}