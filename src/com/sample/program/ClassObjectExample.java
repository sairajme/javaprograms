package com.sample.program;

 class Parent
{
	 int parentNo;
	 String parentName;
}

class ChildFirst extends Parent
{

	int childFirstNo;
	 int parentNo;
	String childFirstName;

}

class ChildSecond extends ChildFirst
{
int childSecondNo;
String childSecondFirstName;
}



public class ClassObjectExample{
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException
	{
		
		Parent p = new Parent();
		p.parentName="Sairaj";
		System.out.println(p.parentName);
		p.parentNo=12;
		System.out.println(p.parentNo);
		
		Parent p1 = new ChildFirst();
		p1.parentNo=120;
		p1.parentName="Parent";
		System.out.println(p1.parentNo);
		System.out.println(p1.parentName);
		
		Parent P2 = new ChildSecond();
		P2.parentNo =130;
		P2.parentName="Parent1";
		System.out.println(P2.parentNo);
		System.out.println(P2.parentName);
		
		
		ChildFirst c = new ChildSecond();
		c.parentNo=12;
		
		// Parent.class.newInstance().parentNo=12;
		c.parentName="Parent";
		c.childFirstNo=23;
		c.childFirstName="ChildFirst";
		
	
		
		
		
		
		
	}


}
