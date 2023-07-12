package com.seed.employee.contract;
public class TechContract extends Contract {

	public TechContract(String fName, String lName, String grade, String joinTime, double ratePerHr, double numHr,
			String contractorName) {
		super(fName, lName, grade, joinTime, ratePerHr, numHr, contractorName);
		// TODO Auto-generated constructor stub
		this.setSalary(this.calculateSalary());
		
	}
	
	public double calculateSalary() {
		if (this.numHr <=40) {
			return this.numHr * this.ratePerHr;
		} return 40 * this.ratePerHr + (this.numHr - 40) * this.ratePerHr * 2;
	}
	@Override
	public String toString() {
		return "Contractor: " + this.getContractorName()+  " Employee: " + 
	this.getfName() + " " + this.getlName() + " TA-C "
	+ "Certs: " + this.getCerts().toString();
	}
}
