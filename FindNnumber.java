/*
  file name:FindNnumber.java
  Created by:Bhushan Ranjane
  Create Date:-27-08-2016
  Purpose:To Find nth number using binary search   
*/
package com.Model;
import com.Utility.Utility;
import java.util.Scanner;

class FindNnumber
  {
   public static void main(String args[])
    {
      
      int number;
      Utility u=new Utility();
      Scanner sc=new Scanner(System.in);
  
      //Specifies the max range of the number to be entered
      System.out.println("Enter the maximum Range of the number");
      number=sc.nextInt();
     //Declaration and initialization of search
       int search[]=new int[number];  
    
     //call enter number from utility to get number entered from user
        u.enterNumber(number,search);   
     
     //call search number from utility search the number from the entered numbers
        u.searchNumber(number,search);	
      
      
     }

      
        
      
  
  
















  }
