package com.girish.facebook;

public class ExceptionHandling {

	
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Try Start  ");
			int i=9;
			String str="abc";
			int k=i/i-9;
			System.out.println(k);
			int j=Integer.parseInt(str);
			System.out.println(j);			
			System.out.println("try ended");			
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Exception catched");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("main ended");
		
	}

}
