import java.util.Scanner;
public class PasswordTest
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("enter a password: ");
      String input = kb.nextLine();
      if(PasswordVerifier.isValid(input))
         System.out.println("Valid password.");
      else
         System.out.println("invalid password.");
   }
}
