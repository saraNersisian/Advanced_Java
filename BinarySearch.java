import java.util.Scanner;
public class BinarySearch
{
   public static void main(String[] args)
   { 
      int[] array = {15, 20, 25, 30, 35, 40};
      System.out.print("enter a number: ");
      Scanner kb = new Scanner(System.in);
      int target = kb.nextInt();
      int found = binarySearch(array, target);
      if(found == -1)
         System.out.println(target + " is not in the array");
      else
         System.out.println(target + " is at position " + found);
   }
   public static int binarySearch(int[] array, int target)
   {
      int first = 0;
      int last = array.length -1;
      int mid;
      while(first<=last)
      {
         mid = (first+last)/2;
         if(target == array[mid])
            return mid;
         if(target < array[mid])
            last = mid - 1;
         else
            first = mid+1;
      }
      return -1;
    }
}   
