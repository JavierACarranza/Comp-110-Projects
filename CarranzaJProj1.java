/*Javier Carranza
  Project 1: Finding Coins and Denomination Counts : Counts how many types of money the user inputed
  2/5/2020 
*/
import java.util.Scanner;
public class CarranzaJProj1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Javier Carranza - Project 1 " + "\n");
      
      //Asks for users input and saves it to the "amount variable
      System.out.print("Enter amount in double, such as 11.56: ");
      double amount = input.nextDouble();
      
      // Gets the remaining amount by multiplying by 100 and then in order to find the one hundered dollar bills you divide it by 10000 becuase 10000 pennies make 100 dollars
      int remainingAmount = (int)(amount * 100);
      int numberOfHundreadDollars = remainingAmount / 10000;
      remainingAmount = remainingAmount % 10000;
      
      //Uses the remainder of the money that the user inputs and divides it into their appropriate label
      int numberOfFiftyDollars = remainingAmount / 5000;
      remainingAmount = remainingAmount % 5000;
      int numberOfTwentyDollars = remainingAmount / 2000;
      remainingAmount = remainingAmount % 2000;
      int numberOfTenDollars = remainingAmount / 1000;
      remainingAmount = remainingAmount % 1000;
      int numberOfFiveDollars = remainingAmount / 500;
      remainingAmount = remainingAmount % 500;
      int numberOfOneDollars = remainingAmount / 100;
      remainingAmount = remainingAmount % 100;
      int numberOfQuarters = remainingAmount / 25;
      remainingAmount = remainingAmount % 25;
      int numberOfDimes = remainingAmount / 10;
      remainingAmount = remainingAmount % 10;
      int numberOfNickels = remainingAmount / 5;
      remainingAmount = remainingAmount % 5;
      int numberOfPennies = remainingAmount;
      
      //Prints out the results of the calculations above and the end of project statement
      System.out.println("Your amount " + amount + " consists of");
      System.out.println("    " + numberOfHundreadDollars + " 100 dollars");
      System.out.println("    " + numberOfFiftyDollars + " 50 dollars");
      System.out.println("    " + numberOfTwentyDollars + " 20 dollars");
      System.out.println("    " + numberOfTenDollars + " 10 dollars");
      System.out.println("    " + numberOfFiveDollars+ " 5 dollars");
      System.out.println("    " + numberOfOneDollars + " one dollars");
      System.out.println("    " + numberOfQuarters + " quarter");
      System.out.println("    " + numberOfDimes + " dimes");
      System.out.println("    " + numberOfNickels + " nickels");
      System.out.println("    " + numberOfPennies + " pennies" + "\n");
      System.out.println("Javier Carranza - End of project 1");
   
   }
}