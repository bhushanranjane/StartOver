/*
  file name:Utility.java
  Created by:Bhushan Ranjane
  Create Date:-24-08-2016
  Purpose:Contains the Functions which are to be used in main class.
*/
package com.Utility;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility
	{
		private final String firstName="<<Name>>";
		private final String lastName="<<Last Name>>";
		private final String mobileno="xxxxxxxxxx" ;
		private final String Date="<<01/01/2016>>";



	Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//Check the length of the string
public boolean checklength(String string)
	{ 
		int length=string.length();
		//if length of the String is less than 3
		if(length<3)
			{ 
				return false;
			} 
		//if length of the String is more than 3
		else
			{
				return true;

			}
	}

//replace username in String
public String replaceusername(String string)
	{
		String username="Hello username ,How are you?";
		username=username.replaceAll("username",string);
		return username; 
	} 

//count precentage of heads and tails
public void countHeadTail(int no)
	{
		int head=0;
		int tail=0;
		float headper,tailper;
		//Declare random function 
		Random r=new Random();
		for(int i=0;i<no;i++)
		{
			if((r.nextInt(no)%2)<0.5)//creating random value 
				{
					head++;
				}
			else
				{
					tail++;
				}
		}
		headper=(head*(100/no));//Calculates percentage of heads
		tailper=(tail*(100/no));//calculates percentage of tails
		System.out.println("count of head"+headper);//Display Count of head
		System.out.println("count of tail"+tailper);//Display Count of Tail
	}

 //validate no between 0-31  
public boolean validateNO(int no)
	{
		if(no<31 && no>0)
			{ 
				return true;
			}
		else
			{
				return false;
			}
	} 

//generate table for power 2^n
public void powerTable(int no)
	{
		int power=1;
		//power of 0 is 1 
		if(no==0)
			{
				System.out.println("2^0=1"); 
			}
		else
			{
				for(int i=1;i<=no;i++)
				{
					power=power*2;
					System.out.println("2^"+i+"="+power); 
				}
			}
	} 

//calculate Harmoninc value of n number
public float calHarm(int no)
	{
		float harmonic=0;
		for(int i=1;i<=no;i++)
			{
				harmonic=harmonic+(1.0f/i);          
			}
		return harmonic;
	}

//to calculate prime factors
public void findfactor(int number)
	{
		int i;
		for(i=2;i*i<=number;i++) 
			{
			//mod of number should be 0
				while(number%i==0)
					{
						System.out.println(i+"");
						number=number/i;
					}
			}
    //if number is divisble by itself
		if(number>1)
			{
				System.out.println(number);
			}
	}

//track of number of times gambler wins and loss
public void gamblegame(int stakes,int goal,int number)
	{
		int bets=0;
		int wins=0;
		int loss=0;

		for(int i=0;i<number;i++)
			{ 
				int cash=stakes;
				while(cash>0 && cash<goal)//play until cash get zero or cash is not reach till goal
					{
						bets++;
					if(Math.random()<0.5)
		        cash++ ;                 //wins
		        else
		        cash--;                  //lose
		     	 }     

			if(cash==goal)// if cash equals goal then the gambler wins else lose
					wins++;
			else
					loss++;   
				}  

	//the result of the game is printed here 
   System.out.println("number of Wins"+wins);
   System.out.println("Percent of wins:"+100*wins/number); 
   System.out.println("percent of loss:"+100*loss/number);  
 }

//2d array record Insertion
public int[][] putData(int row,int col)
	{
		//creating and initializing arraylist for rows and columns
		int[][] arrlist=new int[row][col];
		int i,j;
		for(i=0;i<row;i++)
			{ 
				for(j=0;j<col;j++)
					{
						System.out.println("enter"+(i)+" "+j+"elements");
						arrlist[i][j]=sc.nextInt();
					}          
 			}   
     return arrlist;
	}
  
//Sum of three triplet is zero
public void triplet(int list[],int no)
	{
		int i,j,k;
		for(i=0;i<no;i++)
			{
				for(j=i+1;j<no;i++)
					{
						for(k=j+1;k<no;k++)
							{
								if((list[i]+list[j]+list[k])==0)
									{
										System.out.println("Combination of triples"+list[i]+""+list[j]+""+list[k]+"is 0"); 
										//break;
									}
								else
									{
										System.out.println("no Combination found");
									}
							}
					}
				}
		}
   
//Find the String Anagram or not
public void search(String a,String b)
	{ 
		boolean status=false;
		//change case of String to lower case
		char[] s1=a.toLowerCase().toCharArray();
		char[] s2=b.toLowerCase().toCharArray();

		//sort the array 
  
		Arrays.sort(s1);
		Arrays.sort(s2);    
		status=Arrays.equals(s1,s2);

		if(status==true)
			{ 
				//if Condition true 
				System.out.println("The String "+a+" and "+b+" are Anagrams");
			}
		else
			//if Status is false 
			System.out.println("The String "+a+" and "+b+" are not Anagrams");
	}

//Search the entered number to find your number 
 public void enterNumber(int number,int search[])
	{
		//enter the Numbers here 
		System.out.println("Enter the Numbers Here:-");
		for(int i=0;i<number;i++)
		{
			search[i]=sc.nextInt();
		
		} 
	}

//Search the entered number using binary search method
public void searchNumber(int number,int search[])
	{ 
		//create a random function
			Random r=new Random();
			int last=number-1;
			int power=1;
			String ans;
			int searchvalue,count=0;
			int first=0;
			int mid=(first+last)/2;

			for(int i=0;i<=number;i++)
			{
				power=power*2;
			}
				int list[]=new int[power];
				for(int i=0;i<=last;i++)
				{
					list[i]=r.nextInt(power-1);
				}
			//Enter the value to be search
			System.out.println("Enter the value to search");
			searchvalue=sc.nextInt();
    
			//Check the length of the integers entered
				for(int i=0;i<search.length-1;i++)
				{
					System.out.println("The mid of the entered value is "+search[mid]);
					System.out.println("Is this your Number");
					ans=sc.next();

				if(ans.equals("yes"))
				{
					//if search value found at middle position
					System.out.println("Value found "); 
		      break;
				}
				// search value less the mid of the entered numbers
				else if(ans.equals("low"))
				{
					last=mid-1;
					System.out.println("last"+last);
					count++;
				}
				else if(ans.equals("high")){
				//search value more the mid value of entered numbers
				first=mid+1; 
				System.out.println("last"+last);
				count++;
				}
				else
				System.out.println("You have entered wrong input");
				mid=(first+last)/2;		
				System.out.println("Mid"+mid);
				}
				if(count>number)
				System.out.println("Match value not found");
				System.out.println("NO of attempts "+count);		
		}


//storing value to an array
public String[] addString(int no)
	{
		String list[]=new String[no];
		System.out.println("Enter the Words:-");
		//adding string into array
		for(int i=0;i<no;i++)
		{
			list[i]=sc.next(); 
		}             
			return list;  
	}

//Search the word using Binary search
public void searchWord(String word,String list[])
	{
		int i;
		int count=0;
		int first=0;
		int last=list.length-1;
		int mid=(first+last)/2;

		//Search for word begins here     
		for(i=0;i<last;i++)
		{
			if((list[mid].compareTo(word))==0)//match found here
			{
				count++;
				System.out.println("Match Found at "+(mid+1));
				break;
			}
			else if((list[mid].compareTo(word))<=0)//middle is less than value to be search
			{
				first=mid+1;
				count++;
			}
			else //middle is more than value to search
			{
				last=mid+1;
				count++;
			}
			mid=(first+last)/2;
		}	
		if(first>last)//match not found
			{
				System.out.println("Match not Found");
			}		
	}

//Enter the String to Array 
public  String[] addInsert(int no,String list[])
	{
		//String list[]=new String[no];
		//Enter the words in the string
		System.out.println("Enter the words in the String");
		for(int i=0;i<no;i++)
		{
			list[i]=sc.next();
		}
		return list;
	}

//perform insertion sort on the entered String
public String[] insertSort(int no,String list[])
	{
		int i=0,j=1;
		for(i=1;i<no;i++)
		  {
	   		//Declaring and initializing the key value
				String key=list[i];
				for(j=i-1;j>=0 && list[j].compareTo(key)>0;j--)
				{
					//Swap the words
					list[j+1]=list[j];
					list[j]=key;
				}
				
			}
			 return list;
		}
						
//add integers to the array to perform bubble sort
	public int [] addBubbleElements(int totalCount,int list [])
		{
			System.out.println("Enter th integers to be sorted ");
			for(int i=0;i<totalCount;i++)
				{
					list[i]=sc.nextInt();	//prints the list of elements in the array
				}
			return list;
		}

//Sorts the integer into ascending order using bubble sort logic		
public int[] bubbleSort(int totalCount,int list[])
	{	int temp;
		//Display the sorted elements using Bubble Sort logic
		System.out.println("The sorted Elements Are :-");
		for (int i=0;i<totalCount-1;i++)
			{
				for(int j=0;j<totalCount-i-1;j++)
					{
						if(list[j]>list[j+1]) // Use < to sort the elements in descending order
							{
								//Swap  the elements if adjacent element is greater
								temp=list[j];
								list[j]=list[j+1];
								list[j+1]=temp;										
							}
					}
			}
		return list;
	} 					

//Check the palindrome of the String

public void checkPalindrom(String string)
	{
		String reverse="";
		//Store the length of the String in lenght
		int length=string.length();
		for(int i=length-1;i>=0;i--)
			{
				//store the reverse of the string in variable reverse
				reverse=reverse+string.charAt(i);
			}
		System.out.println("The Reverse of the String is :-"+reverse);
		//entered string equals reverse of the string 
		if(string.equals(reverse))
		{
			System.out.println("The string is palindrome");
		}
		//entered String not match with the reverse String
		else
			System.out.println("The string is not palindrome");
	}		
	
//Function to perform binary search on Integers
public void binarySearch(int numberofIntegers,int numberstoSearch[])
	{
		int first=0;
		int last=numberofIntegers-1;
		int mid=(first+last)/2;
		int searchvalue;
		//enter the Search value from user
		System.out.println("Enter the Search value which to be search from list of Integers");
		searchvalue=sc.nextInt();
		
		while(first<=last)
		{
			if(numberstoSearch[mid]<searchvalue)
			{
				first=mid+1;
			}
			else if(numberstoSearch[mid]==searchvalue)
			{
				System.out.println("Search value found ");
				break;
			}
			else
				last=mid-1;
	
				mid=(first+last)/2;
		}
		
			if(first>last)
			System.out.println("Search value not Found");
	}
				
//Function to perform Insertion Sort of Integers

//Add integers to array
public  int[] addInteger(int no,int list[])
	{
		System.out.println("Enter Numbers in the array");
		for(int i=0;i<no;i++)
		{
		list[i]=sc.nextInt();
		}
		return list;
	}
//perform insertion sort on the entered String
public int[] insertionSort(int no,int list[])
	{
		int i=0,j=1;
		for(i=1;i<no;i++)
		{
			//Declaring and initializing the key value
			int key=list[i];
		//sorts the array of integers in ascending order
		for(j=i-1;j>=0 && list[j]>key;j--)//to sort in decsending order list[j]<key
		{
			//Swap the words
			list[j+1]=list[j];
			list[j]=key;
		}

	}
	return list;
}
//add String to the array to perform bubble sort
public String [] addBubbleString(int totalCount,String list [])
	{
		System.out.println("Enter the String to be sorted ");
		for(int i=0;i<totalCount;i++)
			{
				list[i]=sc.next();	//prints the list of elements in the array
			}
		return list;
	}
//Sorts the String into ascending order using bubble sort logic		
public String[] bubbleSortString(int totalCount,String list[])
	{	
		String temp;
		//Display the sorted elements using Bubble Sort logic
		System.out.println("The sorted Elements Are :-");
		for (int i=0;i<totalCount-1;i++)
		{
			for(int j=0;j<totalCount-i-1;j++)
			{
				if(list[j].compareTo(list[j+1])>0) // Use < to sort the elements in descending order
				{
					//Swap  the elements if adjacent element is greater
					temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
	
	
				}
			}
		}
		return list;
	} 					

//take Input as word
public String inputString()
	{
		try
			{
				//reads the inputString
				return br.readLine();
			}
		catch(IOException e)
			{
				//prints exception if any exception
				System.out.println(e.getMessage());
			} 
		return"";
	}

public int inputInteger()
	{
		try
			{
				//reads the inputInteger
				return br.read();
			}
		catch(IOException e)
			{
				//prints exception if any exception
				System.out.println(e.getMessage());
			} 
		return 0;
	}

//get the data from the file
public String getTextfromFile(String filepath)
{
	try
		{
			BufferedReader br=new BufferedReader(new FileReader(filepath));
			//Creates the of String Builder class to manipulate String
			StringBuilder sb=new StringBuilder();
			//line to read the line from the file
			String line=br.readLine();
				while(line!=null)
					{
						//Add a line util it is null using append method
						sb.append(line);
						//add line seperator after each line 
						sb.append(System.lineSeparator());
						//read the line
						line=br.readLine();
					}
				return sb.toString();
		}
		catch(Exception e)
		{
			return null;
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(Exception ie)
			{
				
			}
		}
}	

//return the formatted Date in form 01/01/2016

public String getFormattedDate(Date date)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}
//Replace the user details with regex
public String RegexReplace(UserDetails userdetails,String message)
	{
		
		//Regex to replace first Name 
		Pattern p=Pattern.compile(firstName);
		Matcher m=p.matcher(message);
		message=m.replaceAll(userdetails.getfirstName()); 

		//Regex to replace last Name
		p=Pattern.compile(lastName);
		m=p.matcher(message);
		message=m.replaceAll(userdetails.getfirstName()+" "+userdetails.getlastName());

		//Regex to replace mobile number
		p=Pattern.compile(mobileno);
		m=p.matcher(message);
		message=m.replaceAll(userdetails.getmobileNumber());	


		//Regex to replace Date
		p=Pattern.compile(Date);
		m=p.matcher(message);
		message=m.replaceAll(userdetails.getDate());

		return message;
	}

public String readFile(File file){
		
		try{
			br = new BufferedReader(new FileReader(file));
			return br.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}

public void clearFile(File f){
		try{
			String s = this.readFile(f);
			BufferedWriter wr = new BufferedWriter(new FileWriter(f));
			wr.write(" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

public void writeFile(File file,String data){
		try{
			String string = this.readFile(file);
			string = string.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(string+" "+data);
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}


 }
