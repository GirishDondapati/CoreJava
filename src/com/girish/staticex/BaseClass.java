package com.girish.staticex;
class ParentE
{
	 static void m1(int  a)
	{
		System.out.println("m1 method from parent class");
		//return a;
	}
}
class ChlidE extends ParentE
{
	 static void m1(int  a)
	{
		System.out.println("m1 method from Chlid class");
		//return b;
	}
}

public class BaseClass
{
	
	public static void main(String[] args) {
		ParentE.m1(10);
		//=new  ChlidE();
		//System.out.println("--------"+c.m1(1));
		
	}
	/*static int x=10;
	static int y=9;
	static
	{
		m1();
		System.out.println("basic static block");
	}
	
	public static void m1()
	{
		System.out.println(y);
	}*/

}
