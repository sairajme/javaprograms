package com.sample.program;

public class ProgMark {
	int sum, total;
	double average;
	String res;

	public int validEnteredMarks(int marks[]) {
		int len = marks.length;
		if (len == 5) {
			System.out.println("You have Entered 10th Standard Marks");
			for (int i = 0; i < len; i++) {
				if ((marks[i] <= 100) && (marks[i]) >= 0) {

					sum = sum + marks[i];
					
				} else {
					System.out.println(
							"Please enter 10th Std Marks which should be between 0-100!, Negative Numbers are not Allowed");
					System.exit(0);
				}
			}
		} else if (len == 6) {
			System.out.println("You have Entered 12th Standard Marks");
			for (int i = 0; i < len; i++) {

				if (marks[i] <= 200 && (marks[i]) >= 0) {
					sum = sum + marks[i];
					} else {
					System.out.println(
							"You have Entered 12th Standard Marks but the Marks should be between 0-200!, Negative Numbers are not Allowed");
					System.exit(0);
				}
			}
		} else {
			System.out.println("Please Enter Correct Count of Marks! Either 10th or 12");
			System.exit(0);
		}
		return total;
	}

	public int totalMarksScored()
	{
		System.out.println("Total Marks is ===>" + sum);
		return sum;
	}
	public int avg(int len) {
		if (len == 5) {
			average = sum / len;
			System.out.println("Average is ===>" + average);
		} else if (len == 6) {
			average = sum / (len * 2);
			System.out.println("Average is ===>" + average);
		} else {
			System.out.println("Please Enter Correct Count of Marks! Either 10th or 12");
		}
		return 0;
	}

	
	public int results(int marks[]) {
		int len = marks.length, j = 0;
		if (len == 5) {
			for (int i = 0; i < len; i++) {
				if ((marks[i] <= 100) && (marks[i]) >= 35) {
					System.out.println("Result Subject " + marks[i] + " ===> PASSED");
					j++;
				} else {
					System.out.println("Result Subject " + marks[i] + " ===> FAILED");
					j--;
				}
				if (j == 5) {
					res = "PASS";
				} else {
					res = "FAIL";
				}
			}
		} else if (len == 6) {
			for (int i = 0; i < len; i++) {
				if (marks[i] <= 200 && (marks[i]) >= 70) {
					System.out.println("Result Subject    " + marks[i] + "===> PASSED");
					j++;
				} else {
					System.out.println("Result Subject    " + marks[i] + " ===> FAILED");
					j--;
				}
				if (j == 6) {
					res = "PASS";
				} else {
					res = "FAIL";
				}
			}
		} else {
			System.out.println("Please Enter Correct Count of Marks! Either 10th or 12");
		}
		return total;
	}

	public String classofDegree() {

		System.out.println(res);
		if ((average >= 75) && (res == "PASS")) {
			System.out.println("Pass With Distinction");
		} else if ((average < 75) && (average >= 60) && (res == "PASS")) {
			System.out.println("Pass With  First Class");
		} else if ((average < 60) && (average >= 50) && (res == "PASS")) {
			System.out.println("Pass With Second Class");
		} else if ((average < 50) && (average >= 35) && (res == "PASS")) {
			System.out.println("Pass With  Third Class");
		} else {
			System.out.println("No Honor of Degree / Class for FAILED Student");
		}
		return null;

	}

	public static void main(String args[]) {
		int marks[] = { 20, 23, 1, 11, 11 };
		ProgMark pm = new ProgMark();
		pm.validEnteredMarks(marks);
		pm.totalMarksScored();
		pm.avg(marks.length);
		pm.results(marks);
		pm.classofDegree();

	}
}
