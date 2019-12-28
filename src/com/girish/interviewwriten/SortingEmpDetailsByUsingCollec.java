package com.girish.interviewwriten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Emp implements Comparable<Emp> {

	private int EmpId;
	private String ename;
	private int sal;
	public Emp(int EmpId, String ename, int sal) {
		this.EmpId = EmpId;
		this.sal = sal;
		this.ename = ename;
	}

	public int getsal() {
		return sal;
	}

	public void setsal(int sal) {
		this.sal = sal;
	}

	public String getename() {
		return ename;
	}

	public void setename(String ename) {
		this.ename = ename;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}

	@Override
	public int compareTo(Emp o) {
		return this.EmpId> o.EmpId ? 1 : (this.EmpId < o.EmpId ? -1 : 0);
	}

	/*@Override
	public int compareTo(Emp o) {
		return this.sal> o.sal ? 1 : (this.sal < o.sal ? -1 : 0);
	}*/
	
	/*@Override
	public int compareTo(Emp o) {
		return this.ename> o.ename ? 1 : (this.ename<o.ename ? -1 : 0);
		//Error occur:The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
	}*/

	
	  

	/*
	 * public static class EmpByename implements Comparator<Emp> {
	 * 
	 * @Override public int compare(Emp o1, Emp o2) { return
	 * o1.ename.compareTo(o2.ename); } }
	 */

	/*
	 * @Override public String toString(){ return String.valueOf(EmpId); }
	 */
}


public class SortingEmpDetailsByUsingCollec {

	
		public static void main(String a[]) {
		Emp e1 = new Emp(101, "first", 10021);
		Emp e2 = new Emp(134, "last", 10022);
		Emp e3 = new Emp(111, "King", 10023);
		Emp e4 = new Emp(104, "King", 10024);
		Emp e5 = new Emp(108, "King", 10025);
		Emp e6 = new Emp(103, "King", 10026);
		Emp e7 = new Emp(109, "King", 10027);
		List<Emp> ts = new ArrayList<Emp>();
		ts.add(new Emp(101, "first", 10021));
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		ts.add(e7);
		System.out.println(ts);
		Collections.sort(ts );
		System.out.println(ts);
		for (int i = 0; i <= ts.size() - 1; i++) {
			System.out.print("Emp ID: " + ts.get(i).getEmpId() + "  ");
			System.out.print("Emp Name: " + ts.get(i).getename() + "  ");
			System.out.print("Emp Sal: " + ts.get(i).getsal() + "  ");
			System.out.println();
		}

		/*
		 * for(Emp e:ts){ System.out.println(e); }
		 * 
		 * Collections.sort(ts); for(Emp e:ts){ System.out.println(e); }
		 * System.out.println(ts);
		 */
	}
}


/*class Employee
  {	
  	int empid; String name; int age;
 
 	public Employee(int empid,String name,int age)
 	 {  this.empid=empid;
 	  	this.name=name;
 	    this.age=age;
 	 }
 	  	  public int getEmpid() { return empid; }
 	  public void setEmpid(int empid) { this.empid = empid; } 
 	  public String getname() { return name; } 
 	  public void setname(String name) { this.name = name; }
 	  public int getAge() { return age; } 
 	  public void setAge(int age) { this.age = age; }
 
  }
 
 class Employee_comparator implements Comparator<Employee> 
 {
 @Override 
 public int compare(Employee object1, Employee object2)
 { 
	return object1.getname().compareTo(object2.getname()); }
 }
 
 
 public class SortingEmpDetailsByUsingCollec 
 {
 
 	public static void main(String a[])
  	{ 
 		List<Employee> list=new ArrayList<Employee>();
 
		  list.add(new Employee(33186,"zvarun",29)); 
		  list.add(new Employee(33187,"ldeepak",23)); 
		  list.add(new Employee(33188,"qapple",24));
		  list.add(new Employee(33189,"arohan",20));
 
 		Collections.sort(list,new Employee_comparator());
 
 		for(int i=0;i<list.size();i++)
 		{ 
			 System.out.print("age:"+list.get(i).getAge()+"  ");
			 System.out.print("empid:"+list.get(i).getEmpid()+" ");
			 System.out.println("name:"+list.get(i).getname()+" ");
	 	}
	 }
 }
 */