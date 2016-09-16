/*
  file name:PowerTable.java
  Created by:Bhushan Ranjane
  Create Date:-24-08-2016
  Purpose:To show the Power Table of 2
*/
package com.Model;
import com.Utility.Utility;
import java.util.Scanner;

 class PowerTable
  {
   public static void main(String args[])
    {
     Utility u=new Utility();
     Scanner sc=new Scanner(System.in);
     int no;
     System.out.println("Enter the no power of 2");
     no=sc.nextInt();
     
     if(u.validateNO(no))
 
     //if validation return true
     {
      u.powerTable(no);
     }
     else
      {
        System.out.println("power should be in a range 1-31");
      }
    }
   }
