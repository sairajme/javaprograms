package com.sample.program;

class ClassA
{

	void Print()
	{
		System.out.println("Printing from ClassA");
	}

	
	//https://testleaf.webex.com/testleaf/j.php?MTID=m37b2235f1a0c4257ab399f4859646d72
	void bbb()
	{
		System.out.println("Printing from ClassA");
	}
}
public class Upcasting  extends ClassA
{

	void Print()
	{
	
		//super.Print();
		System.out.println("Printing from Upcasting");
	}
	public static void main(String...args)
	{
	ClassA cl = new Upcasting();
	
//cl.Print();
cl.Print();
	
Upcasting  up = new Upcasting();

up.Print();
	System.out.println(cl);
	}

}
