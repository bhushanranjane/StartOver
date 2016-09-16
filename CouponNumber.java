/*
  file name:CouponNumber.java
  Created by:Bhushan Ranjane
  Create Date:-08-09-2016
  Purpose:To Generate the N Distinct Coupon 
*/
package com.Model;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class CouponNumber
	{
		public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//Use random class to Generate Random Numbers
		Random r=new Random();
		int totalCoupon;
		int count=0;
		int random;
		//the the total number of coupons to be generated
		System.out.println("Enter the total number of coupon to generate");
		totalCoupon=sc.nextInt();
		
		ArrayList listCoupon=new ArrayList();
		for(int i=0;i<totalCoupon;i++)
		{
			//Generate Random value in a range of 100
			random=r.nextInt(100);
			if(i==0)
			{
				count++;
				listCoupon.add(random);
			}
			else
			{
				count++;
				while(listCoupon.contains(new Integer(random)))
				{
					count++;
					random=r.nextInt(100);
				}
				listCoupon.add(random);
			}
		}
		//display the random generated coupon
		System.out.println(listCoupon);
		//Shows the Count of the Coupon
		System.out.println("Random no  to generate distinsct counpon  "+count);
		//CouponNumber c=new CouponNumber();
	}
}

