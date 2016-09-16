/*
  file name:BubbleSort.java
  Created by:Bhushan Ranjane
  Create Date:-27-08-2016
  Purpose:Sort the Integers in Ascending Order 
*/

package com.Model;

import com.Utility.Utility;
import java.util.Scanner;

	class BubbleSort
		{
			public static void main(String args[])
				{
					int totalCount;
					Scanner sc=new Scanner(System.in);
					Utility u=new Utility();

					//Total number of numbers to be entered
					System.out.println("Enter the number of elements to be entered :-");
					totalCount=sc.nextInt();

					//Declaration and initialization of Array of integers
					int list[]=new int[totalCount];

					//call addBubbleElements to add elements in the list
					u.addBubbleElements(totalCount,list);

					u.bubbleSort(totalCount,list);

					//Display the list of sorted elements
					for(int i=0;i<totalCount;i++)
					{
						System.out.println(list[i]);	
					}


				}

		}

					

 
