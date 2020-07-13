package com.sample.program;

import java.util.ArrayList;
import java.util.List;

public class ArryExmple {
	int mul[] = {1,2,3,4};
	int total;
	String[] a = {"a","b","c","d"};
	
	char[] chars = {'a','b','c','d'};
	char[] chars1 = new char[4];
	void multiply()
	{
		for(int a:mul)
		{
			total = a*a;
			System.out.println(total);
		}
	}
	
	void charCopy()
	{
		for(char c:chars)
		{
			chars1=chars;
			System.out.println(chars1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArryExmple e = new ArryExmple();
		e.multiply();
		e.charCopy();
	}

}
