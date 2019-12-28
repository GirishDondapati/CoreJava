package com.girish.hcl;
/*
 * How to identify what class name used to create object 
 * we have to create one method, that method return type is boolean, 
 * we used super class reference to create object for sub class that method returns true 
 * If not means it returns false 
 */

class Test746
{
	public void method()
	{
		System.out.println("gfsffsbdbh");
	}
}


public class PrasanthClassNameIdentifiQues  extends Test746
{	
	public static void main(String[] args) 
	{
		Test746 t=new PrasanthClassNameIdentifiQues();
		t.method();

	}

}
