/*Javier Carranza
  Project 5:This program generates random numbers in an array, finds the minimum, maximum, average, median and finally sorts the array similar to Project 4 but now its an OOP.
  5/4/2020 
*/
import java.util.*;
public class CarranzaJProj5
{
   public static void main(String[] args)
   {
      //Calls class
      JCSelectionSort JCClass = new JCSelectionSort();
      
      System.out.printf("Javier Carranza - Project 5: Selection Sort\n\n");
      
      //Prints array size and values
      System.out.printf("Data size: %d\n", JCClass.getArraySize());
      
      //Prints out everything from the class below
      System.out.printf("Data:\n");
      JCClass.printSamples();
      System.out.printf("Minimum = %d\n", JCClass.samplesMin ());
      System.out.printf("Maximum = %d\n", JCClass.samplesMax ());
      JCClass.selectionSort();
      System.out.printf("Average = %d\n", JCClass.average ());
      System.out.printf("Median = %d\n", JCClass.median ());
      
      System.out.printf ("\nJavier Carranza - End of project 5\n");
   
   }  
}
//---------------------------------------------------------------------------------------
class JCSelectionSort
{
   //Gets Constants and gets limits for array size
   final int MIN_SIZE = 12;
   final int MAX_SIZE = 20;
   final int MIN_DATA = 10;
   final int MAX_DATA = 99;
   
   private int [] samples = new int [MAX_SIZE];
   private int sampleSize;
   
      
//---------------------------------------------------------------------------------------
   //Gets the array size and values of the array
   int getArraySize()
   {
    //Gets sample size between 12 and 20
      sampleSize = (int)(Math.random() * (MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE);
      
    //Populate array randomly between 10 and 99
      for(int i= 0; i < sampleSize; i++)
         samples [i] = (int)(Math.random() * (MAX_DATA - MIN_DATA + 1)+ MIN_DATA);
   
      return sampleSize;
   }
//---------------------------------------------------------------------------------------
   //Prints the unsorted array
   void printSamples()
   {
      for (int i = 0; i < sampleSize; i++)
         System.out.printf("%3d", samples [i]);
      System.out.printf("\n");
   }   
//---------------------------------------------------------------------------------------
   //Gets the minimum value in the array
   int samplesMin()
   {
      int min = samples[0];
      
      for (int i = 1; i < sampleSize; i++)
         if (min > samples [i])
            min = samples [i];
     
      return min;
   }
//---------------------------------------------------------------------------------------
   //Gets the maximum value of the array
   int samplesMax ()
   {
      int max = samples[0];
     
      for (int i = 1; i < sampleSize; i++)
         if (max < samples [i])
            max = samples [i];
      
      return max;
   }
//---------------------------------------------------------------------------------------
   //Sorts the Unsorted array
   void selectionSort()
   {
      for (int i = 0; i < sampleSize; i++)
      {
         int currentMin = samples[i];
         int currentMinIndex = i;
      
      
         for(int j = i + 1; j < sampleSize; j++)
         {
            if (currentMin > samples[j])
            {
               currentMin = samples[j];
               currentMinIndex = j;
            }
         }
         if(currentMinIndex != i)
         {
            samples[currentMinIndex] = samples[i];
         
            samples[i] = currentMin;
         }
         printSamples();
      }
   }
//---------------------------------------------------------------------------------------
   //Finds the average of the sorted array
   int average()
   {
      int sum = 0;
      
      for (int i = 0; i < sampleSize; i++)
         sum += samples[i];
         
      int average = sum/sampleSize; 
      
      return average;
   }
//---------------------------------------------------------------------------------------
   //Finds the Median of the sorted array
   int median()
   {
      int median = 0;
      if(sampleSize % 2 != 0)
      {
         median = samples[sampleSize/2];
      }else{
         median = samples[sampleSize/2]+samples[sampleSize/2-1]/2;
      }
      
      return median;
   }
}