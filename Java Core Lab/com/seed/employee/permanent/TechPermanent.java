package com.seed.employee.permanent;
import com.seed.util.MediClaim;

public class TechPermanent extends Permanent implements MediClaim{

	private int numCert;
	public TechPermanent(String fName, String lName, String grade, String joinTime, int yearExp, int numCert) {
		super(fName, lName, grade, joinTime, yearExp);
		this.numCert = numCert;
		// TODO Auto-generated constructor stub
		this.setSalary(yearExp*5000 + numCert*1000);
	}

	@Override
	public double getCoverage() {
		// TODO Auto-generated method stub
		return 2 * this.getSalary();
	}
	@Override
	public String toString() {
		return Integer.toString(this.getEmpId()) + " " + this.getfName() + " " + 
	this.getlName() + " TA-P " + Integer.toString(this.getYearExp()) + " years"
			+ " Certs: " + this.getCerts().toString();
	}
}
