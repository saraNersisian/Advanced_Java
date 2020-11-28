import java.util.Scanner;
public class WordReplacementWithMethod
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("enter a line of text(blank line to stop): ");
      String string1 = kb.nextLine();
      while(!(string1.equals("")))
      {
         System.out.print("enter a substring to be replaced: ");
         String string2 = kb.nextLine();
         System.out.print("enter the new substring: ");
         String string3 = kb.nextLine();
         int position = string1.indexOf(string2);
         if(position== -1)
            System.out.println("\"" + string2 + "\" is not found.");
         else
         {
            string1=replaceSubstring(string1, string2, string3);
            System.out.println("I have rephrased that line to read: ");
            System.out.println(string1);
            System.exit(0);
         } 
            System.out.println("\nenter another line (blank to stop): ");
            string1=kb.nextLine();
       }

   }
   public static String replaceSubstring(String string1, String string2, String string3)
   {
       int pos = string1.indexOf(string2);
       String starting = string1.substring(0,pos);
       String ending = string1.substring(pos + string2.length());
       string1=starting + string3 + ending;
       return string1;
   }
}
