package com.sample.program;
import java.lang.reflect.*;

class Test123
{
	
	public int add()
	{
		
	System.out.println("This is from Add");
	return 0;
	}

	public int sub()
	{
		
	System.out.println("This is from Subtraction");
	return 0;
	}
}

public class ChildClass {
	
		public static void main(String args[]) throws Exception
	{
		int count=0;
		Class c =  Class.forName("Test123");
		Method[] m = c.getDeclaredMethods();
		
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		
		System.out.println("Total Methods" +count);
	}
	
}
