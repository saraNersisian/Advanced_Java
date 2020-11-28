import java.util.*;
import java.io.*;
public class FileIOTest
{
   public static void main(String[] args) throws IOException
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Please enter an input file name: ");
      String inputFileName = kb.nextLine();
      System.out.println("Test fileRead(String)--");
      File myFile = new File(inputFileName);
      FileIO file1 = new FileIOSubClass();
      file1.fileRead(inputFileName);

      System.out.print("\nPlease enter an output file name: ");
      String outputFileName = kb.nextLine();
      System.out.print("enter how many lines you have to print"
                       + " to the output file: ");
      int size = kb.nextInt();
      kb.nextLine();
      String[] lines = new String[size];
      for(int i=0; i<lines.length; i++)
      {
         System.out.print("enter line " + (i+1) + ": ");
         lines[i] = kb.nextLine();
      }
      System.out.println("\nTest fileWriter -- ");
      file1.fileWrite(outputFileName, lines);
      System.out.println("check output file: " + outputFileName);

      System.out.print("\nPlease enter another input filename: ");
      String newFileName = kb.nextLine();
      File newFile = new File(newFileName);
      System.out.println("Test fileRead(File) -- ");
      ((FileIOSubClass)file1).fileRead(newFile);
   }
}
