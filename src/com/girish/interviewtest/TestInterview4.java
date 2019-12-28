package com.girish.interviewtest;

public class TestInterview4
{
	public static void main(String[] args) 
	{
		String test="abc";
		test=test+test;
		System.out.println(test);
		
		//test.concat("def");//here concat means add the text to exsiting string but not change the S test value
		//test=test.concat("def");//its changed 
		//fist statement is examle for string immutable
		
		StringBuffer sb=new StringBuffer("abc");
		sb=sb.append(sb);
		sb.append(sb);//this is the example for mutable
		System.out.println(sb);
		
		
	}
}