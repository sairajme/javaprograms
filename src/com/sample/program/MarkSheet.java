package com.sample.program;

public class MarkSheet {
	
	
	private int sum, len;
	private double average;
	private String res;
	private String grade;
	

	public MarkSheet(int marks[]) {
		len = marks.length;
		sum = 0;
		int j = 0;
		for (int temp : marks) {
			sum = temp + sum;
		}

		for (int i = 0; i < len; i++) {
			if ((marks[i] <= 100) && (marks[i]) >= 35) {
				System.out.println("Result Subject " + marks[i] + " ===> PASSED");
				j++;
			} else {
				System.out.println("Result Subject " + marks[i] + " ===> FAILED");
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
		int marks[] = { 90, 90, 90, 90, 90 };
		new MarkSheet(marks);
		unitTestImplementation1 un = new unitTestImplementation1();
		un.unitTest();
		un.negativeUnitTest();

	}
}

class unitTestImplementation1 {

	

	public boolean unitTest() {
		System.out.println("\n");
		System.out.println("Unit Test Block..!");
		System.out.println("\n");
		int localmarks[] = { 50, 60, 70, 80, 90 };
		MarkSheet r1 = new MarkSheet(localmarks);
		
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
		int localmarks[] = { 50, 10, 35, 25, 90 };
		MarkSheet r1 = new MarkSheet(localmarks);
		boolean res1 = (r1.getTotal() == 210 && r1.calculateAverageMarks() == 42.0 &&  r1.getGrade() =="No Honor of Degree / Class for FAILED Student");
		if (res1 == true) {
			System.out.println("Negative Case Unit  Test is working ===>" + res1);
		} else {
			System.out.println("Negative Case Unit Test not working ===> " + res1);
		}
		return res1;
	}
}


