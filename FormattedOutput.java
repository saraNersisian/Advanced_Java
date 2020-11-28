//Sara Nersisian
//CS1400 - fromatted output
//09/10/2020


public class FormattedOutput
{
   public static void main(String [] args)
   {
      String str1 = "Student:";
      String name = "\"Sara Nersisian\"";
      String str2 = "Major:";
      String major = "\\Computer Science\\";
      String str3 =  "Study List:";
      String classes = " CS \'1260\' and CS \'1400\' and CS \'3010\' ";

      System.out.printf("%-12s%-30s\n", str1,name);
      System.out.printf("%-12s%-30s\n", str2,major);
      System.out.printf("%-12s%-30s\n", str3,classes);

   }

}
