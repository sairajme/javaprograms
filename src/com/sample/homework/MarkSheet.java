package com.sample.homework;

import java.util.Arrays;
import java.util.List;

public class MarkSheet {
	
	
	private int sum;
	private int len;
	private double average;
	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	private String res;
	private String grade;
	
	public MarkSheet()
	{}

	
	public MarkSheet(List<Integer> arr) {
		len = arr.size();
		sum = 0;
		int j = 0;
		for (int temp : arr) {
			sum = temp + sum;
		}
		
		for(Integer m:arr)
		{
			if((m<=100) && (m>=35))
			 {
				System.out.println("Result Subject " + m + " ===> PASSED");
				j++;
			} else {
				System.out.println("Result Subject " + m + " ===> FAILED");
				j--;
			}
		}

		if (j == len) {
			res = "PASS";
		} else {
			res = "FAIL";
		}

		getTotal();
		printCalculatedTotalMarks();
		printAverageMarks();
		returnTheGrade();
	}

	public int getTotal() {
		return sum;

	}
	

	public int printCalculatedTotalMarks() {
		System.out.println("Total Marks is ===>" + sum);
		return sum;

	}

	Double calculateAverageMarks() {
		average = (double) (sum / len);
		return average;
	}

	public void printAverageMarks() {
		System.out.println("Average is ===>" + calculateAverageMarks());

	}

	String returnTheGrade() {

		
		System.out.println("Overall Result for All Subjects===>" + res);
		if ((average >= 75) && (res == "PASS")) {
			grade = "Pass With Distinction";
		} else if ((average < 75) && (average >= 60) && (res == "PASS")) {
			grade = "Pass With  First Class";
		} else if ((average < 60) && (average >= 50) && (res == "PASS")) {
			grade = "Pass With Second Class";
		} else if ((average < 50) && (average >= 35) && (res == "PASS")) {
			grade = "Pass With  Third Class";
		} else {
			grade = "No Honor of Degree / Class for FAILED Student";
		}
		System.out.println(grade);
		return grade;
	}
	
	String getGrade()
	{
		return grade;
	}

	public static void main(String args[]) {
		Integer marks[] = { 90, 90, 90, 90, 90 };
		List<Integer> arr = Arrays.asList(marks);
		new MarkSheet(arr);
		unitTestImplementation1 un = new unitTestImplementation1();
		un.unitTest();
		un.negativeUnitTest();

	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}
}

class unitTestImplementation1 {

	

	public boolean unitTest() {
		System.out.println("\n");
		System.out.println("Unit Test Block..!");
		System.out.println("\n");
        Integer localmarks[] = {  50, 60, 70, 80, 90 };
		List<Integer> arr = Arrays.asList(localmarks);
		MarkSheet r1 = new MarkSheet(arr);
		boolean res = (r1.getTotal() == 350 && r1.calculateAverageMarks() == 70.0 && r1.getGrade()=="Pass With  First Class");
		if (res) {
			System.out.println("Unit Test is working ===>" + res);
		} else {
			System.out.println("Unit Test not working ===> " + res);
		}
		return res;
	}

	public boolean negativeUnitTest() {
		System.out.println("\n");
		System.out.println("Negative Test Block..!");
		System.out.println("\n");
		Integer localmarks[] = {  50, 25, 70, 35, 90 };
		List<Integer> arr = Arrays.asList(localmarks);
		MarkSheet r1 = new MarkSheet(arr);
		boolean res1 = (r1.getTotal() == 210 && r1.calculateAverageMarks() == 42.0 &&  r1.getGrade() =="No Honor of Degree / Class for FAILED Student");
		if (res1 == true) {
			System.out.println("Negative Case Unit  Test is working ===>" + res1);
		} else {
			System.out.println("Negative Case Unit Test not working ===> " + res1);
		}
		return res1;
	}
}


