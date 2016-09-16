/*
  file name:Harmonic.java
  Created by:Bhushan Ranjane
  Create Date:-24-08-2016
  Purpose:Calculate the harmonic value of entered Number
*/
package com.Model;
import com.Utility.Utility;
import java.util.Scanner;
 
class Harmonic
	{
		public static void main(String args[])
			{
				Utility u=new Utility();
				int no;
				float harmonic;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the no to calculate harmonic value");
				no=sc.nextInt();
				//check if no is greater than 0 to calculate harmonic Value
				if(no>0)
				{
					//call calharm method to return return harmonic value 
					harmonic=u.calHarm(no);
					System.out.println("Harmonic no:"+harmonic);
				} 
				//if the entered no is 0
				else
				{
					System.out.println("Enter No Greater than 0");
				}
			}
		}
