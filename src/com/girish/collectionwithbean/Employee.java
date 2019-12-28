package com.girish.collectionwithbean;

public class Employee implements Comparable
{
	int empno;
	String ename;
	double sal;
	public Employee(int empno, String ename, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public double getSal() {
		return sal;
	}
	
	@Override
	public int compareTo(Object arg0) {
		Employee e=(Employee)arg0;
		if(e.sal>this.sal)
		{
			return -1;
		}
		else if(this.sal>e.sal)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	
	

}
