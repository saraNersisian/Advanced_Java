// Sara Nersisian
// CS1400, section 05
// Project 3 - determining the seasons
// 09/14/2020


import java.util.Scanner;


public class Season
{
   public static void main(String[] args)
   {
      int month;
      int day = 0;
      String season ;

      Scanner kb = new Scanner(System.in);
   
      System.out.print("enter month (1-12): "); 
      month = kb.nextInt();
      
      while( month < 1 || month > 12)
      {   
         System.out.println("Invalid month!");
         System.exit(0);
      }

      switch(month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            System.out.print("enter day (1-31): ");
            day = kb.nextInt();
               if (day < 1 || day > 31)
               {
                  System.out.println("Invalid day!");
                  System.exit(0);
               }
            break;
         case 4:
         case 6:
         case 9:
         case 11:
            System.out.print("enter day (1-30): ");
            day = kb.nextInt();
               if (day < 1 || day > 30)
               {
                  System.out.println("Invalid day!");
                  System.exit(0);
               }
            break;
         case 2:
            System.out.print("enter day (1-28): ");
            day = kb.nextInt();
               if (day < 1 || day > 28)
               {
                  System.out.println("Invalid day!");
                  System.exit(0);
               }
            break;
         default:  
            System.out.println("Invalid month!");
            System.exit(0);
         
      }
      
      
      if (month == 3 && day >= 21)
         season = "Spring";
      else if (month == 4 || month == 5)
         season = "Spring";
      else if (month == 6 && day <= 20)
         season = "Spring";
      
      else if (month == 6 && day >=21 ) 
         season = "Summer";
      else if (month == 7 || month == 8)
         season = "Summer";
      else if (month == 9 && day <=20)
         season = "Summer";
 
      else if (month == 9 && day >=21)
         season = "Fall";
      else if (month == 10 || month == 11)
         season = "Fall";
      else if (month == 12 && day <= 20)
         season = "Fall";

      else
         season = "Winter";



      System.out.println(month + "/" + day + " is in the " + season + " season.");

 
   } 
}
