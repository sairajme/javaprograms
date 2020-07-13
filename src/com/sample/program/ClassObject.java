package com.sample.program;
import java.lang.reflect.*;
class Test11
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


public class ClassObject {
	
	public static void main(String args[])
	{
		Test11 T1 = new Test11();
		Class C1 = T1.getClass();
		
		
		Test11 T2 = new Test11();
		Class<? extends Test11> C2 = T2.getClass();
		
		System.out.println(C1.hashCode());
		System.out.println(C1.hashCode());
		
		System.out.println(C1==C2);
		
	}

}
