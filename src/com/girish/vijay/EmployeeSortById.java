package com.girish.vijay;
import java.util.Comparator;

// sort by employee id
public class EmployeeSortById implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {

		if (emp1.emplId > emp2.emplId)
			return 1;
		else if (emp1.emplId < emp2.emplId)
			return -1;
		else
			return 0;

	}

}