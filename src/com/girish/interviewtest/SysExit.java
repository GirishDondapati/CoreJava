package com.girish.interviewtest;

public class SysExit {
	public static void main(String[] args) 
	{
		int i=10;
		int j=10;
		try 
		{	
			//System.exit(1);
			System.out.println("try block");
			
			int k=j/i;
			System.out.println("try block");
			System.exit(1);
			System.out.println(k);
				
		    //Code
		    System.exit(0);
		}
		catch (Exception ex)
		{
			System.out.println("catch block");
		    //Log the exception
		}
		finally 
		{
			System.out.println("finally block");
		    System.exit(1);  
		}
	}

}
