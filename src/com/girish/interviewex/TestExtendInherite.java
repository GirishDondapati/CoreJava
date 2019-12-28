package com.girish.interviewex;

public class TestExtendInherite extends ClassMethod  implements InterfaceMethod 
{
	public void method()
	{
		System.out.println("Interface method overrided");
	}
	public static void main(String args[])
	{
		TestExtendInherite t=new TestExtendInherite();
		t.method();
		t.methodclass();
	}
	
}
