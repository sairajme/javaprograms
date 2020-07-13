package com.sample.homework;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class readfromJson extends SearchCSV{

	
	public readfromJson() {
		// TODO Auto-generated constructor stub
		try {
			
	         Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Win10\\Desktop\\sample.json"));
	         JSONObject jsonObject = (JSONObject) obj;
	         
	         String Name= (String) jsonObject.get("Name");
	         setName(Name);
	         String Subject = (String)jsonObject.get("Subject");
	         setSubject(Subject);
	         long Regno= (long) jsonObject.get("RegNo");
	         setRollNo((int) Regno);
	         long MaxMarks = (long)jsonObject.get("MaxMarks");
	         setMaxMarks((int) MaxMarks);
	         long ScoredMarks= (long) jsonObject.get("ScoredMarks");
	         setSubjectMarks((int) ScoredMarks);
	        
	         System.out.println("Names===>  "+getName());
	         System.out.println("Subject===>  "+getSubject());
	         System.out.println("Roll No===>  "+getRollNo());
	         System.out.println("Subject===>  "+getSubjectMarks());
	         System.out.println("Max Marks===>  "+getMaxMarks());
	         
	        
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new readfromJson();
	}

}
