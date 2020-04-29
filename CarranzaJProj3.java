/*Javier Carranza
  Project 3: This program will get a random number between 11 and 31 and will make an upside down triangle and a right side up triangle based on the number generated.
  3/06/2020 
*/
import java.util.*;
public class CarranzaJProj3
{
   public static void main(String[] args)
   {
      System.out.println("Javier Carranza - Project 3 ");
   
      //Gets random number between 11 and 31
      int n = 11 + (int)(Math.random() * 21);
      
      
      //Makes the random number odd, instantiates char and also prints out the random integer generated
      if (n % 2 == 0) n++;
      char a = 0;
      System.out.println(n);
      
      //Calls methods and uses parameters given
      JCPrintUpperTriangle(n,a);
      JCPrintMiddleline(n,a);
      JCPrintLowerTriangle(n,a);
   
      System.out.println("Javier Carranza - Project 3 ");

   } 
   //Prints the UpperTriangle
   public static void JCPrintUpperTriangle(int numOfLines, char ch)
   {
      for (int i = 0; i < numOfLines / 2; i++)
      {
         for (int j = 0; j < numOfLines-i; j++)
         {
            System.out.print("  ");
         }
         for (int j = 0; j <= i; j++)
         {
            System.out.print("J ");
         }
         for (int j = 1; j <= i; j++)
         {
            System.out.print("J ");
         }
         System.out.println();
      }
   
      
      
   }
   //Prints the middle line to separate the upper triangle from the lower triangle
   public static void JCPrintMiddleline(int numOfLines, char ch)
   {
      for (int i = 0; i < 1; i++)
      {
         for (int j = 0; j <= numOfLines/2; j++)
         {
            System.out.print("  ");
         }
         
         for (int l = 0; l < numOfLines  ; l++)
         {
            System.out.print("=");
         }
         for (int l = 0; l < numOfLines ; l++)
         {
            System.out.print("=");
         }

      }
      System.out.println();
   }
   //Prints the lower upside down triangle
   public static void JCPrintLowerTriangle(int numOfLines, char ch)
   {
      for(int i = numOfLines / 2; i>=0 ; i--)
      {
         for(int j=0; j <= numOfLines - i; j++)
         {
            System.out.print("  ");
         }
            
         for (int j = 0; j < i; j++)
         {
            System.out.print("C ");
         }
         for (int j = 1; j < i; j++)
         {
            System.out.print("C ");
         }

         System.out.println();
      }
   
   } 
}
