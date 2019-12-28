package com.girish.ExceptionHandling;

public class IntervviewException {
	public void m1()
	{
		int x=10/0;
		System.out.println("Outside of the method with out exception ");
		
	}
	
	

	public static void main(String[] args)
	{
		IntervviewException i=new IntervviewException();
		i.m1();
		try 
		{
			int x=10/0;
			System.out.println("try block");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer exception");
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Arithmetic exception called");
			//int x=10/0;
			System.out.println(e);
		}
		catch (Exception e) {
			int x=10/0;
			System.out.println("exception called");
			System.out.println(e);
		}
		finally
		{
			
			System.out.println("finally block ");
			//int x=10/0;
		}
		i.m1();

	}

}
