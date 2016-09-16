package com.Model;
 
import java.util.Scanner;


  class Stock
   {
     public static void main(String args[])
     {
       int no,i;
       Scanner sc=new Scanner(System.in);
       //Getting no of stocks
       System.out.println("Enter the number of stocks");
       no=sc.nextInt();

       //create an array of Portfolio class
 
       Portfolio pf[]=new Portfolio[no];

       //getting the Stock details

         for(i=0;i<no;i++)
          {
            System.out.println("enter the "+(i+1)+" Stock Details ");
          	//creating objects for each stock
	  		 pf[i]=new Portfolio();
	  	  } 
	   //displaying report for all stock
	      System.out.println("Stock Report:");
	    System.out.println("numberofstock \t name \t share \t price \t totalValue");
	for(i=0;i<no;i++)
	{
			pf[i].displayReport();
	}
}
}
  
      

   
