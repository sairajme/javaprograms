package com.sample.designPattern;

public class BankDashBoard {

	public static void main(String... args)
	{
	CalculateEMI e = new CalculateEMI();
	ILoans L = e.selectLoan("Car Loan");
	L.calculateInterest(14, 500000, 7);
	
	ILoans L1 = e.selectLoan("Housing Loan");
	L1.calculateInterest(9, 80000, 8);
	
	ILoans L2 = e.selectLoan("Personal Loan");
	L2.calculateInterest(16, 900000, 9);
	
	ILoans L3 = e.selectLoan("Jewel Loan");
	if(L3!=null)
	{
		L3.calculateInterest(10.8, 900000, 7);
	}
	
	
	
}}
