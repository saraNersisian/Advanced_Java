public class PhoneBookEntry
{
   private String name;
   private String number;
   public PhoneBookEntry(String n,String numb)
   {
      name = n;
      number = numb;
   }  
   public void setName(String n)
   {
      name = n;
   }
   public void setNumber(String numb)
   {
      number = numb;
   }
   public String getName()
   {
      return name;
   }
    public String getNumber()
   {
      return number;
   }
   public String toString()
   {
      return ("(" + name + ", " + number + ")");
   }
}
