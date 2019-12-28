package com.girish.interviewtest;

class A181
{
	int x =10;
	public int m1()
	{
		System.out.println("It is Parent class m1 method");
		return 10;
	}
	public int m3()
	{
		System.out.println("It is Parent class m3 method");
		return 18;
	}
	private int m4()
	{
		System.out.println("It is Parent class m1 method");
		return 10;
	}
}
public class SynechronTechQues1 extends A181
{
	int x = 20;
	
	public int m1()
	{
		System.out.println("It is child class m1 method");
		return 4; 
	}
	
	public int m2()
	{
		System.out.println("It is child class m2 method");
		return 40; 
	}
	
	/*public double m3()
	{
		return 10.0;
	}*/

	private int m4()
	{
		System.out.println("It is Parent class m1 method");
		return 10;
	}
	
	public static void main(String[] args)
	{
		A181 obj = new SynechronTechQues1();
		System.out.println(obj.x);  // This will call super class veritable. It depends on reference
		System.out.println(obj.m1());
		
		//System.out.println(obj.m4());
		//If super class method is private. U can create same method in child class
		// as a override.but when if we create object with super class reference. By using that reference
		// If we call the m1() method it didn't compile If we create object with child class reference on that time 
		// it will work fine
		
		//Note 1: If we create class object with super class reference. Then by using that reference if call any method 
				// That method must and should available in super class with out private. If we didn't override that method
				// in child class then also it will work.
		
		
		//Note 2: We can't change the return type of the method in overriding time
	}

}
