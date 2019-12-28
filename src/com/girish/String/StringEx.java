package com.girish.String;

import java.util.StringTokenizer;

public class StringEx {

	public static int x=10;
	/*
	 * if we call outside of the class as (int x=StringEx.x;) it loads total class how to identify 
	 * it total class is loaded means this class static block also executed so
	 * 
	 * we declare variable as final and intiate the value to the that variable as follows
	 * 
	 * then it will call particular variable from the class 
	 * 
	 * note: we cant call one method from class with out loading class 
	 */
	public final static int y=20;
	static
	{
		x=30;
		//y=50;
		System.out.println("this is static block so class loaded");
	}
	/*
	 * if we declare private constructor in our class we can't create object of that class in out side of the
	 * class it give this message(The constructor StringEx() is not visible)
	 */
	private StringEx()
	{
		System.out.println("if we dealare private we can't create object out side of the class");
	}
	public static final int m1()
	{
		System.out.println("It is final method called");
		return 40;
	}
	
	public static void main(String[] args) {

		String s1=new String("you canot change me");
		String s2=new String("you canot change me");
		System.out.println(s1==s2);
		String s3="you canot change me";
		String s4="you canot change me";
		System.out.println(s1.intern()==s2.intern());
		System.out.println(s3==s1);
		System.out.println(s3==s2.intern());
		System.out.println(s3==s4);
		
		System.out.println(s3.equals(s1));
		System.out.println(s3.equals(s4));
		
		StringTokenizer st = new StringTokenizer("abcsdueu eurhfjfjfsi jfhd j ej","a");
		
		
		

	}

}
