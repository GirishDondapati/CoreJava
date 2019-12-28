package com.girish.interviewtest;

class Test88
{
	void show() //static void show() we can't override in extended class
	{
		System.out.println("Test show method");
	}
}
class  TestInterview6 extends Test88
{
	static void show()  //we can't hide the instant method
	{
		System.out.println("TestInterveiw static show method");
	}

	public static void main(String[] args) 
	{
		TestInterview6 ti=new TestInterview6();
		ti.show();

	}
}
