// Sara Nersisian
// CS1400, section 05
// Project 7 - Text Editor
// 11/09/2020

import java.io.File;
import java.io.*;
import java.util.Scanner;

public class TextEditor
{
   public final int MAX = 100;
   private String[] lines = new String[MAX];
   private int size;

   public TextEditor( File myFile) throws IOException
   {
      Scanner inputFile = new Scanner(myFile);
      this.size=0;
      while(inputFile.hasNext())
      {
         lines[size] = inputFile.nextLine();
         size++;
      }
      inputFile.close();
   }

   public void print()
   {
      for(int i=0; i<size; i++)
         System.out.printf("%-2d  : %s\n" ,i, lines[i]);
      if(size==0)
         System.out.println("empty file");
   }

   public void find()
   {
      System.out.print("enter pattern: ");
      Scanner kb = new Scanner(System.in);
      String pattern = kb.nextLine();
      if(size==0)
         System.out.println("empty file");
      else
      {
         int position;
         for(int i=0; i<size; i++)
         {
            position = lines[i].indexOf(pattern);
            if(position!=-1)
            {
               System.out.println(i + " : " + lines[i]);
               System.out.println("position = " + position);
            }
          if(i == size-1 && position == -1)
             System.out.println("pattern not found");
         }
      }
   }

   public void replace()
   { 
      Scanner kb = new Scanner(System.in);
      System.out.print("enter old pattern: ");
      String oldPattern = kb.nextLine();
      if(size==0)
      {
          System.out.print("enter new pattern: ");
          String newPattern = kb.nextLine();
          System.out.println("empty file");
       }
      else
      {
         if(!(oldPattern.equals("")))
         {
            System.out.print("enter new pattern: ");
            String newPattern = kb.nextLine();
            int position;
            int count = 0;
            for(int i=0; i<size; i++)
            { 
               position = lines[i].indexOf(oldPattern);
               while(position!=-1)
               {
                  String starting = lines[i].substring(0, position);
                  String ending = lines[i].substring(position + oldPattern.length());
                  lines[i] = starting + newPattern +ending;
                  position =  lines[i].indexOf(oldPattern);
                  count++;
               }
               if(i == size-1 && count == 0)
               System.out.println("\"" + oldPattern + "\" is not found in the file.");
            }
            System.out.println("done");
         }
         else
            System.out.println("illegal pattern: length must be at least one");
      }
   }

   public void sort()
   {
      if(size==0)
      System.out.println("empty file");
      else
      {
         String temp;
         for(int i=0;i<size;i++)
         {
            for(int j=0;j<size;j++)
            {
               if(lines[i].compareTo(lines[j])<1)
               {
                  temp=lines[i];
                  lines[i]=lines[j];
                  lines[j]=temp;
               }
            }
         }
         System.out.println("sorted!");
      }
   }
}
