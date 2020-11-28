//Sara Nersisian
//CS1400, section 05
//Project 2 - calculation on integers and strings
//09/03/2020


import java.util.Scanner;


public class KeyboardInput
{
   public static void main(String [] args)
   {
      String name;    
      int age;
      String companyName;
      double annualSalary;

      Scanner scnr = new Scanner(System.in);

      System.out.print("Please enter you name: ");
      name = scnr.nextLine();
      System.out.print("Please enter your age: ");
      age = scnr.nextInt();
      System.out.print("Please the name of the company you wish to work: ");
      scnr.nextLine();    
      companyName = scnr.nextLine();
      System.out.print("Please enter you annual salary: ");
      annualSalary = scnr.nextDouble();

      System.out.println("My name is " + name + ", my age is " + age + 
                         " and \nI hope to work for " + companyName +
                         " and earn $" + annualSalary + " per year.");





   }
}
