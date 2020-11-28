public class AccountTest
{
   public static void main(String [] args)
   { 
       System.out.println("\nTesting NegativeStartingBalanceException ...");
      for (int i=-100; i<500; i+=200)
      {
         try
         {
            BankAccount account = new BankAccount(i);
            System.out.println("account created with  " + account);
         }
         catch (NegativeStartingBalanceException  e )
         {
            System.out.println(e.getMessage());
         }
      }
      System.out.println("\nTesting NegativeDepositException...");
      for (int i=-100; i<500; i+=200)
      {
         try
         {
            BankAccount account1 = new BankAccount();
            System.out.println("Starting  " + account1);
            account1.deposit(i);
            System.out.println("After a successful deposit, " +  account1);
         }
         catch (NegativeDepositException e )
         {
            System.out.println(e.getMessage());
         }
      }
       System.out.println("\nTesting NegativeWithdrawException "
                          + "and WithdrawExceedBalanceException...");
      for (int i=-100; i<500; i+=200)
      {
         try
         {
            BankAccount account2 = new BankAccount(200);
            System.out.println("Starting  " + account2);
            account2.withdraw(i);
            System.out.println("After a successful withdraw, " + account2);
         }
         catch (NegativeWithdrawException | WithdrawExceedBalanceException 
                | NegativeStartingBalanceException e)
         { 
            System.out.println(e.getMessage());
         }
      }
      

   }
}
