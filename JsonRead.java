/*
  file name:JsonRead.java
  Created by:Bhushan Ranjane
  Create Date:-07-08-2016
  Purpose:Check the Anagram between two String
*/

package com.Model;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonRead 
	{
	public static void main(String args[]) 
		{
			//creates the object of JSONParser class to Read the json file
			JSONParser parser=new JSONParser();
			try
			{
				//Parse the String in file as JSON String
				Object obj=parser.parse(new FileReader("Inventorytxt.json"));

				//Creates a JSONObject which contains the data Stored 
				JSONObject JObject=(JSONObject) obj;

				//Creates the Array of data present in the file
				JSONArray data=(JSONArray) JObject.get("data");

				//Display the data Fetched from the JSON file
				System.out.println("The data in the Array"+data);

				//Array of String is Declared and initialised
				String[] string={"Rice","Wheat","Pulses"};

				//Iterates till Size of the data
				for(int i=0;i<data.size();i++)
					{
						//Create a JSONObject of Data
						JSONObject item=(JSONObject) data.get(i);

						//Create a JSONArray of Data Items
						JSONArray Arritem=(JSONArray) item.get(string[i]);

						//Prints Array of the object
						System.out.println(string[i]+":");

				for(int j=0;j<Arritem.size();j++)
					{
						JSONObject Arrobject=(JSONObject) Arritem.get(j);
						//Gets the name object from the Json file

						System.out.println("Name : "+Arrobject.get("Name"));
						//Gets the weight from the Json file

						System.out.println("Weight :"+Arrobject.get("Weight")+" Kg");
						//Gets the Prize object From the Json file

						System.out.println("Prize :"+Arrobject.get("Prize")+" Rs");
						System.out.println("\n");

					}
				}
			}//end try

			catch(Exception ie)
				{
					System.out.println(ie);
				}
			}	

	}

