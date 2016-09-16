package com.Model;
import com.Utility.Utility;
import java.util.Scanner;

class Stopwatch
  {
    public static void main(String args[])
    {
     long start;
     long endtime;
     long ellapsed;
      
      //Stop watch Starts
      System.out.println("Time ellapsed Count Starts from here");
     
      start= System.currentTimeMillis();
      System.out.println("Stop watch Starts from here :-"+ start);

      //Stop watch Ends
      
      endtime= System.currentTimeMillis();
    
      System.out.println("stop watch finish here  :-" +endtime);   
 
      //Time ellapsed from start time to End time
      ellapsed=endtime-start;
      System.out.println(ellapsed);

           

     }
  }

   
  
 
