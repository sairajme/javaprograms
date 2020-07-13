package com.sample.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadMarksSheet extends MarkSheet {
	String line;
	String name;

	public void readCsvFile(String path, int rollNo) throws FileNotFoundException {
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
			getStudentName(list, rollNo);
			calTotal(list, rollNo);
			System.out.println("Total ====>" + getSum());
			overallResult(list, rollNo);
			System.out.println("Overall Result===>" + getRes());
			printAverageMarks();
			returnTheGrade();
		} catch (Exception E) {
			System.out.println(E.getMessage());
		}
	}

	private void getStudentName(List<SearchCSV> list, int rollNo) {
		// TODO Auto-generated method stub
		String exname = null;
		for (SearchCSV cs : list) {
			if (cs.getRollNo() == rollNo) {
				if (exname != null && exname.equalsIgnoreCase(cs.getName())) {
					continue;
				}
				exname = cs.getName();
				System.out.println("Name===>"+exname);
			}
		}
	}

	private void calTotal(List<SearchCSV> list, int rollNo) {
		// TODO Auto-generated method stub
		int j = 0;
		for (SearchCSV cs : list) {
			if (cs.getRollNo() == rollNo) {
				setLen(getLen() + 1);
				setSum(getSum() + cs.getSubjectMarks());
				System.out.println(cs.getSubject() + "=====>   " + cs.getSubjectMarks());
				j++;
			}
		}

	}

	private void overallResult(List<SearchCSV> list, int rollNo) {
		// TODO Auto-generated method stub
		int j = 0;
		for (SearchCSV cs : list) {

			if (cs.getRollNo() == rollNo) {

				if ((cs.getSubjectMarks() <= 100) && (cs.getSubjectMarks() >= 35)) {

					j++;
				}
			}
			if (j == getLen()) {
				setRes("PASS");
			} else {
				setRes("FAIL");

			}
		}
	}

	public ReadMarksSheet(String path, int rollNo) throws FileNotFoundException {
		setLen(0);
		setSum(0);
		setAverage(0.0);
		String line = "";
		readCsvFile(path, rollNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String path = "C:\\Users\\Win10\\Desktop\\marklist.csv";
			new ReadMarksSheet(path, 100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
