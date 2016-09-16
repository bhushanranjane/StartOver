/*
  file name:HashSearch.java
  Created by:Bhushan Ranjane
  Create Date:-07-09-2016
  Purpose:Hashing function to search a number from a lot
*/

package com.Model;
import java.util.*;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import com.Model.OrderedList.OrderedList;

	class HashSearch
		{
			public static void main(String args[])
			{			
				Scanner sc=new Scanner(System.in);
				OrderedList order[]=new OrderedList[11];
				int number;
				
			try{
			//set the file path using file reader
			FileReader fr=new FileReader("/home/bridgeit/Documents/Bhushan/Hash.txt");
			//read the file using buffered Reader
			BufferedReader br=new BufferedReader(fr);
			String tempHash=br.readLine();
			//Spilt the data from the file
			String hash[]=tempHash.split(" ");
			int temparray[]=new int[hash.length];
			//reads the data from the file
			for(int i=0;i<hash.length;i++)
				{
					int temp[]=new int[11];
					int rem;
					String numberAsString=hash[i];
					//Cast the String array to Integer 
					temparray[i]=Integer.parseInt(numberAsString);
					System.out.println(temparray[i]);
					rem=temparray[i]%11;
					if(rem==i)
					{
						temparray[i]=temp[i];
										
					}
						System.out.println("Value at "+i+"Position");	
				}	
				
				}
			catch(Exception e){
				e.printStackTrace();
				}
			}
			
		}
