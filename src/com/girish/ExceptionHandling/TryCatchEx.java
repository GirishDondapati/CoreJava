package com.girish.ExceptionHandling;

public class TryCatchEx
{	
	public static void main(String[] args)
	{
		System.out.println("Starting program");
		try
		{
			int a=5/0;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("end of program");

	}

}
