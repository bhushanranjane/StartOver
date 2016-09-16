/*
  file name:HashTable.java
  Created by:Bhushan Ranjane
  Create Date:-30-08-2016
  Purpose:To Store ths Data with Hash Values
*/

package com.Model.Hash;
import java.util.Scanner;
import java.io.File;
import com.Utility.Utility;

public class HashTable
{
	Utility u = new Utility();
	File file = new File("/home/bridgeit/Documents/Bhushan/Hash.txt");
	NewNode head,temp,entry;
	int key,value,tableSize;
	NewNode[] table;
	
	//creating table array
	public HashTable(int size){
		tableSize = size;
		table = new NewNode[tableSize];
		for (int i = 0; i <tableSize; i++)
			table[i] = null;
	} 
	//adding Element into table
	public void addValue(int value){
		int key = value % tableSize;
		if(table[key] == null){
			table[key] = new NewNode();
			table[key].setValue(key);
			head = table[key];
		}
			head = table[key];
			temp = head;
			entry = new NewNode();
			entry.setValue(value);
			while(temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(entry);

	}//end of addValue

	//search value from table
	public void search(int value){
		int key = value % tableSize;
		if(table[key] == null){
			System.out.println("Search not Found, number is added");
			this.addValue(value);
			this.updateFile();
		}
		else{
			head = table[key];
			temp = head.getNext();
			entry = new NewNode();
			entry.setValue(value);
			int count = 0;
			while(temp != null){
				if(entry.getValue() == temp.getValue()){
					System.out.println("Search Found, number is Deleted");
					count++;
					this.remove(value);
					this.updateFile();
					break;
				}
				else
					temp = temp.getNext();
			}
			if(count == 0){
				System.out.println("Search not found, value is added");
				this.addValue(value);
				this.updateFile();
			}
		}
	}//end of search function

	//removing value
	public void remove(int value){
		int key = value % tableSize;
		head = table[key];
		temp = head;
		NewNode temp2 = temp.getNext();
		while(temp2 != null){
			if(value == temp2.getValue()){
				temp.setNext(temp2.getNext());
				break;			
			}
			else{
				temp = temp2;
				temp2 = temp2.getNext();
			}
		}
			
	}

	//Updating into file
	public void updateFile(){
		u.clearFile(file);
		String str;
		for(int i=0;i<tableSize;i++){
			entry = table[i];
			temp = table[i];
			if(temp == null)
				str = "";
			else{
				temp = temp.getNext();
				while(temp != null){
					str = Integer.toString(temp.getValue());
					u.writeFile(file,str);
					temp = temp.getNext();
				}
			}
		}
	System.out.println("File is Updated");
	}//end of updateFile
		
	//show table
	public void showTable(){
		for(int i=0;i<tableSize;i++){

			System.out.print("\ntable "+i+": ");
			temp = table[i];
			int total = 0;
			if(temp == null)
				System.out.println("List is Empty");
			else{
				temp = temp.getNext();
				while(temp != null){
						total++;
						System.out.print(temp.getValue()+" ");
						temp = temp.getNext();
				}
				System.out.println("\nTotal numbers in list: "+total);
			}
		}

	}//end of showTable
}
