/*
  file name:UtilityCall.java
  Created by:Bhushan Ranjane
  Create Date:-1-09-2016
  Purpose:To perform all sortings  
*/

package com.Model;
import com.Utility.Utility;
import java.util.Scanner;
import java.util.Arrays;

class UtilityCall
	{
		public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				Utility u=new Utility();
				System.out.println("Enter the Choice of your ");
				System.out.println("\t 1.BinarySearch method for integer");
				System.out.println("\t 2.BinarySearch method for String");
				System.out.println("\t 3.InsertionSort method for integer");
				System.out.println("\t 4.InsertionSort method for String");
				System.out.println("\t 5.BubbleSort method for integer");
				System.out.println("\t 6.BubbleSort method for String");
				System.out.print("The choice is :- ");
				int choice=sc.nextInt();

				switch(choice){
		
				case 1:
				{
							int numberofIntegers;
							//Stop Watch Starts here 
							long starttime=System.currentTimeMillis();
							//Enter the count of integers 
							System.out.println("Enter the Number of integers to be search");
							numberofIntegers=sc.nextInt();
							//Declare and initialize the array of numbers to search
							int numberstoSearch[]=new int[numberofIntegers];

							System.out.println("Enter the numbers to Search");
							for(int i=0;i<numberofIntegers;i++)
								{
									numberstoSearch[i]=sc.nextInt();
								}
							//call binary search function from Utility class 	
							u.binarySearch(numberofIntegers,numberstoSearch);
				
							//Stop watch ends here
							long endtime=System.currentTimeMillis();
							//Ellapsed time is calculated here
							long timeEllapsed=endtime-starttime;
							//Displays the ellapsed time
							System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
							break;
				}
				case 2:
				{			long starttime=System.currentTimeMillis();
							int no;
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
							long endtime=System.currentTimeMillis();
							long timeEllapsed=endtime-starttime;
							System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
							
							break;
    		}   

				case 4:
				{			long starttime=System.currentTimeMillis();
							//Enter the total number of String to be Entered
							System.out.println("Enter the no of words in a String");
							int	no=sc.nextInt();
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
							long endtime=System.currentTimeMillis();
							long timeEllapsed=endtime-starttime;
							System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
							break;
				}
			
			case 3:
			{					
							long starttime=System.currentTimeMillis();
							//Enter the total number of String to be Entered
							System.out.println("Enter the no of Integers in a Array");
							int	no=sc.nextInt();
							//declaration and initialisation of the string
							int list[]=new int[no];

							//add word to be sort
							u.addInteger(no,list);

							//call insert Sort to show the sorted elements

							System.out.println("The Sorted Elements Are");
							u.insertionSort(no,list);

							//display the sorted elements

							for(int i=0;i<no;i++)
							{
							System.out.println(list[i]);	
							}							
							long endtime=System.currentTimeMillis();
							long timeEllapsed=endtime-starttime;
							System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
							break;
				}
			case 5:
			{
					long starttime=System.currentTimeMillis();
					//Total number of numbers to be entered
					System.out.println("Enter the number of elements to be entered :-");
					int totalCount=sc.nextInt();

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
					long endtime=System.currentTimeMillis();
					long timeEllapsed=endtime-starttime;
					System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
					break;		
			}
			case 6:
			{
					long starttime=System.currentTimeMillis();
					//Total number of numbers to be entered
					System.out.println("Enter the Number of elements to be entered :-");
					int totalCount=sc.nextInt();

					//Declaration and initialization of Array of integers
					String list[]=new String[totalCount];

					//call addBubbleElements to add elements in the list
					u.addBubbleString(totalCount,list);

					u.bubbleSortString(totalCount,list);

					//Display the list of sorted elements
					for(int i=0;i<totalCount;i++)
					{
						System.out.println(list[i]);	
					}	
					long endtime=System.currentTimeMillis();
					long timeEllapsed=endtime-starttime;
					System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
					break;		
			}
			default:
			{
				System.out.println("Enter the Correct Choice ");	
				break;
			}
		}  //end switch  
				
			}
	}
