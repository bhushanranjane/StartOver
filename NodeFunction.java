/*
  file name:NodeFunction.java
  Created by:Bhushan Ranjane
  Create Date:-30-08-2016
  Purpose:To create Node functions for LinkList  
*/

package com.Model.OrderedList;

import com.Model.OrderedList.Node;
import java.util.Scanner;

	class NodeFunction
		{
			Node head;
			Node tail;

	//add the Integer in the linklist
	public void addInteger(int value)
		{
			Node temp=new Node();
			temp.setValue(value);
			
			//if node is empty
			if(head==null)
				{
					head=temp;
					tail=temp;
				}
			//node is not Null
			else
					tail.setNext(temp);	
					tail=temp;
		}
	
	//Search for the items in the list
	public boolean search(int search)
		{
			Node current=new Node();
			current=head;
			while(current !=null)
				{
					//int res=current.getValue();
					//Search Value Matches the Value in the list return true 
					if(search==current.getValue())
	 				return true;
					current=current.getNext();
				}
					return false;
		}

	public void showList()
		{
			Node temp=head;
			//if linked list is empty
			if(temp == null)
			System.out.println("List is null");
			else
				{
					while(temp != null)//display linked list
						{
							System.out.println("Value:"+temp.getValue());			
							temp=temp.getNext();	
						}			
				}
		}

		public void add(int value) {
		Node n = new Node();
		n.setValue(value);// set value of node
		Node temp = head;
		Node prev = head;
		boolean ins = false;
		// if list is empty make it head and tail
		if (head == null) {
			head = n;
		} else {
			if (value < head.getValue()) {
				n.setNext(head);
				head = n;
			}

			else {
				while (temp.getNext() != null) {
					if (value >= temp.getValue() && value <= prev.getValue()) {
						temp.setNext(n);
						n.setNext(prev);
						ins = true;
						break;
					} else {
						temp = prev;
						prev = prev.getNext();
					}
				}
				if (ins == false) {
					temp.setNext(n);
				}
			}

		}
	}

	//Remove the node if already exits in the list
	public void remove(int value)
		{
			Node n=new Node();
			Node previous=head;
			Node current=head;
			System.out.println("value:"+value);
			//if the node is empty
				if(current==null)
					{
						System.out.println("Their is Nothing to remove");
					}
				else
					{							
						while(value!=current.getValue())
							{
									System.out.println("current value"+current.getValue());//r
									//System.out.println("match"+value.compareTo(current.getValue()));
									previous=current;
									current=current.getNext();

							}
							if(current==head)
								{
									head=head.getNext();
									current.setNext(null);
				
								}
							else 
								{
									previous.setNext(current.getNext());
									current.setNext(null);
								}
								
					}
		}		
	}
