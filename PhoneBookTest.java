import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBookTest
{
   public static void main(String[] args)
   {
      
      String name;
      String number;
      Scanner kb = new Scanner(System.in);

      ArrayList<PhoneBookEntry>list = new ArrayList<PhoneBookEntry>();
      System.out.println("I'm going to ask you to enter 5 names and phone numbers.");
      for(int i=0; i<5; i++)
      {
         System.out.print("enter a person's name: ");
         name = kb.nextLine();
         System.out.print("enter that person's phone number: ");
         number = kb.nextLine();
         PhoneBookEntry entry = new PhoneBookEntry(name, number);  
         list.add(entry);
       }
      
      System.out.println("\nHere's the data that you entered: ");
      for( int i=0; i < 5; i++)
         System.out.println(list.get(i));
      System.out.println("\nInsert my name to the beginning of the phone book: ");
      list.add(0, new PhoneBookEntry("D Sang", "869-3469"));
      System.out.println(list);
      
      System.out.println("\nRemove the last entry: ");
      list.remove(list.size() - 1);
      System.out.println(list); 
   }
     
}
