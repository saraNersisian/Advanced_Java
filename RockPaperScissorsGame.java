 //Sara Nersisian
//CS1400, section 05
//Project 4 - Rock, Paper, Scissors Game
//10/05/2020

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame
{
   public static void main(String[] args)
   {
      Scanner kb =new Scanner (System.in);
      String computer; // to hold computer’s choice
      String user; // to hold user’s choice
      char playAgain ='y';
      do
      { 
         do
         {
            computer = computerChoice();
            user = userChoice();
            System.out.println("The computer's choice was " + computer +"." );
            System.out.println("The user's choice was " + user +".\n" );
            determineWinner(computer, user);
         }while(user.equalsIgnoreCase(computer));
         System.out.println("\nPlay again? (y/n)");
         playAgain=kb.nextLine().charAt(0);
      } while(playAgain=='Y' || playAgain=='y');
      System.out.println("Done");
   }

   public static String computerChoice()
   {
      Random rand = new Random();
      int choice = rand.nextInt(3)+1;
    //System.out.println("random = "+ choice);
      String choiceName="";
      switch(choice)
      {
         case 1:
            choiceName = "rock";
            break;
         case 2:
            choiceName = "paper";
            break;
         case 3:
            choiceName = "scissors";
            break;
         default:
            choiceName = "invalid";
            break;
      }
      return choiceName;
   }
	
   public static String userChoice()
   {
      Scanner kb =new Scanner (System.in);
      String userChoice;
      System.out.print("Enter rock, paper, or scissors: ");
      userChoice = kb.nextLine();
      while(!isValidChoice(userChoice))
       {
         System.out.print("Invalid input, enter rock, paper, or scissors: ");
         userChoice = kb.nextLine();			
      }
      return userChoice;	
   }
	
   public static boolean isValidChoice(String choice)
   {
      if(choice.equalsIgnoreCase("rock")
         || choice.equalsIgnoreCase("paper")
         || choice.equalsIgnoreCase("scissors") )
         return true; 
      else 
         return false;
   }

   public static void determineWinner (String computer, String user) 
   {
      String winner = "";
      if (computer.equalsIgnoreCase ("rock") && user.equalsIgnoreCase  ("scissors"))
      {
          System.out.println("Rock smashes scissors.");
          winner = "computer";
      }
      if (user.equalsIgnoreCase ("rock") && computer.equalsIgnoreCase ("scissors"))
      {
         System.out.println("Rock smashes scissors.");
         winner = "user";
      }
      if (computer.equalsIgnoreCase ("scissors") && user.equalsIgnoreCase ( "paper"))
      {
         System.out.println("Scissors cut paper.");
         winner = "computer";
      }
      if (user.equalsIgnoreCase ("scissors") && computer.equalsIgnoreCase ("paper"))
      {
         System.out.println("Scissors cut paper.");
         winner = "user";
      }
      if (computer.equalsIgnoreCase ("paper") && user.equalsIgnoreCase ( "rock"))
      {
         System.out.println("Paper wraps rock.");
         winner = "computer";
      }
      if (user.equalsIgnoreCase ("paper") && computer.equalsIgnoreCase ("rock")) 
      {
         System.out.println("Paper wraps rock.");
         winner = "user"; 
      }
      if(winner.equals("computer") || winner.equals("user") )
         System.out.println("The "+ winner + " wins!");

      if (user.equalsIgnoreCase (computer))
         System.out.println("The game is tied! \nGet ready to play again...");
		
   }

}
