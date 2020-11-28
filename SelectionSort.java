import java.util.*;
import java.io.*;
public class SelectionSort
{
   public static void main(String[] args) throws IOException
   {
      final int SIZE = 100;
      int counter=0;
      int[] array = new int[SIZE];
      File file = new File("data.txt");
      if(!file.exists())
      {
         System.out.println("file not found.");
         System.exit(0);
      }
      Scanner inputFile = new Scanner(file);
      
      while(inputFile.hasNext() && counter< array.length)
      {
         array[counter] = inputFile.nextInt();
         counter++;
      }
      inputFile.close();
      selectionSort(array, counter);
      outputData(array, counter);
      System.out.println("Done!");
   }
   public static void selectionSort(int[] array, int counter)
   {
      int minIndex, temp;
      for(int i=0; i< counter-1; i++)
      {
         minIndex=i;
         for(int j=i+1; j<counter; j++)
         {
            if(array[j]<array[minIndex])
               minIndex = j;
         }
         temp = array[i];
         array[i]=array[minIndex];
         array[minIndex]=temp;
      }
   }
   public static void outputData(int[] array, int counter) throws IOException
   {
      PrintWriter outputFile = new PrintWriter("data.out");
      for(int i=0; i<counter; i++)
       {
           if(i%10==0 && i>0 )
              outputFile.println();
           outputFile.printf("%-9d",array[i] );
      }
      outputFile.close();
   }
}
