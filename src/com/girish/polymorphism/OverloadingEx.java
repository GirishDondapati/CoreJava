package com.girish.polymorphism;

public class OverloadingEx
{
	public static float m1(double i)
	{
		System.out.println("m1 float type"+i);
		return 10f;
	}
	
	void m1(int i)
	{
		System.out.println("m1 int type "+i);
	}
	void m1(float i)
	{
		System.out.println("m1 double type");
	}
	
	public static void main(String[] args) 
	{
		OverloadingEx oe=new OverloadingEx();
		oe.m1(100);
		OverloadingEx.m1(10090.0);
		
	}
}
