public class InvalidMonthNumberException extends Exception
{
   public InvalidMonthNumberException()
   {
      super("Error - Invalid number given for the month");
   }
   public InvalidMonthNumberException(int num)
   {
      super("Error - Invalid number given for the month: " + num);
   }
}
