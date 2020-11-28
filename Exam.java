//analysis of examination results

import java.util.Scanner;

public class Exam
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int passes = 0, failures = 0, students = 0, result;

      for(int i=0; i < 10; i++)
      {
         System.out.print("Enter result (1=pass, 0=fail): ");
         result = keyboard.nextInt();
         while (result != 0 &&  result != 1)
         {   System.out.println("Invalid input! Try again.");
             result = keyboard.nextInt();
         }
         
         if (result==1)
            passes++;
         else
            failures++;
         students++;
      }
      System.out.println(passes + " passed\n"
                         + failures + " failed");

      if (passes < 5)
         System.out.println("Raise tuition");

   }
}
