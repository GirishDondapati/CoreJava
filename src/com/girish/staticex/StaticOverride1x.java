package com.girish.staticex;

public class StaticOverride1x extends StaticOverride1
{	
	public void method1()
	{
		System.out.println("This is chaild class method1");
	}
	
	public void method2()
	{
		System.out.println("this is chaild class method2");
	}

	public static void main(String[] args) 
	{
		StaticOverride1x so=new StaticOverride1x();
		so.method1();
		so.method2();
				
		StaticOverride1 so1=new StaticOverride1x();
		so1.method1();
		so1.method2();


	}

}
