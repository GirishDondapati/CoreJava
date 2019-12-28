package com.girish.interviewtest;

public class Test111
{
	Test111(int i)
	{
		System.out.println("Inside Test");
	}
}
public class TestInterview27 extends Test111
{
	public TestInterview27()
	{
		System.out.println("Inside Test sub class");
	}
	public static void main(String[] args) 
	{
		Test111 t=new TestInterview27();

	}

}
