package com.girish.interviewtest;

public class TestInterview19 {

	
	public static void main(String[] args) 
	{
		try
		{
			int x=0;
			int y=5/x;
			System.out.println(y);
		}
		/*catch (ArithmeticException ae)
		{
			System.out.println(" cacth arthmetic exception");
		}*/
		catch(Exception e)
		{
			System.out.println("catch exception");
		}
		catch (ArithmeticException ae)
		{
			System.out.println(" cacth arthmetic exception");
		}
		System.out.println("finished");

	}

}
