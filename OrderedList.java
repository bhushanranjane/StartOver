/*
  file name:Node.java
  Created by:Bhushan Ranjane
  Create Date:-29-08-2016
  Purpose:To create ordered list using LinkList  
*/

package com.Model.OrderedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import com.Model.OrderedList.NodeFunction;


public class OrderedList
{
	public static void main(String args[])
	{
		//create the object of the node function class
		NodeFunction nf=new NodeFunction();
		//create the object of Scanner class
		Scanner sc=new Scanner(System.in);
	try
		{	
		//Create the object of FileREader Class to read the File
		FileReader fr=new FileReader("/home/bridgeit/Documents/Bhushan/OrderedList.txt");//Path of the file to read

		//read the data from the file
		BufferedReader br=new BufferedReader(fr);

		System.out.println("The Integers from the file are:- ");
		String data=br.readLine();
		System.out.println(data);
		
		String filedata[]=data.split(" ");
		int fileInteger[]=new int[filedata.length];

	for(int i=0;i<fileInteger.length;i++)
		{
			fileInteger[i]=Integer.parseInt(filedata[i]);
			nf.add(fileInteger[i]);						
		}
			nf.showList();
		}
	catch(Exception e)
		{
			e.printStackTrace();
		}
	System.out.println("Enter the word to be Entered :-");
	int word=sc.nextInt();


	//Shows the search result

	boolean result=nf.search(word);

	//if word not found add the word in linklist 
	if(result==false)		
		{
			nf.add(word);
			nf.showList();
		}
	//if word Found remove the word from the linklist
	else
		{
			nf.remove(word);
			nf.showList();
		}
	}
}

