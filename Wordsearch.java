package com.Model;

import com.Utility.Utility;
import java.util.Scanner;
import java.util.Arrays;

  class Wordsearch
   {
    public static void main(String args[])
		{
			int no;
			Utility u=new Utility();
			Scanner sc=new Scanner(System.in);
			System.out.println("How many numbers you want to insert:-");
			no=sc.nextInt();	

			//initialization and declartion of list which contains word			
			String list[]=new String[no];
			list=u.addString(no); 

			//Sort array of the String
            Arrays.sort(list);
			System.out.println("List of words:");
	
			//display list of strings or words
			for(String s:list)
			{
			System.out.println(s);
			}

			//enter word which is to be searched in list
			System.out.println("Enter word to search:");
			String word=sc.next();
	
			//passing to binary search to find a word
 

			u.searchWord(word,list);
           
		}
	}
