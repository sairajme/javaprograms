package com.sample.program;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class ReadCSVExample {
	
	public void getStudentMarks(int rollno, List<SearchCSV> list) {
		int len = 0;
		int total = 0;
		double avg=0.0;
		for (SearchCSV cs : list) {

			if (cs.getRollNo() == rollno) {
				len++;
				total = total + cs.getSubjectMarks();
				System.out.println(cs.getSubject() + "   " + cs.getSubjectMarks());
			}
		}
		
		
		System.out.println("Total MARKS " + "   " + total);
		System.out.println("Total Subjects " + "   " + len);
		avg = total/len;
		System.out.println("Average " + "   " + (avg));
	}


	public static void main(String[] args) throws Exception {

		ReadCSVExample re = new ReadCSVExample();
		String path = "C:\\Users\\Win10\\Desktop\\marklist.csv";
		String line = "";
			try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			List<SearchCSV> list = new ArrayList<SearchCSV>();
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
			re.getStudentMarks(101, list);
		} catch (Exception E) {
			System.out.println(E.getMessage());
		}
	}

	
}