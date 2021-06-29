package com.hcl.OOP;

class Employee {
	String firstName, lastName;
	double salary;

	Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		if (salary <= 0) {
			salary = 0.0;
		}
		this.salary = salary;
	}

	void raiseSalary(double percentRaise) {
		if (this.salary > 0) {
			this.salary += (this.salary * percentRaise);
		}
	}
}
