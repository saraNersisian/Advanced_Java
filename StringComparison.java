//Sara Nersisian
//Cs 1400 - String Comparioson
//09/10/2020

import java.util.Scanner;

public class StringComparison
{
   public static void main(String[] args)
   {  
      String name1;
      String name2;
      String name3;
      
      Scanner scnr = new Scanner(System.in);
     
      System.out.println("Please enter three strings:");
      name1 = scnr.nextLine();
      name2 = scnr.nextLine();
      name3 = scnr.nextLine();
      
      System.out.println("The inputs in sorted order are:");
      
      String first;
      String second;
      String third;
   
      if ((name1.compareTo(name2) < 0) && (name1.compareTo(name3) < 0))
      {  if ( name2.compareTo(name3) < 0 )
         {  
            first = name1;
            second = name2;
            third = name3;
         }

         else
         {
            first = name1;
            second = name3;
            third = name2;
         }
       }

      else if (name2.compareTo(name3) < 0)
      { 
             if(name3.compareTo(name1) < 0)   
             {   
                first = name2;
                second = name3;
                third = name1;
             }
             
             else 
             {
                first = name2;
                second = name1;
                third = name3;
             }
      }
      else
      {  
         first = name3;

         if(name1.compareTo(name2) < 0)
         { 
            second = name1;
            third = name2;
         }
         
         else 
         {
            second = name2;
            third = name1;
         }
      }
     
      System.out.println(first);
      System.out.println(second);
      System.out.println(third);


 
   }

}
