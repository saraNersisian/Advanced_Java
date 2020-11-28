public class NegativeDepositException extends Exception
{
   public NegativeDepositException()
   {
      super("Error: Negative deposited amount");
   }
   public NegativeDepositException(double amount)
   {
      super("Error: Negative deposited amount of $" + amount );
   }
}
