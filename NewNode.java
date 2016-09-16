/*
  file name:Node.java
  Created by:Bhushan Ranjane
  Create Date:-30-08-2016
  Purpose:To create Node for Hashing Table  
*/

package com.Model.Hash;

	class NewNode
		{
			private int value;
			private NewNode next;
		//Function to set the value
		public void setValue(int value)
			{
				this.value=value;
			}
		//Function to get the value
		public int getValue()
			{
				return value;
			}
	
		//Function to set the Next of the value
		public void setNext(NewNode next)
			{
				this.next=next;
			}
	
		//Function to get the Next  value
		public NewNode getNext()
			{
				return next;
			}
		}
			
		
