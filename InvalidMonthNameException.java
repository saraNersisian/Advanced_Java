public class InvalidMonthNameException extends Exception
{
   public InvalidMonthNameException()
   {
      super("Error - Invalid name given for the month");
   }
   public InvalidMonthNameException(String name)
   {
      super("Error - Invalid name given for the month: " + name);
   }
}
