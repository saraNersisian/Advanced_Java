import java.text.DecimalFormat;
import java.util.Scanner;
public class SavingsAccountTest
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      double annualRate;
      double rate;
      double totalRate=0;
      double startingBalance;
      double deposits;
      double totalDeposits=0;
      double withdraws=0;
      double totalWithdraws=0;
      int numOfMonths;
      DecimalFormat dollar = new DecimalFormat("#,###.00");
      System.out.print("Enter the savings account's starting balance: ");
      startingBalance = kb.nextDouble();
      System.out.print("Enter the savings account's annual interest rate: ");
      annualRate = kb.nextDouble();
      System.out.print("How many months have passed since the account was opened? ");
      numOfMonths = kb.nextInt();
      SavingsAccount account = new SavingsAccount(startingBalance, annualRate); 
      for (int i=1; i <= numOfMonths; i++)
         {
            System.out.print("Enter the amount deposited during month " + i + ": ");
            deposits = kb.nextDouble();
            account.deposit(deposits);
            totalDeposits +=deposits;
            System.out.print("Enter the amount withdrawn during month " + i + ": ");
            withdraws = kb.nextDouble();
            account.withdraw(withdraws);
            totalWithdraws += withdraws;
            rate= account.addInterest();
            totalRate += rate; 
         }
      System.out.print("Total deposited: $" + dollar.format(totalDeposits));
      System.out.print("\nTotal withdrawn: $" + dollar.format(totalWithdraws));
      System.out.print("\nInterest earned: $" + dollar.format(totalRate));
      System.out.println("\nEnding balance: $" + dollar.format(account.getBalance())); 
   }
}
