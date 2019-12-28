package com.girish.interviewtest;

import java.util.Arrays;

public class JoshBlochConstructor
{
	public JoshBlochConstructor(Object obj)
	{
		System.out.println("Object constructor called");
	}
	public JoshBlochConstructor(Arrays[] ara)
	{
		System.out.println("Arrays constructor called");
	}
	public JoshBlochConstructor(int ara)
	{
		System.out.println("Int constructor called");
	}
	public static void main(String[] args)
	{
		JoshBlochConstructor obj = new JoshBlochConstructor(null);
	}
}
