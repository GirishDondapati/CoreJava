package com.girish.interviewtest;

public class ManhattenFinally {

	
	public static void main(String[] args)
	{
		int n=5;
		try
		{
			
			if(n==5)
			{
				System.out.println("if loop call codition true");
				System.exit(1);
			}
			else
			{
				System.out.println("else satement");
				
			}
		
		}
		catch(Exception e)
		{
			System.out.println("catch block" +e);
		}
		finally
		{
			System.out.println("finally block executed");
		}
		
	}

}
