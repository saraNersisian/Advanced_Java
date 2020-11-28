import java.io.*;
public class TwoDarrayTest
{
   public static void main(String[] args)
   {
      int[][] array = {{2, 1, 9}, {7, 3, 4}};
      System.out.println("Processing the int array.");
      TwoDarray a = new TwoDarray();
     
      System.out.println("Total: " + a.getTotal(array));
      System.out.println("Average: " + a.getAverage(array));
      System.out.println("Total of row 0: " + a.getRowTotal(array,0));
      System.out.println("Total of row 1: " + a.getRowTotal(array,1));
      System.out.println("Total of col 0: " + a.getColumnTotal(array,0));
      System.out.println("Total of col 2: " + a.getColumnTotal(array,2));
      System.out.println("Highest in row 0: " + a.getHighestInRow(array,0));
      System.out.println("Highest in row 1: " + a.getHighestInRow(array,1));
      System.out.println("Lowest in col 0: " + a.getLowestInColumn(array,0));
      System.out.println("Lowest in col 1: " + a.getLowestInColumn(array,1));
   }
}  
       
