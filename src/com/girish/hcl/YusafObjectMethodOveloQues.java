package com.girish.hcl;

import java.util.HashSet;

/*
 * In below program we have four recods in that 101 reacard repeated again with same name
 * so no need to insert that record how it possible
 *   
 *   I said by ovveriding equals method 
 *   but here we have to override hashcode also 
 *   
 */
class Employeee {
	private int eis;

	public Employeee(int eis, String ename) {

		this.eis = eis;
		this.ename = ename;
	}

	private String ename;

	public int getEis() {
		return eis;
	}

	public void setEis(int eis) {
		this.eis = eis;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public boolean equals(Object o) {
		if (o instanceof Employeee) {
			return true;
		}
		Employeee e23 = (Employeee) o;
		if (e23.getEis() == this.getEis()&&e23.getEname().equals(this.getEname()))
			return true;
		else
		{
			return false;
		}
	}

	public int hashCode() {
		return this.getEis() + this.getEname().hashCode();
	}

}

public class YusafObjectMethodOveloQues {

	public static void main(String[] args) {

		Employeee e1 = new Employeee(101, "giri");
		Employeee e2 = new Employeee(102, "girish");
		Employeee e3 = new Employeee(103, "gidri");
		Employeee e4 = new Employeee(101, "giri");

		HashSet hs = new HashSet();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);

		for (Object object : hs) {
			Employeee e = (Employeee) object;
			System.out.println(e.getEis() + "  " + e.getEname());

		}

	}

}
