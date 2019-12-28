package com.girish.interviewtest;

class TryCatchFinallyTest1 implements Runnable 
{
	private void testMethod() throws InterruptedException
	{
		try
		{
			System.out.println("In try block");
			//throw new NullPointerException();
		}
		catch(NullPointerException npe)
		{
			System.out.println("In catch block");
		}
		finally
		{
			System.out.println("In finally block");
		}
	}
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("In finalize block");
		//super.finalize();
	}
	@Override
	public void run() 
	{
		try 
		{
			testMethod();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

	}

}
public class TestMain extends TryCatchFinallyTest1
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		for(int i=1;i<=3;i++)
		{
			new Thread(new TryCatchFinallyTest1()).start();
			Runtime.runFinalizersOnExit(true);
		}
	}
}