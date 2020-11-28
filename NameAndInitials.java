//Sara Nersisian
//CS1400 - section 05
//Practice 2
//09/03/2020


public class NameAndInitials
{
   public static void main(String [] args)
   {
      String name = "Sara";
      String middle = "Malhami";
      String last = "Nersisian";   

      System.out.println("Name = " + name + " " + middle + " " + last );
      System.out.println("Initials = " + name.charAt(0) + middle.charAt(0) + last.charAt(0));
      System.out.println("Short name = " + name + " " + middle.charAt(0) + " " + last);
      System.out.println("Shorter name = " + name.charAt(0) + " " + middle.charAt(0) + " " + last);
      System.out.println("UpperCase name = " + name.toUpperCase() + " " + middle.toUpperCase() + " " + last.toUpperCase());

   }
}
 
