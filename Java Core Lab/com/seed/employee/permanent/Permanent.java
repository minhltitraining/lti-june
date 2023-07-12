package com.seed.employee.permanent;
import com.seed.employee.Employee;

public class Permanent extends Employee {
	private int yearExp;
	public Permanent(String fName, String lName, String grade, String joinTime, int yearExp) {
		super(fName, lName, grade, joinTime);
		// TODO Auto-generated constructor stub
		this.yearExp = yearExp;
	}
	public int getYearExp() {
		return yearExp;
	}
	public void setYearExp(int yearExp) {
		this.yearExp = yearExp;
	}

}
