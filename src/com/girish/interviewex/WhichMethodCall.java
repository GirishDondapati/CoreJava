package com.girish.interviewex;
class A
{
	public static void method()
	{
		System.out.println("A class method");
	}
}


public class WhichMethodCall extends A
{
	public static void method()
	{
		System.out.println("main class method");
	}

	
	public static void main(String[] args) 
	{
		A oa=new WhichMethodCall();
		oa.method();
	}

}
