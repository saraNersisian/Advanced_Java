public class BankAccount
{
   private double balance;

   public BankAccount()
   {
      balance = 0.0;
   }
   public BankAccount(double startBalance)
                     throws NegativeStartingBalanceException
   {
      if (startBalance < 0)
         throw new NegativeStartingBalanceException(startBalance);         
      balance = startBalance;
   }
   public void setBalance(double b)
   {
      balance = b;
   }
   public double getBalance()
   {
      return balance;
   }
   public void deposit(double amount)
                       throws NegativeDepositException
   {
      if(amount < 0)
         throw new NegativeDepositException(amount);
      balance += amount;
   }
   public void withdraw(double amount)
                       throws WithdrawExceedBalanceException,
                              NegativeWithdrawException
   {
      if(amount < 0)
         throw new NegativeWithdrawException(amount);
      if(amount > balance)
         {
            amount = balance - amount;
            throw new WithdrawExceedBalanceException(amount);
         }
      balance -= amount;
   }
   public String toString()
   {
      return "balance = $" + balance;
   }
}
