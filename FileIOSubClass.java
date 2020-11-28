import java.io.*;
import java.util.*;
public class FileIOSubClass extends FileIO
{
   @Override 
   public void fileRead(String s) throws IOException
   {  
      File myFile = new File(s);
      if(!myFile.exists())
      {
         System.out.println("ERROR: input file " + myFile 
                            + " does not exist");
         System.exit(0);
      }
      Scanner inputFile = new Scanner(myFile);
      while(inputFile.hasNext())
         System.out.println(inputFile.nextLine());
      inputFile.close(); 

   }
   public void fileRead(File myFile) throws IOException
   {
       Scanner inputFile = new Scanner(myFile);
       while(inputFile.hasNext())
          System.out.println(inputFile.nextLine());
       inputFile.close();
   }
   @Override
   public void fileWrite(String s, String[] a) throws IOException
   {
      PrintWriter outputFile = new PrintWriter(s);
      for(int i=0; i<a.length; i++)
         outputFile.println(a[i]);
      outputFile.close();

   }
}
