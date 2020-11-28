//Sara Nersisian
//CS1400 - section 05
//Practice 2
//09/03/2020

import java.util.Scanner;


public class VendingMachine
{
   public static void main(String [] args)
   {
      int price;
      int quarters;
      int dimes;
      int nickels;
      int change;

      Scanner scnr = new Scanner(System.in);
  
      System.out.print("Enter price of the item \n(from 25 cents to a dollar, in 5-cent increments): " );
      price = scnr.nextInt();
   
      if(price == 1)
        //System.out.println("There is NO change remaining.");
           price = 100;
         
      change = 100 - price;
      quarters = change / 25 ;
      dimes = (change % 25) / 10;
      nickels = (change % 25) / 5;
        

      System.out.println("You bought an item for " + price + " cents and gave me a dollar,\nso you change is \n" +
                          quarters + " quarters,\n" +
                          dimes + " dimes, and\n" +
                          nickels + " nickels.");                       
                        




   }
}
