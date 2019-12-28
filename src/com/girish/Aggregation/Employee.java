package com.girish.Aggregation;

public class Employee
{

	int id;
	String name;
	Address address;//aggregation
	public Employee(int id,String name,Address address) 
	{
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+address.city+"  "+address.state+"  "+address.country);
		//System.out.println(address.city+"  "+address.state+"  "+address.country);
	}
	public static void main(String[] args) 
	{
		Address ad1=new Address("tpt","AP","India");
		Address ad2=new Address("bang","kT","India");
		Employee e1=new Employee(111,"girish",ad1);
		Employee e2=new Employee(222,"king",ad2);
		e1.display();
		e2.display();

	}

}
