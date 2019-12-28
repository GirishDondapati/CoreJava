package com.girish.collectionwithbean;
import java.util.Comparator;

// sort by employee id
public class EmployeeSortById implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {

		if (emp1.empno > emp2.empno)
			return 1;
		else if (emp1.empno < emp2.empno)
			return -1;
		else
			return 0;

	}

}