package com.girish.interviewtest;

public class TestInterview26
{
	public int add(int a, int b)
	{
		return a+b;
	}
}
public class TestInte extends TestInterview26 
{
	public int add(int a, int b)
	{
		return (a+b)*2;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}

	public static void main(String[] args)
	{
		TestInterview26 obj=new TestInte();//line no x
		System.out.println(obj.subtract(10,5));//line no Y
		
	}

}
