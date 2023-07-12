package com.seed.util;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.seed.employee.contract.TechContract;
import com.seed.employee.permanent.ProjectManager;
import com.seed.employee.permanent.TechPermanent;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class EmployeeCreationTest {
	

	@Test
	void test1() {
		ProjectManager pm = new ProjectManager("Winston", "New", "A", "04/12/2019", 15);
		TechPermanent tp = new TechPermanent("Harry", "New", "A", "04/12/2019", 10, 5);
		TechContract tc = new TechContract("Dan", "Parker", "C", "04/12/2019", 100, 50, "Adam");
		EmployeeCreation.addCert(pm, "PMI");
		EmployeeCreation.addCert(tp, "SCJP");
		EmployeeCreation.addCert(tp, "SCWCD");
		EmployeeCreation.addCert(tc, "SCBCD");
		
		EmployeeCreation.createEmployee(pm);
		EmployeeCreation.createEmployee(tp);
		EmployeeCreation.createEmployee(tc);
		assertEquals(pm.getSalary(), 150000);
		assertEquals(tp.getSalary(), 55000);
		assertEquals(tc.getSalary(), 6000);
		assertEquals(pm.getCoverage(), 150000);
		assertEquals(tp.getCoverage(), 110000);

		
		assertEquals(pm.toString(), "0 Winston New PM 15 years Certs: [PMI]");
		assertEquals(tp.toString(), "1 Harry New TA-P 10 years Certs: [SCJP, SCWCD]");
		assertEquals(tc.toString(), "Contractor: Adam Employee: Dan Parker TA-C Certs: [SCBCD]");
		

	}

}
