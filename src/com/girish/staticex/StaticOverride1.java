package com.girish.staticex;

public class StaticOverride1 
{
	final int x=10;
	static int y=20;
	
	public  static void method1()//if we declare method as a static then extends class also static method otherwise it throws 
	{
		System.out.println("this is parent class method1");
	}
	
	public  void method2()
	{
		System.out.println("this is parent class method2");
	}

}
