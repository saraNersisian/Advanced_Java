import java.util.*;
public class Lottery
{ 
   public static void main(String[] args)
   {
      int [] lotteryNumber = generateLotteryNumbers();
      int [] userNumber;
      Scanner kb = new Scanner(System.in);
      System.out.println("Welcome...");
      System.out.println("1. enter your own lottery number");
      System.out.println("2. get a computer-generated lottery number");
      System.out.print("your choice : ");
      int choice = kb.nextInt();
      if ( choice ==2)
         userNumber = generateLotteryNumbers();
      else
      {
         userNumber = new int[5];
         System.out.println("enter 5 single-dgit numbers, seperated by space: ");
         for(int i=0; i<userNumber.length; i++)
            userNumber[i] = kb.nextInt();
      }
      System.out.println("The lottery number is: \t ");
      for(int val: lotteryNumber)
         System.out.print(val + " ");
      System.out.println("\nYour number is : \t");
      for(int val: userNumber)
         System.out.print(val + " ");
      System.out.printf("\nThere are %d matching digits. \n",
                        compareNumbers(lotteryNumber, userNumber));
   } 

   public static int[] generateLotteryNumbers()
   {
      int[] lottery = new int[5];
      Random rd = new Random();
      for( int i=0; i<lottery.length; i++)
         lottery[i] = rd.nextInt(10);
      return lottery;
   }
   public static int compareNumbers(int[] lottery, int[] picks)
   {
      int count = 0;
      for( int i=0; i<lottery.length; i++)
        if(lottery[i]==picks[i])
            count++;
      return count;
   }
}
