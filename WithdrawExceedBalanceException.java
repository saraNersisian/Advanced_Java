public class WithdrawExceedBalanceException extends Exception
{
   public WithdrawExceedBalanceException()
   {
      super("Error: Withdraw exceed balance");
   }
   public WithdrawExceedBalanceException(double amount)
   {
      super("Error: Balance is short by $" + amount );
   }
}
