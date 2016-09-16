/*
  file name:Leapyear.java
  Created by:Bhushan Ranjane
  Create Date:-24-08-2016
  Purpose:To take user input and replace user name
*/
package com.Model;
import com.Utility.Utility;
import java.util.Scanner;
  
class Leapyear
	{
		public static void main(String args[])
			{

				int Year;
				Scanner sc=new Scanner(System.in); 
				System.out.println("Enter the year in Digits");
				Year=sc.nextInt();
				// cast integer to String to count length
				int length=Integer.toString(Year).length();
				System.out.println("Years length:"+length);
				//year length Should be equal to 4
				if(length==4)
				{
					//Mod4 of year should be 0		
					if((Year%4)==0)
					{
					System.out.println("Leap Year");
					}
					//if mod is not 0 then it is not a leap year
					else
					{
					System.out.println("Not a Leap Year");
					}
				}
				else
				{
				System.out.println("enter the year in 4 Digits only");
				}



			}
	}


