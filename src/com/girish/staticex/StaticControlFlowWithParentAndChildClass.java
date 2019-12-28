package com.girish.staticex;

public class StaticControlFlowWithParentAndChildClass {

	static int i=10;
	static
	{
		m1();
		System.out.println("Base class static block");
	}
	public static void main(String[] args) 
	{
		m1();
		System.out.println("Base class Main Method");
	}
	public static void m1()
	{
		System.out.println("Base class m1 method"+y);
	}
	static int y=20;

}
class DerivedClass extends StaticControlFlowWithParentAndChildClass
{
	static int i=10;
	static 
	{
		m2();
		System.out.println("derived class starting static method");
	}
	public static void main(String args[])
	{
		m2();
		System.out.println("drived class main method");
	}
	public static void m2()
	{
		System.out.println("derived class m2 method"+y);
	}
	static
	{
		System.out.println("derived class ending static block");
	}
	static int y=30;
}
