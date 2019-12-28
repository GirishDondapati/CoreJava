package com.girish.interviewtest;

public class TestInterview29 {
//polaris
	static
	{
		System.out.println("static block");
	}
	public TestInterview29()
	{
		System.out.println("Constructor method");
	}
	{
		System.out.println("instance block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterview29 ti=new TestInterview29();

	}

}
