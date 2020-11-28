import java.util.Scanner;
public class WordReplacement
{
   public static void main(String[] args)
   {
      
      Scanner kb = new Scanner(System.in);
      System.out.println("enter line of text (blank line to stop): ");
      String s1 = kb.nextLine();
      while (!(s1.equals("")))
      {
        // System.out.print("enter substring to be replaced: ");
        // String s2 = kb.nextLine();
         String s2 = "hate";
        // System.out.print("enter the new substring: ");
        // String s3 = kb.nextLine();
         String s3 = "love";
      
         int position = s1.indexOf(s2);
         if(position == -1)
         System.out.println("\"" + s2 + "\" is not found.");
        
         else 
         {
            String starting = s1.substring(0, position);
            String ending = s1.substring(position + s2.length());
            s1 = starting + s3 +ending;
            System.out.println("I have rephrased that line to: \n" + s1);
         }
         System.out.println("enter another line (blank line to stop): ");
         s1=kb.nextLine();


      }
   } 
}
