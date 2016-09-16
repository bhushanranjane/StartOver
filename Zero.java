package com.Model;
import com.Utility.Utility;
import java.util.Scanner;

  class Zero
   {
    public static void main(String args[])
     {
      int no;
      int i;
      Utility u=new Utility();
      Scanner sc=new Scanner(System.in);
       //enter total elements
      System.out.println("Enter the no of integers");
      no=sc.nextInt();
      
       //list to Store Array
       int list[]=new int[no];
    	System.out.println("Enter the elements");
        
        //adding elements in array
         for(i=0;i<no;i++)
          {
           list[i]=sc.nextInt();
          }
        //return list;
      
          u.triplet(list,no);


     
     }
   }
      
