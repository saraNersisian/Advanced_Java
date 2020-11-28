public class PasswordVerifier
{
   private static final int MIN_PASSWORD_LENGTH = 6;
   public static boolean isValid(String str)
   {  
      if(str.length() >= MIN_PASSWORD_LENGTH &&
         hasUpperCase(str) && hasLowerCase(str) && hasDigit(str))
      return true;
    
      if(str.length() < MIN_PASSWORD_LENGTH)
         System.out.println("- length must be at least 6.");
      if(!hasUpperCase(str))
         System.out.println("- need at least one Uppercase letter.");
      if(!hasLowerCase(str))
         System.out.println("- need at least one Lowercase letter.");
      if(!hasDigit(str))
         System.out.println("- need at least a digit");     
      return false;

   }
   private static boolean hasUpperCase(String str)
   {
      for(int i=0; i<str.length(); i++)
      {
         if(Character.isUpperCase(str.charAt(i)))
            return true;
      }
      return false;
   }
   private static boolean hasLowerCase(String str)
   {
      for(int i=0; i<str.length(); i++)
      {
         if(Character.isLowerCase(str.charAt(i)))
            return true;
      }
      return false;
   }
   private static boolean hasDigit(String str)
   {
      for(int i=0; i<str.length(); i++)
      {
         if(Character.isDigit(str.charAt(i)))
            return true;
      }
      return false;
   }
}
