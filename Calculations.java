// Sara Nersisian
// CS1400, section 05
// Project 2 - calculations on integeres and strings


import java.util.Scanner;


public class Calculations
{
   public static void main(String [] args)
   {
      int num1;
      int num2;
      String str1;
      String str2;
      
      Scanner scnr = new Scanner(System.in);

      System.out.print("Enter a number: ");
      num1 = scnr.nextInt();
      System.out.print("Enter a second number: ");
      num2 = scnr.nextInt();
      System.out.print("Enter a string: ");
      scnr.nextLine();
      str1 = scnr.nextLine();
      System.out.print("Enter a second string: ");
      str2 = scnr.nextLine(); 
      
      int lastChar1 = str1.length() - 1;
      int lastChar2 = str2.length() - 1;

      System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
      System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
      System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
      System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
      System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
      System.out.println(num1 + " / " + num2 + " = " + ((num1 + 0.0) / (num2 + 0.0)) );
      System.out.println("First word, uppercase: " + str1.toUpperCase());
      System.out.println("Second word, lowercase: " + str2.toLowerCase());
      System.out.println("First characters: " + str1.charAt(0) + " and  " + str2.charAt(0));
      System.out.println("Last characters: " + str1.charAt(lastChar1) + " and " + str2.charAt(lastChar2) ) ;
      
   }
}
