package com.girish.staticex;
public class StaticEx1 extends BaseClass
{	static int i=100;
	static 
	{
		m2();
		System.out.println("staticex1 class static block");
	}
	public static void m2()
	{
		System.out.println("m2 method called"  +i);
	}
	
	public static void main(String[] args)
	{
		m1();
		System.out.println("static main call");
		StaticEx1 se=new StaticEx1();
	}

	static
	{
		System.out.println("after call main method");
	}
	static int j=20;
}
