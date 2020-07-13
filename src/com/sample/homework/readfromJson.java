package com.sample.homework;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class readfromJson extends SearchCSV {

	public readfromJson() {
		// TODO Auto-generated constructor stub
		try {

			Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Win10\\Desktop\\sample.json"));
			JSONObject jsonObject = (JSONObject) obj;

			String Name = (String) jsonObject.get("Name");
			setName(Name);
			long Regno = (long) jsonObject.get("RegNo");
			setRollNo((int) Regno);
			long MaxMarks = (long) jsonObject.get("MaxMarks");
			setMaxMarks((int) MaxMarks);

			System.out.println("Names===>  " + getName());
			System.out.println("Roll No===>  " + getRollNo());
			System.out.println("Max Marks===>  " + getMaxMarks());

			JSONArray ja = (JSONArray) jsonObject.get("Marks");
			Iterator itr2 = ja.iterator();
			while (itr2.hasNext()) {
				JSONObject markobj = (JSONObject) itr2.next();
				Long sum = 0l;
				for (Object subname : markobj.keySet()) {

					System.out.println(subname + "==" + markobj.get(subname));
					Long mark = (Long) markobj.get(subname);
					sum = Long.sum(sum, mark);
					mark = sum;
				}
				System.out.println(sum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new readfromJson();
	}

}
