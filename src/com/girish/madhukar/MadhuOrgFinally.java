package com.girish.madhukar;

// madhu said right outside of try catch block any exception raised finally not executed 
public class MadhuOrgFinally {

	public static void main(String[] args) 
	{
		System.out.println("out side start");
		int i=10/0;
		System.out.println("out side end");
		
		try
		{
			System.out.println("inside try start");
			int j=10/0;
			System.out.println("inside try end");
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("catch exception arithmetic exc");
			
		}
		
		
		finally
		{
			System.out.println("finally block called");
		}

	}

}
