package com.girish.staticex;

public class StaticControlFlow 
{	static int i=10;
	static
	{
		m1();
		System.out.println("fisrt static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("main method");
	}
	public static void m1()
	{
		System.out.println("m1 mehod"+i+"  "+j);
	}
	static 
	{
		System.out.println("end static block");
	}
	static int j=20;
}
