package com.Model;
 
import java.util.Scanner;


  class Portfolio
   {
        int n;
        String s;
       int p,t,totalValue;   
       Portfolio()
       {
       Scanner sc=new Scanner(System.in);
       //Enter the total number of Stock
       System.out.println("Enter the number of Stock");
       n=sc.nextInt();
       //Enter the Name of the Stock
       System.out.print("Stock Name :");
       s=sc.next();
       //Shows the Share value of Stock
       System.out.println("Share Prize of Stock");
       p=sc.nextInt();
       //Total Stock Value 
       System.out.print("Value of total Stock");
       t=sc.nextInt();
       //total value to the stock
       totalValue=t+p;
      
  
     }
    //method to display the report of overall stock
    public void displayReport()
      {
       System.out.println(n+"\t"+s+"\t"+p+"\t"+t+"\t"+totalValue);
      }

   }
