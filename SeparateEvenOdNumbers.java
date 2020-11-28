oimport java.io.*;
import java.util.Scanner;
public class SeparateEvenOddNumbers
{
   public static void main(String[] args) throws IOException
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("enter an input filename: ");
      String inFile = kb.nextLine();
      File file = new File(inFile);

      if (!file.exits())
      {
         System.out.println("file not exist");
         System.exit(0); 
      }
      Scanner inputFile = new Scanner(file);
      
      PrintWriter evenFile = new PrintWriter(inFile + ".even");
      PrintWriter oddFile = new PrintWriter(inFile + ".odd");

      int number;
      while(inputFile.hasNext())
      {
         number = inputFile.nextInt();
         if (number % 2 ==0)
            evenFile.println(number);
         else
            oddFile.println(number);

      }
      System.out.println("Data written to "+ inFile +".even and "
                         + inFile + ".odd");
      inputFile.close();
      evenFile.close();
      oddFile.close(); 
   }
}
