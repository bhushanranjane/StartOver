/*
  file name:Stack.java
  Created by:Bhushan Ranjane
  Create Date:-30-08-2016
  Purpose:To Store Arithmatic data in Stack  
*/

package com.Model.Stack;
import java.util.Scanner;

	public class Stack
	{
		int top;
		int last;
		String stack[]=new String[last];
		
	//create the constructor of the Stack class
	public	Stack()
			{
				top=0;//top is empty
			}
	//push the character in the stack
	public void push(char item)
		{
			if(top==last)
				{
					System.out.println("Stack is full");
				}
			else
					stack[last+1]=stack[top];
					stack[top]=stack[last];
			
		}

	//pop the character from the stack
	public void pop()
		{
			if(top<0)
				{
					System.out.println("Stack underflow");
				}
			else
				{	
					stack[last-1]=stack[top];
					stack[top]=stack[last-1];
						
				}
					
		}

	//check wheather the stack is empty or not

	public boolean isEmpty()

		{
			boolean result=false;
			if(top==0)//Stack is empty 
				{
					System.out.println("Stack is Empty");
						
				}
			else
				{
					System.out.println("Stack is not empty");
						
				}
			return result;
		}

		/*public void size()
			{
				
				if(stack.size()<=count)
					{	
						System.out.println(stack.size());
					}
				else
					{
						System.out.println("Their is no space in Stack");	
					}
			}
		*/	
	}
  

		

