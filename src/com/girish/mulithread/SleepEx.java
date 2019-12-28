package com.girish.mulithread;

public class SleepEx extends Thread
{
	public void run()
	{
		System.out.println("Start run()");
		for(int i=0;i<=10;i++)
		{
			
			try
			{
				//System.out.println(i);
				//Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" --> "+i);
		}
		System.out.println("end run()");
	}
	
	public static void main(String[] args) 
	{
		SleepEx se=new SleepEx();
		SleepEx se1=new SleepEx();
		SleepEx se2=new SleepEx();
		System.out.println("se started");
		se.start();
		System.out.println("se end");
		System.out.println("je1 started");
		try {
			se.wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
		se1.start();
		System.out.println("se1 end");
		System.out.println("je2 started");
		se2.start();
		System.out.println("se2 end");
		
		//se.notify();
	}

}
