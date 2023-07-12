package com.seed.employee;
import java.util.ArrayList;
import java.util.Date;

import com.seed.util.Certification;

public abstract class Employee implements Certification {
	private String fName;
	private String lName;
	private double salary;
	private String grade;
	private Date joinTime;
	private int empId;
	private ArrayList<String> certs;
	
	
	
	public Employee(String fName, String lName, String grade, String joinTime) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.grade = grade;
		joinTime = joinTime.replace('-', '/');
		this.joinTime = new Date(joinTime);
		this.certs = new ArrayList<>();
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
	
	public void setJoinDate(int date) {
		this.joinTime.setDate(date);
	}
	
	public void setJoinMonth(int month) {
		this.joinTime.setMonth(month - 1);
	}
	
	public void setJoinYear(int year) {
		this.joinTime.setYear(year);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", salary=" + salary + ", grade=" + grade
				+ ", joinTime=" + joinTime + ", empId=" + empId + "]";
	}
	
	
	public ArrayList<String> getCerts(){
		return this.certs;
	}
	
	public void addCert(String cert) {
		this.certs.add(cert);
	}
}
