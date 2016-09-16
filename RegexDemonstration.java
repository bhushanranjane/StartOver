/*
  file name:RegexDemonstration.java
  Created by:Bhushan Ranjane
  Create Date:-08-09-2016
  Purpose:To Replace the string in a file using Regular Expression
*/

package com.Utility;

import java.util.Scanner;
import java.util.Date;

public class RegexDemonstration
	{
		public static void main(String args[])
			{
				Utility u=new Utility();
				UserDetails userdetails=new UserDetails();
				//Enter Users First Name
				System.out.println("Enter the First name");
				userdetails.setfirstName(u.inputString());
				//Enter Users Last Name
				System.out.println("Enter the Last Name");
				userdetails.setlastName(u.inputString());
				//Enter Mobile number
				System.out.println("Enter the 10 digit Mobile number");
				userdetails.setmobileNumber(u.inputString());
		
				//Sets the date 
				userdetails.setDate(u.getFormattedDate(new Date()));

				System.out.println(u.RegexReplace(userdetails,u.getTextfromFile("/home/bridgeit/Documents/Bhushan/New.txt")));


			}
	}
