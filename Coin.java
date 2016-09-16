/*
  file name:Coin.java
  Created by:Bhushan Ranjane
  Create Date:-24-08-2016
  Purpose:Flip a coin to count the number of heads vs tails
*/
package com.Model;
import com.Utility.Utility;
import java .util.Scanner;

class Coin
 {
	public static void main(String args[])
		{  
			Utility u=new Utility();
			int no;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no of times coin to be flipped");
			no=sc.nextInt();
 
			if(no>0)
				{
					//number is positive call countheadtail function
					//to count percentage of head and tail
					u.countHeadTail(no);
				}
			else
				{
					// if user enters 0 or any negative number
					System.out.println("Enter the positive number");
				}
		}
 }
