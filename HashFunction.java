/*
  file name:HashFunction.java
  Created by:Bhushan Ranjane
  Create Date:-30-08-2016
  Purpose:Contains the Functioning of Hash Table
*/

package com.Model.Hash;

import java.util.Scanner;
import com.Utility.Utility;
import java.io.File;

public class HashFunction
	{
	public static void main(String[] args)
		{
			Utility u = new Utility();
			boolean check = true;
		
		System.out.print("Please Enter Table Size:");
		int size = u.inputInteger();
		HashTable ht = new HashTable(size);
		File file = new File("/home/bridgeit/Documents/Bhushan/Hash.txt");
		String string = u.readFile(file);
		String str[] = string.split(" ");
		for(int i=0;i<str.length;i++){
			ht.addValue(Integer.parseInt(str[i]));
		}

		while(check){
			System.out.println("Please Choose Your Option:\n1.search Value\n2.Show HashTable\n3.Exit");
			int choice = u.inputInteger();
			switch(choice){
				case 1:{
					System.out.print("Please Enter a value: ");
					int value = u.inputInteger();
					ht.search(value);
					break;
				}
				case 2:{
					System.out.println("Hash table is");
					ht.showTable();
					System.out.println();
					break;
				}
				case 3:{
					check = false;
					break;
				}
				default :{
					System.out.println("Wrong Choice");
					break;
				}

			}//end of switch
		}//end of while
	}
}
