package com.seed.employee.contract;
import com.seed.employee.Employee;

public class Contract extends Employee {
	
	
	protected double ratePerHr;
	protected double numHr;
	private String contractorName;
	
	public Contract(String fName, String lName, String grade, String joinTime, double ratePerHr, double numHr, String contractorName) {
		super(fName, lName, grade, joinTime);
		this.ratePerHr = ratePerHr;
		this.numHr = numHr;
		this.setSalary(ratePerHr*numHr);
		this.contractorName = contractorName;
	}

	public double getRatePerHr() {
		return ratePerHr;
	}

	public void setRatePerHr(double ratePerHr) {
		this.ratePerHr = ratePerHr;
	}

	public double getNumHr() {
		return numHr;
	}

	public void setNumHr(double numHr) {
		this.numHr = numHr;
	}

	public String getContractorName() {
		return contractorName;
	}

	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
}
