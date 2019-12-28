package com.girish.vijay;
import java.util.Comparator;


public class EmployeeSortBySal implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {

		if (emp1.empSalary > emp2.empSalary)
			return 1;
		else if (emp1.empSalary < emp2.empSalary)
			return -1;
		else
			return 0;

	}

}
