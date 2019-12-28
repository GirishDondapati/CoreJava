package com.girish.vijay;
// Employee Object
class Employee {
	public int emplId;
	public String empName;
	public double empSalary;

	public Employee(int emplId, String empName, double empSalary) {
		this.emplId = emplId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}