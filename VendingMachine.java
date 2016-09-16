/*
  file name:VendingMachine.java
  Created by:Bhushan Ranjane
  Create Date:-02-09-2016
  Purpose:Contains the Functions which are to be used in main class.
*/

package com.Model;

import java.util.Scanner;

class VendingMachine
	{
		static int minNotes=0;
		static int countofNotes=0;
		public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				//The input from the user as a amount to withdraw
				System.out.println("Enter the amount You want to withdraw form the Vending Machine");
				int withdrawAmount=sc.nextInt();
				
				//call the function to check the minimum number of notes
				minNotes=minNoofNotes(withdrawAmount);
				System.out.println("Total Number of NOtes :- "+minNotes);
			}
		//Function to calculate Minimum Number of Notes
		public static int minNoofNotes(int withdrawAmount)
			{
				//There is no withdraw from Vending Machine
				if(withdrawAmount==0)
					{
						return withdrawAmount;
					}
				//check the minimum of the 1000 Rs Notes
				else if(withdrawAmount>=1000)
					{
						minNotes+=withdrawAmount/1000;
						countofNotes=withdrawAmount/1000;
						System.out.println("1000 Rs notes are :-"+countofNotes);
						if(countofNotes % 1000==0)
						{
							return minNotes;
						}
						else
						{
							minNoofNotes(withdrawAmount % 1000);
						}					
					}
				//check the minimum of the 500 Rs notes
				else if(withdrawAmount>=500)
					{
						minNotes+=withdrawAmount/500;
						countofNotes=withdrawAmount/500;
						System.out.println("500 Rs notes are :- "+countofNotes);
						if(countofNotes %500==0)
						{
							return minNotes;
						}
						else
						{
							minNoofNotes(withdrawAmount %500);
						}
					}	
				//check the minimum of the 100 Rs notes
				else if(withdrawAmount>=100)
					{
						minNotes+=withdrawAmount/100;
						countofNotes=withdrawAmount/100;
						System.out.println("100 Rs notes are :- "+countofNotes);
						if(countofNotes %100==0)
						{
							return minNotes;
						}
						else
						{
							minNoofNotes(withdrawAmount %100);
						}
					}
				//Check the notes of the 50 Rs
				else if(withdrawAmount>=50)
					{
						minNotes+=withdrawAmount/50;
						countofNotes=withdrawAmount/50;
						System.out.println("50 Rs notes are :- "+countofNotes);
						if(countofNotes %50==0)
						{
							return minNotes;
						}
						else
						{
							minNoofNotes(withdrawAmount %50);
						}
					}
				//check the notes of the 20 Rs
				else if(withdrawAmount>=20)
					{
						minNotes+=withdrawAmount/20;
						countofNotes=withdrawAmount/20;
						System.out.println("20 Rs notes are :- "+countofNotes);
						if(countofNotes %20==0)
						{
							return minNotes;
						}
						else
						{
							minNoofNotes(withdrawAmount %20);
						}	
					}
				//check the Notes of the 10 Rs
				else if(withdrawAmount>=10)
					{
						minNotes+=withdrawAmount/10;
						countofNotes=withdrawAmount/10;
						System.out.println("10 Rs notes are :- "+countofNotes);
						if(countofNotes %10==0)
						{
							return minNotes;
						}
						else
						{
							minNoofNotes(withdrawAmount %10);
						}
					}
				//check the notes of the 5 Rs
				else if(withdrawAmount>=5)
					{
						minNotes+=withdrawAmount/5;
						countofNotes=withdrawAmount/5;
						System.out.println("5 Rs notes are :- "+countofNotes);
						if(countofNotes %5==0)
						{
							return minNotes;
						}
						else
						{
							minNoofNotes(withdrawAmount %5);
						}
					}
				//check the notes of 2 Rs
				else if(withdrawAmount>=2)
					{
						minNotes+=withdrawAmount/2;
						countofNotes=withdrawAmount/2;
						System.out.println("2 Rs notes are :- "+countofNotes);
						if(countofNotes %2==0)
						{
							return minNotes;
						}
						else
						{
							minNoofNotes(withdrawAmount %2);
						}
					}
				//check the notes of 1 Rs
				else if(withdrawAmount>=1)
					{
						minNotes+=withdrawAmount/1;
						countofNotes=withdrawAmount/1;
						System.out.println("1 Rs notes are :- "+countofNotes);
						if(countofNotes %1==0)
						{
							return minNotes;
						}
						else
						{
							minNoofNotes(withdrawAmount %1);
						}
					}
						return minNotes;
				}
			}
























