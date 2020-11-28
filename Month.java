public class Month
{
   private int monthNumber;
   public Month (int num) throws InvalidMonthNumberException       
   {
      if(num < 1 || num > 12)
         throw new InvalidMonthNumberException(num);
      monthNumber = num;
   }
   public Month (String name) throws InvalidMonthNameException
   {
      name = name.toLowerCase();
      switch(name)
      {
         case "januaray" :
            monthNumber = 1;
            break;
         case "february":
            monthNumber = 2;
            break;
         case "march":
            monthNumber = 3;
            break;
         case "april":
            monthNumber = 4;
            break;
         case "may":
            monthNumber = 5;
            break;
         case "june":
            monthNumber = 6;
            break;
         case "july":
            monthNumber = 7;
            break;
         case "august":
            monthNumber = 8;
            break;
         case "september":
            monthNumber = 9;
            break;
         case "october":
            monthNumber = 10;
            break;
         case "november":
            monthNumber = 11;
            break;
         case "december":
            monthNumber = 12;
            break;
         default:
            throw new InvalidMonthNameException(name);
      }
   }
   @Override
   public String toString()
   {
      switch(monthNumber)
      {
         case 1: return "January";
         case 2: return "Feburary";
         case 3: return "March";
         case 4: return "April";
         case 5: return "May";
         case 6: return "June";
         case 7: return "July";
         case 8: return "August";
         case 9: return "September";
         case 10: return "October";
         case 11: return "November";
         case 12: return "December";
         default: return "Unknown";
      }
   }
}
