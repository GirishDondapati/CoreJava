package com.girish.ExceptionHandling;

public class ReturnExceptionEx {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("try block");
			return;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic exception in catch");
		}
		finally
		{
			System.out.println("finally block executed");
		}
		
	}

}
