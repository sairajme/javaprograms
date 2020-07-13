package com.sample.program;


class A
{
	
void Calling()
{
	
System.out.println("Calling from A Class");
}
}
public class ClassObj extends A{
	
	void Calling()
	{
		System.out.println("Calling from ClassObjClass");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object a = new ClassObj();
		 ((A) a).Calling();
		 

	}

}
