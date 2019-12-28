package com.abcd.mypracties;

public class EqualsMethodTest {

	public static void main(String[] args)
	{
		Integer i= new Integer("10");
		if (i.toString() == i.toString())
		System.out.println("Equal");
		else
		System.out.println("Not Equal");
		
		if(i.hashCode()==i.hashCode())
		System.out.println("Equal");
		else
		System.out.println("Not Equal");

	}

}
