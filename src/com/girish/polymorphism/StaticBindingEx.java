package com.girish.polymorphism;

class Test1245
{
	public static void add(int a,int b)
	{
		System.out.println("super class method");
		System.out.println(a+b);
	}
	public static void add(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}

}
public class StaticBindingEx extends Test1245
{
	public static void add(int a,int b)
	{
		System.out.println("sub class method");
		System.out.println(a+b);
	}
	public static void add(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}



	public static void main(String[] args) 
	{
		StaticBindingEx.add(10, 20);
		Test1245.add(30, 40);
		
		StaticBindingEx sb=new StaticBindingEx();
		sb.add(10, 20);
		
		Test1245 t1=new StaticBindingEx();
		t1.add(30, 40);

	}

}


/*
 * Compile time polymorphism (static binding or method overloading)
As the meaning is implicit, this is used to write the program in such a way, that flow of
 control is decided in compile time itself. It is achieved using method overloading.

In method overloading, an object can have two or more methods with same name,
 BUT, with their method parameters different. These parameters may be different on two bases:

1) Parameter type: Type of method parameters can be different.
 e.g. java.util.Math.max() function comes with following versions:

public static double Math.max(double a, double b){..}
public static float Math.max(float a, float b){..}
public static int Math.max(int a, int b){..}
public static long Math.max(long a, long b){..}
The actual method to be called is decided on compile time based on parameters passed to function in program.

2) Parameter count: Functions accepting different number of parameters. 
e.g. in employee management application, a factory can have these methods:

EmployeeFactory.create(String firstName, String lastName){...}
EmployeeFactory.create(Integer id, String firstName, String lastName){...}
Both methods have same name “create” but actual method invoked will be based on parameters passed in program.
 * 
 * 
 */
