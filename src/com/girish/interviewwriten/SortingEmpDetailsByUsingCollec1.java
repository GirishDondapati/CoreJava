package com.girish.interviewwriten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.omg.CORBA.INTF_REPOS;

final class Employee
{	
	int empid; String name; int age;

	public Employee(int empid,String name,int age)
	 {  this.empid=empid;
	  	this.name=name;
	    this.age=age;
	 }
	  public int getEmpid()
	  { return empid; }
	  public void setEmpid(int empid) { this.empid = empid; } 
	  public String getname() { return name; } 
	  public void setname(String name) { this.name = name; }
	  public int getAge() { return age; } 
	  public void setAge(int age) { this.age = age; }

}

class Employee_CompWithName implements Comparator<Employee> 
{
@Override 
public int compare(Employee object1, Employee object2)
{ 
	return object1.getname().compareTo(object2.getname()); }
}


class Employee_CompWithAge implements Comparator<Employee> 
{
@Override 
	public int compare(Employee object1, Employee object2)
	{ 
		if(object1.getAge() > object2.getAge())
		{
		return -1;
		}
		if(object1.getAge() < object2.getAge())
		{
		return 1;
		}
		else
		return 0;
		
	}
}


public class SortingEmpDetailsByUsingCollec1
{
	

	public static void main(String a[])
	{ 
		List<Employee> list=new ArrayList<Employee>();

		  list.add(new Employee(33186,"zvarun",29)); 
		  list.add(new Employee(33187,"ldeepak",23)); 
		  list.add(new Employee(33188,"qapple",24));
		  list.add(new Employee(33189,"arohan",20));

		Collections.sort(list,new Employee_CompWithAge());

		for(int i=0;i<list.size();i++)
		{ 
			 System.out.print("age:"+list.get(i).getAge()+"  ");
			 System.out.print("empid:"+list.get(i).getEmpid()+" ");
			 System.out.println("name:"+list.get(i).getname()+" ");
	 	}
	 }
}

