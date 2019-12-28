package com.girish.madhukar;

import java.util.List;

public class Employee 
{

	private int empno;
	private String ename;
	private int sat;
	private List Depatment;
	
	public Employee(int empno, String ename, int sat, List depatment) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sat = sat;
		Depatment = depatment;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSat() {
		return sat;
	}
	public void setSat(int sat) {
		this.sat = sat;
	}
	public List getDepatment() {
		return Depatment;
	}
	public void setDepatment(List depatment) {
		Depatment = depatment;
	}
	
	
	
}
