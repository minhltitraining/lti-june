package com.seed.employee.permanent;
import com.seed.util.MediClaim;

public class ProjectManager extends Permanent implements MediClaim {

	
	public ProjectManager(String fName, String lName, String grade, String joinTime, int yearExp) {
		super(fName, lName, grade, joinTime, yearExp);
		// TODO Auto-generated constructor stub
		this.setSalary(yearExp*10000);
		
	}

	@Override
	public double getCoverage() {
		// TODO Auto-generated method stub
		return this.getSalary();
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.getEmpId()) + " " + this.getfName() + " " + this.getlName() + " PM " 
	+ Integer.toString(this.getYearExp()) + " years"
	+ " Certs: " + this.getCerts().toString();
	}
	
}
