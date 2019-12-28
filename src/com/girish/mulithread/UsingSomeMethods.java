package com.girish.mulithread;

public class UsingSomeMethods extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
		//System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
		
		UsingSomeMethods usm=new UsingSomeMethods();
		UsingSomeMethods usm1=new UsingSomeMethods();
		//usm1.start();
		System.out.println("usm name:"+usm.getName());
		System.out.println("usm1 name:"+usm1.getName());
		System.out.println("usm name:"+usm.getName());
		usm.start();
		usm1.start();
		usm.setName("usm method");
		System.out.println("After change usm name:"+usm.getName());
		
	}

}
