/*
  file name:Palindrome.java
  Created by:Bhushan Ranjane
  Create Date:-1-09-2016
  Purpose:To check whether the string is Palindrome or not
*/

package com.Model;

import com.Utility.Utility;
import java.util.Scanner;

class Palindrome
	{
		public static void main(String args[])	
		{
			String string;
			String reverse="";
			//creates the object of Utility class
			Utility u=new Utility();
			Scanner sc=new Scanner(System.in);
			//Enter the String to Check wheather it is palindrome or not
			System.out.println("Enter the String :-");
			string=sc.next();
			//call check palindrome function to check whether the string is palindrome or not
			u.checkPalindrom(string);
			
		}
	}
		
