package com.girish.AbstractClass;
interface AB
{
	public void a();
	public void b();
	public void c();
	public void d();
}
abstract class B implements AB
{
	public void b()
	{
		System.out.println("i am b");
	}
}
class M extends B
{
	public void a()
	{
		System.out.println("i am a");
	}
	public void c()
	{
		System.out.println("i am c");
	}
	public void d()
	{
		System.out.println("i am d");
	}
}
public class InterfaceAbstract extends M
{
	public static void main(String args[])
	{
		M oa=new M();
		oa.a();
		oa.b();
		oa.c();
		oa.d();
		System.out.println("Very Nice");
		System.out.println("Very Nice2");
		
	}
	
}
