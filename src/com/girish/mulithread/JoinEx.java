package com.girish.mulithread;

public class JoinEx extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				//System.out.println(i);
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		JoinEx je=new JoinEx();
		JoinEx je1=new JoinEx();
		JoinEx je2=new JoinEx();
		je.start();
		System.out.println("je started");
		//je.yield();
		try {
			je.join(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("je end");
		//System.out.println("je1 started");
		je1.start();
		//System.out.println("je1 end");
		//System.out.println("je2 started");
		je2.start();
		//System.out.println("je2 end");
	}

}
