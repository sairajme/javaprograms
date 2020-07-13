package com.sample.designPattern;

public class CarLoan implements ILoans {
	double interest, loanAmount;
	int tenurePeriod;
	double emi;

	@Override
	public double calculateInterest(double r, double p, int t) {
		// TODO Auto-generated method stub
		this.interest = r;
		this.loanAmount = p;
		this.tenurePeriod = t;
		 r = r / (12 * 100); // one month interest 
	        t = t * 12; // one month period 
	        emi = (p * r * (float)Math.pow(1 + r, t))  
	                / (float)(Math.pow(1 + r, t) - 1);
		System.out.println("Entered Amount ===>   " + loanAmount + " Interest ===> " + interest	+ "   Loan Tenuer====>   " + tenurePeriod);
		System.out.println("EMI for the Entered Amount ===>  " + emi);
		return emi;
		

	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		
		System.out.println("This is called from Car Loan Class");
		
		}

	
}
