package com.girish.mulithread;

public class OneRunnable implements Runnable
{
	public void run()
	{
		System.out.println("runnable interface run method");
	}
	public void our()
	{
		
	}
	public static void main(String[] args)
	{
		OneRunnable or=new OneRunnable();
		Thread t=new Thread(or);
		t.start();
		
	}

}
