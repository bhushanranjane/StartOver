/*
  file name:Queue.java
  Created by:Bhushan Ranjane
  Create Date:-31-08-2016
  Purpose:To create Queue of customer of Bank   
*/

package com.Model.Queue;

import java.util.LinkedList;
import java.util.Scanner;

 class Queue
	{
		int queue [];
		int front,rear,size,length;

	public Queue()
		{
		int	count=10;
		int	front=-1;
		int	rear=-1;
		int	size=count;
		int	length=0;
			queue=new int[size];
		}

	//Function to check is queue empty
	public boolean isEmpty()
		{
			return front==-1;
		}

	//function to Enqueue(Add) data 
	public void enQueue(int value)
		{
			if(rear==-1)
				{
					front=0;
					rear=0;
					queue[rear]=value;
				}
			//Queue Over Flow when value entered in queue is greater than queue size
			else if(rear+1>=size)
				{
					System.out.println(" Queue overFlow");
				}
			//insert the value at the rear end of the queue
			else if(rear+1<size)
					queue[++rear]=value;
					length++;
					
		}

	//function to dequeue data
		public void deQueue()
			{
				//Queue is underFlow when the values are less than the queue size
				if(isEmpty())
					{
						System.out.println("Queue underFlow");//Queue is empty
					}
				else
					{
						length--;
						int ele=queue[front];	//Remove the first element from the Front of the Queue
						if(front==rear)
						{
							front=-1;
							rear=-1;
						}
						else
						front++;
						
					}	
			
		}
}
					
