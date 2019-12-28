package com.girish.ExceptionHandling;

public class TryFinallyEx
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
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
		}*/
		/*catch(NullPointerException e)
		{
			System.out.println(e);
		}*/
		finally
		{
			System.out.println("finally Executed");
		}
		System.out.println("end of program");

	}

}
