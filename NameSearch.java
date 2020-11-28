import java.util.Scanner;
import java.io.*;
public class NameSearch
{ 

   public static void main(String[] args) throws IOException
   {
      final int SIZE = 200;
      String[] boyNames = new String[SIZE];
      String[] girlNames = new String[SIZE];
      getNamesFromFile(boyNames, "BoyNames.txt");
      getNamesFromFile(girlNames, "GirlNames.txt");
      Scanner kb = new Scanner(System.in);
      System.out.print("enter a name (blank line to stop): ");
      String name = kb.nextLine();
      while (!name.equals(""))
      {
         displaySearchResults(name, boyNames, girlNames);
          System.out.print("enter a name (blank line to stop): ");
          name = kb.nextLine();
      }
   }
    public static void getNamesFromFile(String[] array, String filename)throws IOException
   { 
      File file = new File(filename);
      if(!file.exists())
      {
         System.out.println("file not foud");
         System.exit(0);
      }
      Scanner inputFile = new Scanner(file);
      for(int i=0; inputFile.hasNext() && i<array.length; i++)
         array[i] = inputFile.nextLine();
      inputFile.close();
   }
   public static int sequentialSearch(String[] array, String value)
   {
      for(int i=0; i<array.length; i++)
      {
         if(array[i].equalsIgnoreCase(value))
            return i;
      }
      return -1;
   }
   public static void displaySearchResults(String input,String[] array1, String[] array2)
   {
      int resultBoy = sequentialSearch(array1, input);
      int resultGirl = sequentialSearch(array2, input);
     if( resultBoy != -1)
        System.out.println(input + " is a popular boy's name.");
     else if(resultGirl != -1)
        System.out.println(input +  " is a popular girl's name.");
     else 
       System.out.println(input + " is not a popular name.");
   }
}  
