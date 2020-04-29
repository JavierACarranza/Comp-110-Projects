/*Javier Carranza
  Project 2: Reads full name and reformats it even if the name has a middle name
  2/20/2020 
*/
import java.util.Scanner;
public class CarranzaJProj2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter full name: ");
      String fullName = input.nextLine();
      
      
      //Gets last name
      int firstSpaceIndex = fullName.indexOf(' ');
      String lastName = fullName.substring (0, firstSpaceIndex - 1);
      
      
      //Reformats last name
      lastName = lastName.toLowerCase();
      char firstLetter = lastName.charAt(0);
      firstLetter = Character.toUpperCase(firstLetter);
      lastName = firstLetter + lastName.substring(1);
     

      //Gets first name and middle name
      int length = fullName.length();
      int secondSpaceIndex = fullName.lastIndexOf(' ');
      String firstName = fullName.substring(firstSpaceIndex + 1, secondSpaceIndex);
      String middleName = fullName.substring (secondSpaceIndex + 1, length);
      
      
      //Reformats first name
      firstName = firstName.toLowerCase();
      firstLetter = firstName.charAt(0);
      firstLetter = Character.toUpperCase(firstLetter);
      firstName = firstLetter + firstName.substring(1);

      //Reformats middle name
      middleName = middleName.toLowerCase();
      firstLetter = middleName.charAt(0);
      firstLetter = Character.toUpperCase(firstLetter);
      middleName = firstLetter + middleName.substring(1);

     
      //Reformats full name
      fullName = firstName + " " + middleName+ " " + lastName;
      System.out.println("Full name (reformatted): " + fullName);
   
   
   }
}