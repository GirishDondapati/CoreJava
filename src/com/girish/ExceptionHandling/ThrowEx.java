package com.girish.ExceptionHandling;

/*public class ThrowEx 
{	
	public static void main(String[] args)
	{
		int age=10;
		if(age<18)
			throw new ArithmeticException("not valid age");
		else
			System.out.println("eligible");
	}

}
*/

public class ThrowEx 
{	
	/*public static void main(String[] args)
	{
		System.out.println(10/0);
	}
	*/

	/*public static void main(String[] args)
	{
		throw new ArithmeticException("/by zero");
	}
	*/
	//above both main methods gives same exceptions 
	
	 static void fun()
	    {
	        try
	        {
	        	System.out.println("--------------Starting");
	            throw new NullPointerException("demo");
	        }
	        catch(NullPointerException e)
	        {
	            System.out.println("Caught inside fun().");
	           // throw e; // rethrowing the exception
	        }
	    }
	 
	    public static void main(String args[])
	    {
	        try
	        {
	            fun();
	        }
	        catch(NullPointerException e)
	        {
	            System.out.println("Caught in main.");
	        }
	    }

}
