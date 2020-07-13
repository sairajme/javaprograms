package com.sample.designPattern;

public class CalculateEMI {
	
	ILoans selectLoan(String typeOfLoan)
	{
		try {
		
		ILoans loan=null;
		if(typeOfLoan.equalsIgnoreCase("Car Loan"))
		{
			loan = new CarLoan();
			System.out.println("You have Choosed Car Loan");
			
		}else if(typeOfLoan.equalsIgnoreCase("Housing Loan"))
		{
			loan=new HousingLoan();
			System.out.println("You have Choosed Housing Loan");
		}else if(typeOfLoan.equalsIgnoreCase("Personal Loan"))
			
		{
			loan=new PersonalLoan();
			System.out.println("You have Choosed Personal Loan");
		}
		else
		{
			System.out.println("Enter the Loan as Car Loan or Housing Loan or Personal Loan");
			
		}
		return loan;
		}catch(Exception  E)
		{
			System.out.println(E.getMessage());
		}
		finally
		{
			System.out.println("Executed..!");
			
		}
		return null;
		
		
	}

}
