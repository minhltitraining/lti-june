package com.seed.util;
import java.util.ArrayList;

import com.seed.employee.Employee;

public class EmployeeCreation {
	private static int numEmployee = 0;
	private static ArrayList<Employee> employees = new ArrayList<>();
	

	public EmployeeCreation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static int getNumEmployee() {
		return numEmployee;
	}
	
	public static void createEmployee(Employee e) {
		int next_empId = numEmployee;
		numEmployee+=1;
		e.setEmpId(next_empId);
		employees.add(e);
	}
	
	public static Employee getEmployee(int empId){
		for (Employee e: employees) {
			if (e.getEmpId() == empId) {
				return e;
			}
		} return null;
	}
	
	public static void addCert(Employee e, String cert) {
		e.addCert(cert);
	}
}
