/*Javier Carranza
  Project 4:This program generates random numbers in an array, finds the minimum, maximum, average, median and finally sorts the array.
  4/21/2020 
*/ 
import java.util.*;
public class CarranzaJProj4
{
   public static void main(String[] args)
   {
      
      //Gets constants
      final int MIN_SIZE = 12;
      final int MAX_SIZE = 20;
      final int MIN_DATA = 10;
      final int MAX_DATA = 99;
      
      int [] samples = new int [MAX_SIZE];
      int sampleSize;
      
      System.out.println("Javier Carranza - Project 4: Selection Sort\n\n ");
   
      //Gets sample size between 12 and 20
      sampleSize = (int)(Math.random() * (MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE);
      System.out.printf("Sample Size = %d\n", sampleSize);
      
      //Populate array randomly between 10 and 99
      for(int i= 0; i < sampleSize; i++)
         samples [i] = (int)(Math.random() * (MAX_DATA - MIN_DATA + 1)+ MIN_DATA);
      
      JCprintSamples (samples, sampleSize);
      
      //Prints out everything from the methods
      System.out.printf("Minimum = %d\n", JCsampleMin (samples, sampleSize));
      System.out.printf("Maximum = %d\n", JCsampleMax (samples, sampleSize));
      JCselectionSort(samples, sampleSize);
      System.out.printf("Average = %d\n", JCaverage (samples, sampleSize));
      System.out.printf("Median = %d\n", JCmedian (samples, sampleSize));
      
      System.out.printf ("\nJavier Carranza - End of project 4\n");
      
   }
   //Prints the original array unsorted
   static int JCprintSamples(int samples[], int sampleSize)
   {
    
      int print = samples[0];
    
      for (int i = 0; i < sampleSize; i++)
         System.out.print(samples[i]+ " ");
    
      System.out.println();
    
      return print;
   
   }
   //Finds the minimum value in the array
   static int JCsampleMin(int samples [],int sampleSize)
   {
      int min = samples[0];
      
      for (int i = 1; i < sampleSize; i++)
         if (min > samples [i])
            min = samples [i];
      
      return min;
   } 
   //Finds the maximum value in the array
   static int JCsampleMax(int samples [],int sampleSize)
   {
      int max = samples[0];
     
      for (int i = 1; i < sampleSize; i++)
         if (max < samples [i])
            max = samples [i];
     
      return max;
   }
   //Uses selection sort method in order to sort the array
   static void JCselectionSort(int samples [],int sampleSize)
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
         JCprintSamples(samples, sampleSize);
      }
    
   } 
   // Finds the average value in the sorted array
   static int JCaverage(int samples [],int sampleSize)
   {
      int sum = 0;
      
      for (int i = 0; i < sampleSize; i++)
         sum += samples[i];
         
      int JCaverage = sum/sampleSize; 
        
      return JCaverage; 
   }
   //Finds median of the sorted array
   static int JCmedian(int samples [],int sampleSize)
   {
      int JCmedian = 0;
      if(sampleSize % 2 != 0)
      {
         JCmedian = samples[sampleSize/2];
      }else{
         JCmedian = samples[sampleSize/2]+samples[sampleSize/2-1]/2;
      }
      return JCmedian;
   }
}