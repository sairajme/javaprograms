package com.sample.program;

public class ReturnAvgandGrade {

	int sum, len;
	double average;
	String res;
	String grade;
	

	public int calculateTotalMarks(int marks[]) {
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

		printCalculatedTotalMarks();
		printAverageMarks();
		returnTheGrade();
		return sum;

	}

	public void printCalculatedTotalMarks() {
		System.out.println("Total Marks is ===>" + sum);

	}

	public double calculateAverageMarks() {
		average = (sum / len);
		return average;
	}

	public void printAverageMarks() {
		System.out.println("Average is ===>" + calculateAverageMarks());

	}

	public String returnTheGrade() {

		
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

	public static void main(String args[]) {
		int marks[] = { 90, 90, 90, 90, 90 };
		ReturnAvgandGrade r1 = new ReturnAvgandGrade();
		r1.calculateTotalMarks(marks);
		unitTestImplementation un = new unitTestImplementation();
		un.unitTest();
		un.negativeUnitTest();

	}
}

class unitTestImplementation {

	ReturnAvgandGrade r1 = new ReturnAvgandGrade();

	public boolean unitTest() {
		System.out.println("\n");
		System.out.println("Unit Test Block..!");
		System.out.println("\n");
		int localmarks[] = { 50, 60, 70, 80, 90 };
		boolean res = (r1.calculateTotalMarks(localmarks) == 350 && r1.calculateAverageMarks() == 70.0);
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
		boolean res1 = (r1.calculateTotalMarks(localmarks) == 210 && r1.calculateAverageMarks() == 42.0);
		if (res1 == true) {
			System.out.println("Negative Case Unit  Test is working ===>" + res1);
		} else {
			System.out.println("Negative Case Unit Test not working ===> " + res1);
		}
		return res1;
	}
}
