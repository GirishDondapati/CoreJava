package com.girish.polymorphism;

class A9334
{
	public int m1()
	{
		System.out.println("Parent m1 method");
		return 10;
	}
}
public class OverrideProblems //extends A9334
{
	private static A9334 obj;
	
	public int m1()
	{
		System.out.println("Child m1 method");
		//int i = super.m1();
		int i = obj.m1();
		return 10;
	}
	public static void main(String[] args)
	{
		//A9334 obj = new OverrideProblems();
		obj = new A9334();
		System.out.println(obj.m1());
	}
}
