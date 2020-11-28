public class SavingsAccount
{
   private double balance;
   private double annualInterestRate;
   public SavingsAccount (double bal, double rate)
   {
      balance = bal;
      annualInterestRate = rate;
   }
   public double getBalance()
   {
      return balance;
   }
   public double getInterestRate()
   {
      return annualInterestRate;
   }
   public void deposit( double amount)
   {
      balance +=amount;
   }
   public void withdraw(double amount)
   {
      if (balance <=amount)
         balance = 0;
      else
         balance -=amount;
   }
   public double addInterest()
   {
      double interestAmount = balance * (annualInterestRate / 12);
      balance += interestAmount;
      return interestAmount;
   }


}
