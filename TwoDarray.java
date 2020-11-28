public class TwoDarray
{
   public static int getTotal(int[][] a)
   {
      int total=0;
      for(int row=0; row < a.length; row++)
      {
         for(int col=0; col < a[row].length; col++)
          total+=a[row][col];
      }
      return total;
   }
   public static double getAverage(int[][] a)
   {
      return (getTotal(a)/ 6.0);
   }
   public static int getRowTotal(int[][] a, int row)
   {
      int rowT=0;
      for(int i=0; i < a[row].length; i++)
          rowT+=a[row][i];
      return rowT;
   }
   public static int getColumnTotal(int[][] a, int col)
   {
      int colT=0;
      for(int i=0; i < a.length; i++)
          colT+=a[i][col];
      return colT;
   }
   public static int getHighestInRow(int[][] a, int row)
   {
      int max=a[row][0];
      for(int i=0; i < 3; i++)
      {
         if(a[row][i] > max)
            max = a[row][i];
      }
      return max;

   }
   public static int getLowestInColumn(int[][] a, int col)
   {
       int min=a[0][col];
      for(int i=0; i < 2; i++)
      {
         if( a[i][col] < min)
            min = a[i][col];
      }
      return min;
   }
}
