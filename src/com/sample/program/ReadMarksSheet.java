package com.sample.program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class ReadMarksSheet  {
	int len;
	int sum;
	double avg;
	String line;
	String name;
	
	

	public ReadMarksSheet(String path, int rollNo) throws FileNotFoundException {
	
		
		len = 0;
		sum = 0;
		avg = 0.0;
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(path));
		List<SearchCSV> list = new ArrayList<SearchCSV>();
		
		try {
			
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				if (values[0] != null) {
					SearchCSV csv = new SearchCSV();
					csv.setName(values[0]);
					csv.setRollNo(Integer.parseInt(values[1]));
					csv.setSubject(values[2]);
					csv.setMaxMarks(Integer.parseInt(values[3]));
					csv.setSubjectMarks(Integer.parseInt(values[4]));
					list.add(csv);
				}
			}

			for (SearchCSV cs : list) {

				if (cs.getRollNo() == rollNo) {
					len++;
					sum = sum + cs.getSubjectMarks();
					System.out.println(cs.getSubject() + "   " + cs.getSubjectMarks());
				}
			}
			System.out.println("Total MARKS " + "   " + sum);
			System.out.println("Total Subjects " + "   " + len);
			avg = sum / len;
			System.out.println("Average " + "   " + (avg));
			} catch (Exception E) {
			System.out.println(E.getMessage());
		}

	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Win10\\Desktop\\marklist.csv";
		new ReadMarksSheet(path, 100);
	
	}

}
