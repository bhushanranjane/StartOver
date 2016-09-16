package com.Model;

import java.util.Scanner;

   class TestBinary
	{
		int no;
		Scanner sc=new Scanner(System.in);
		//Total number of values to be inserted in a list
		System.out.println("Enter the total number of word in a list");
		no=sc.nextInt();
		//declaring and initializing the array
		String list[]=new String[no];
		//Words in the list 
		System.out.println("Enter the Words in the list");
		for(int i=0;i<no;i++)
			{
						list[i]=sc.next();

					}
					
			}
	}
