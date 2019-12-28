package com.girish.SuperKeyword;
class Vehicle1
{
	Vehicle1()
	{
		System.out.println("vehicle constructor call");
	}
}

public class SuperConstructorSec extends Vehicle1
{	
	public SuperConstructorSec()
	{
		super();
		System.out.println("SuperConstructorSec constructor call");
		//super();//Constructor call must be the first statement in a constructor
	}
	public static void main(String[] args)
	{
		SuperConstructorSec scs=new SuperConstructorSec();
		

	}

}
