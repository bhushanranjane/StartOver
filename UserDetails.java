/*
  file name:RegexDemonstration.java
  Created by:Bhushan Ranjane
  Create Date:-08-09-2016
  Purpose:Have the user details which is used to replace  Regular Expression
*/
package com.Utility;

public class UserDetails
	{
		private String firstName;
		private String lastName;
		private String mobileNumber;
		private String date;
	
		//use setter to set the first name
		public void setfirstName(String firstName)
			{
				this.firstName=firstName;
			}
		//set the last name
		public void setlastName(String lastName)
			{
				this.lastName=lastName;
			}
		//set the mobile number
		public void setmobileNumber(String mobileNumber)
			{
				this.mobileNumber=mobileNumber;
			}
		//set the date
		public void setDate(String date)
			{
				this.date=date;
			}
    //use getter to get the first name
		public  String getfirstName()
			{
				return firstName;
			}
		//get the last Name
		public String getlastName()
			{
				return lastName;
			}
		//get the mobile Number 
		public String getmobileNumber()
			{
				return mobileNumber;
			}
		//get the date
		public String getDate()
			{
				return date;
			}
	}
