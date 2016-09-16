/*
  file name:InsertionSort.java
  Created by:Bhushan Ranjane
  Create Date:-27-08-2016
  Purpose:Sort the Integers in Ascending Order 
*/
package com.Model;

import com.Utility.Utility;
import java.util.Scanner;

class InsertionSort
	{
		public static void main(String args[])
		{
			int no;			
			Scanner sc=new Scanner(System.in);
			Utility u=new Utility();
			//Enter the total number of String to be Entered
			System.out.println("Enter the no of words in a String");
			no=sc.nextInt();
			//declaration and initialisation of the string
			String list[]=new String[no];
			//add word to be sort
			u.addInsert(no,list);
			//call insert Sort to show the sorted elements
			System.out.println("The Sorted Elements Are");
			u.insertSort(no,list);
			//display the sorted elements

			for(int i=0;i<no;i++)
			{
				System.out.println(list[i]);	
			}


		}
	}
			
			 
