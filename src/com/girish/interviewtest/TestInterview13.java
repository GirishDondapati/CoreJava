package com.girish.interviewtest;

abstract class A13
{
	abstract void a1();
	final void a2()
	{
		System.out.println("A13 abstract class a2 concreate method");
	}
}
class B13 extends A13
{
	void a1()
	{
		System.out.println("a1 method ");
	}
	  void a3()
	{
		//super.a2();		 
		System.out.println("B calss method");
	}
}

public class TestInterview13 extends B13 {

	
	public static void main(String[] args) {
		/*A13 oa=new B13();
		oa.a2();
		oa.a1();*/
		
		
		TestInterview13 t=new TestInterview13();
		t.a1();
		t.a2();
		t.a3();

	}

}
