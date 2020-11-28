// Sara Nersisian
// CS1400, section 05
// Project 8 - Employee Inheritance
// 11/16/2020
public class Employee
{
   private String name;
   private String number;
   private String hireDate;
   private boolean isValidEmployeeNumber(String number)
   {
      if(number.length() !=5) //validating the length
         return false;
      for(int i=0; i<3; i++) //validating the first 3 digits
      {
         if(!Character.isDigit(number.charAt(i)))  
            return false;
      }
      if(number.indexOf("-") !=3) //validating the '-' in the 3rd position
         return false;
      if(!Character.isLetter(number.charAt(4))
          && !Character.isUpperCase(number.charAt(4)))
         return false;
      return true;
   }
   public Employee()
   {
      name = "";
      number = "";
      hireDate = "";
   }
   public Employee(String name, String number, String hireDate)
   {
      this.name = name;
      if(!isValidEmployeeNumber(number))
         this.number="";
      else
         this.number = number;
      this.hireDate = hireDate;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void setNumber(String number)
   {
      if(!isValidEmployeeNumber(number))
         this.number="";
      else
         this.number = number;
      
   } 
   public void setHireDate(String hireDate)
   {
      this.hireDate = hireDate;
   }
   public String getName()
   {
      return name;
   }
   public String getNumber()
   {
      return number;
   }
   public String getHireDate()
   {
      return hireDate;
   }
   public String toString()
   {
      return "Name: " + name
             + "\nEmployee Number: "
             //the below line is chrcking if the field is empty (which means invalid format)
             + (number.length()>0 ? number: "INVALID EMPLOYEE NUMBER") 
             + "\nHire Date: " + hireDate;
   }
}
