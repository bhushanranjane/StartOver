/*
  file name:TwoDArray.java
  Created by:Bhushan Ranjane
  Create Date:-24-08-2016
  Purpose:To Dispaly the integers in 2d Array
*/
package com.Model;

import com.Utility.Utility;
import java.util.Scanner;

 class TwoDArray
   {
    public static void main (String args[])
     {
      Utility u=new Utility();
      int row,col,i,j;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the Number of row:");
      row=sc.nextInt();
 
      System.out.println("Enter the Number of Columns");
      col=sc.nextInt();
       
      //Declare Two Dimensional Array
      int arrlist[][]=new int[row][col];

      //call to putData to insert data in array

        arrlist=u.putData(row,col);
      

      System.out.println("elements to be displayed");
       
       for(i=0;i<row;i++)
        {
         for(j=0;j<col;j++)
          {
           System.out.print(arrlist[i][j]); 
		   System.out.print("\t");
           }
           System.out.println("");
        }
    }
}
    
     
   
      
