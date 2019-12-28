package com.girish.SuperKeyword;
class Vehicle4
{
	void message()
	{
		System.out.println("vehicle4 class message method");
	}
}

public class SuperMethodCall extends Vehicle4
{	
	void message()
	{
		System.out.println("SuperMethodCall message method");
	}
	void display()
	{
		message();//current class method,this method is not available in this class then search parent class method will be executed
		super.message();//parent class method executed ...
	}
	public static void main(String[] args)
	{
		SuperMethodCall smc=new SuperMethodCall();
		smc.display();
		
	}

}
