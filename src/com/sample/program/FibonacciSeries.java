package com.sample.program;

public class FibonacciSeries {
	public static void main(String are[]) {
		int n = 10, t1 = 0, t2 = 1;
		for (int i = 1; i <= n; ++i) {
			System.out.print(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}
}