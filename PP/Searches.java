public class Searches
{
   
   public static void main(String[] args)
   {
      int[] numList = {31, 28, 14, 29, 34, 76, 5, 12, 8, 19, 11, 23};
      int[] sortedNums = {5, 8, 11, 12, 14, 19, 23, 28, 29, 31, 34, 76};
      
      int loc = indexOf(numList, 29);
      System.out.print("Sequential search: ");
      System.out.println("The location is " + loc);
      
      int loc2 = binarySearch(sortedNums, 77);
      System.out.print("Binary search: ");
      System.out.println("The location is " + loc2);
      
      int loc3 = binarySearch(sortedNums, 76);
      System.out.print("Binary search: ");
      System.out.println("The location is " + loc3);
   }
   
   //used to perform a sequential search of a list of integers
   public static int indexOf(int[] list, int target)
   {
      for(int i = 0; i < list.length; i++)
         if(list[i] == target)
            return i;
            
      return -1; //number searched for not found
   }
   
   //used to perform a binary search of a list of integers
   public static int binarySearch (int[] numbers, int target)
   {
      int min = 0;
      int max = numbers.length - 1;
      
      while (min <= max)
      {
         int mid = (min + max) / 2;
         
         if (numbers[mid] == target)
            return mid; //found it
         else if (numbers[mid] < target)
            min = mid + 1; //too small
         else //numbers[mid] > target
            max = mid - 1; //too large
            
      }
      
      return -1; //number not found in list
   }
   
}