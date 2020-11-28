public class MonthTest
{
   public static void main(String[] args)
   {
      try
      {
         Month m1 = new Month(10);
         System.out.println("The month you just created is " + m1);
         Month m2 = new Month(25);
         System.out.println("The month you just created is " + m2);
        // Month m3 = new Month("March");
        // Month m4 = new Month("Septober");
      }
      catch (InvalidMonthNumberException  e)
      {
         System.out.println(e.getMessage());
      }
      try
      {
         Month m3 = new Month("March");
         System.out.println("The month you just created is " + m3);
         Month m4 = new Month("Septober");
         System.out.println("The month you just created is " + m4);

      } 
      catch ( InvalidMonthNameException e)
      {
         System.out.println(e.getMessage());
      }

   }
}
