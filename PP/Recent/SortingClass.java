public class SortingClass
{
   
   public static void main(String[] args)
   {
      int[] list1 = {4, 2, 12, 8, 5, 3, 1};
      int[] list2 = {99, 14, 29, 54, 63, 2, 32, 49};
      
      System.out.println("Unsorted list 1: " + numbersToString(list1));
      System.out.println("Insert sorted list: " + numbersToString(insertSort(list1)));
      
      System.out.println("Unsorted list 2: " + numbersToString(list2));
      System.out.println("Insert sorted list: " + numbersToString(insertSort(list2)));
      
   }
   
   public static int[] insertSort(int[] list)
   {
      for(int i = 0; i < list.length - 1;i++)
      {
         int temp = i;
         while(true)
         {
            if(list[temp + 1] < list[temp])
            {
               int number = list[temp + 1];
               list[temp + 1] = list[temp];
               list[temp] = number;
            }
            else
               break;
            
            temp = temp - 1;
            if(temp == -1)
               break;
         }
      }
      return list;
   }
   
   public static String numbersToString(int[] list)
   {
      String str = "";
      for(int i = 0; i < list.length; i++)
         str = str + list[i] + ", ";
         
      return str;
   }
   
}