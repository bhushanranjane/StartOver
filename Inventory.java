
package com.Model.JSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Inventory
	{		
		public static void mian(String args[])
			{
				//create the object of the class JSON
				JSONObject json=new JSONObject();
				//create the Main Category
				json.put("Inventory");
				//adds main element under Main Category
				json.add("RiceName :Basmati");//,"Weight":"100","Prize":"70");
				json.add("PulseName:Moong");//,"Weight":"50","Prize":"85");
				json.add("WheatsName:Wheat");//,"Weight":"78","Prize":"90");

				try
				{
					FileWriter fw=new FileWriter("/home/bridgeit/Documents/Bhushan/File.txt");
					fw.write(json.toJSONString());
					System.out.println("Successfully Copied Json object to the file");
					//Display the Copied file
					System.out.prntln("Json objects :- "+json);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					fw.flush();
					fw.close();

				}
			}
	}	
