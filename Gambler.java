/*
  file name:Gambler.java
  Created by:Bhushan Ranjane
  Create Date:-25-08-2016
  Purpose:To show how many time Gambler wins or loses
*/
package com.Model;
import com.Utility.Utility;
import java.util.Scanner;

   class Gambler
    {
     public static void main(String args[])
     { 
       int stakes;
       int goal;
       int number;
       Utility u=new Utility();
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter the stakes");
       stakes=sc.nextInt();
    
       System.out.println("Enter the goal");
       goal=sc.nextInt();
  
       System.out.println("Enter the Number of times");
       number=sc.nextInt();
			 //Shows the Gambler position wheather he wins or loss
       u.gamblegame(stakes,goal,number);

       }
     }
