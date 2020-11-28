// Sara Nersisian
// CS1400, section 05
// Project 7 - Text Editor
// 11/09/2020

import java.io.File;
import java.io.*;
import java.util.Scanner;

public class TextEditorDemo
{
   public static void main(String[] args) throws IOException
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("enter a file name: ");
      String filename = kb.nextLine();
      File myFile = new File(filename);
      if(!myFile.exists())
      {
         System.out.println("input file does not exist!");
         System.exit(0);
      }
      char choice = menu();
      TextEditor text = new TextEditor(myFile);
      while(choice!='q')
      {
         switch(choice)
         {
            case 'p':
               text.print();
               break;
            case 'f':
               text.find();
               break;
            case 'r':
               text.replace();
               break;
            case 's':
               text.sort();
               break; 
            default:
               System.out.println("Invalid choice!");
          }
          choice = menu();
      }
      System.out.println("bye");
      System.exit(0);

   }
   public static char menu()
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("\n[p]rint input file with line numbers"
                       + "\n[f]ind the leftmost occurrences of pattern for all lines"
                       + "\n[r]eplace all occurances of old by new"
                       + "\n[s]ort the input file"
                       + "\n[q]uit the editor");
     System.out.print("Your choice: ");
     char choice = kb.nextLine().charAt(0);
     return choice;
   }
}
