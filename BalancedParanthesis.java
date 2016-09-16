/*
  file name:BalancedParanthesis.java
  Created by:Bhushan Ranjane
  Create Date:-30-08-2016
  Purpose:To Store Arithmatic data in Stack  
*/

package com.Model.Stack;
import java.util.Scanner;
import java.util.Stack;


class BalancedParanthesis
	{
		public static void main(String args[])
			{
				
				Scanner sc=new Scanner(System.in);
				
				String string=new String();
				
				System.out.println("Enter the arithmatic expression");
				string=sc.next();
				//Creating object of Stack class to perfom Stack operations
				Stack stack=new Stack();

				for(int i=0;i<string.length();i++)
					{
						//character in the String is { then push the data
						if(string.charAt(i)=='{')
							{
								stack.push('{');
							} 
						//character in the String is ( the push the data
						if(string.charAt(i)=='(')
							{
								stack.push('(');
							}
						//character in the String is [ the push the data
						if(string.charAt(i)=='[')
							{
								stack.push('[');
							}
						//character in the String is } the pop the data
						if(string.charAt(i)=='}')
							{
								stack.pop();
							} 
						//character in the String is ) the pop the data
						if(string.charAt(i)==')')
							{
								stack.pop();
							}
						//character in the String is ] the pop the data
						if(string.charAt(i)==']')
							{
								stack.pop();
							}
					}
				if(stack.isEmpty())
					{
						System.out.println("The expression is balanced");
					}
				else{
						System.out.println("The expression is unbalanced");
					}
			}
		}

	
