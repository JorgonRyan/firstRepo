package com.hcl.javaexercises.oop;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class EmployeeTest {
	Employee e1 = new Employee("joey", "joe", 100.0);
	Employee e2 = new Employee("joseph", "jose", 50.0);

	@Test
	public void testFirstName() {
		assertEquals("joey", e1.getFirstName());
		e1.setFirstName("bob");
		assertEquals("bob", e1.getFirstName());
	}

	@Test
	public void testLastName() {
		assertEquals("jose", e2.getLastName());
		e2.setLastName("bobby");
		assertEquals("bobby", e2.getLastName());
	}

	@Test
	public void testSalary() {
		assertEquals(50.0, e2.getSalary(), 0.01);
		e2.setSalary(20);
		assertEquals(20.0, e2.getSalary(), 0.01);
	}

	@Test
	public void testRaise() {
		e1.raiseSalary(.1);
		e2.raiseSalary(.1);
		assertEquals(55.0, e2.getSalary(), 0.01);
		assertEquals(110.0, e1.getSalary(), 0.01);
	}
}