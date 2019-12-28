package com.girish.interviewtest;

class Person
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class SynechronTechQues2 {

	public static void main(String[] args)
	{
		Person p = new Person();
		p.setName("Giri");
		
		m1(p);
		System.out.println(p.getName());

	}
	
	public static void m1(Person p)
	{
		p = new Person();
		p.setName("Girish");
	}

}


