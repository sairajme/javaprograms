package com.sample.designPattern;

public interface ILoans {
	
	public double calculateInterest(double interest, double loanAmount, int tenurePeriod);
	
	public static void printInterfaceMessage()
	{
		System.out.println("This is from ILoans Interface..!");
	}
	
	public abstract void Print();
	

}
