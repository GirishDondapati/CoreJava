package com.girish.ExceptionHandling;

public class CompaileTimeExceptionHandling 
{
	public CompaileTimeExceptionHandling()throws Exception
	{
		/*int i=1/0;
		System.out.println("Io Exception");*/
		try
		{
			int i=1/0;
			System.out.println("Io Exception");
		}
		catch(Exception e)
		{
			System.out.println("Try catch");
		}
		
	}

	
	public static void main(String[] args) throws Exception 
    {
		//Class.forName("java.lang.String");//It throws ClassNotFOundException so we need to handle by using throws or try catch
		CompaileTimeExceptionHandling c=new CompaileTimeExceptionHandling();
		
	}

}
