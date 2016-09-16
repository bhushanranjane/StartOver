/*
  file name:Anagram.java
  Created by:Bhushan Ranjane
  Create Date:-27-08-2016
  Purpose:Check the Anagram between two String
*/
package com.Model;
import com.Utility.Utility;
import java.util.Scanner;

class Anagram
	{
		public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				Utility u=new Utility();

				String a,b;
				//enter the two Strings 
				System.out.println("Enter the First String");
				a=sc.next();

				System.out.println("Enter the Second String");
				b=sc.next();
				// call Search method to compare String
				u.search(a,b);
			}
	} 
