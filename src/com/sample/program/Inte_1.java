package com.sample.program;
abstract class abcClass extends ForLoop implements Inte_1,Inte_2 
{
	
	public  void add2()
	{
		System.out.println("This is from abcClass Interface and add Methond");
	}
	
	public  void add3()
	{
		System.out.println("This is from abcClass Interface and add1 Methond");
	}

	
}


public interface Inte_1  {

	public static void add()
	{
		System.out.println("This is from Inte_1 Interface and add Methond");
	}
	
	public default void add1()
	{
		System.out.println("This is from Inte_1 Interface and add1 Methond");
	}
}


 interface Inte_2 
{
	
	public static void add2()
	{
		System.out.println("This is from Inte_1 Interface and add Methond");
	}
	
	public default void add3()
	{
		System.out.println("This is from Inte_1 Interface and add1 Methond");
	}
	}
 
 
 